package com.mx.development.said.hibernate.lifecycle;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.engine.spi.Status;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.io.Serializable;
import java.util.List;
import static com.mx.development.said.hibernate.lifecycle.HibernateLifecycleUtil.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class HibernateLifecycleUnitTest {

    @BeforeClass
    public static void setup() throws Exception {
        HibernateLifecycleUtil.init();

    }

    @AfterClass
    public static void tearDown() throws Exception {
        HibernateLifecycleUtil.tearDown();
    }

    @Before
    public void beforeMethod() {
        DirtyDataInspector.clearDirtyEntitites();
    }

    @Test
    public void whenEntityLoaded_thenEntityManaged() throws Exception {
        SessionFactory sessionFactory = HibernateLifecycleUtil.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = startTransaction(session);

            boolean result = HibernateLifecycleUtil.getManagedEntities(session).isEmpty();
            assertTrue(result);

            List<FootballPlayer> players = session.createQuery("from FootballPlayer").getResultList();
            int size = HibernateLifecycleUtil.getManagedEntities(session).size();
            assertTrue(size==3);

            boolean isEmpty = DirtyDataInspector.getDirtyEntities().isEmpty();
            assertTrue(isEmpty==true);

            FootballPlayer gigiBuffon = players.stream().filter(p -> p.getId() == 3).findFirst().get();

            gigiBuffon.setName("Gianluigi Buffon");
            transaction.commit();

            size = DirtyDataInspector.getDirtyEntities().size();
            assertFalse(size == 3);

            long id = DirtyDataInspector.getDirtyEntities().get(0).getId();
            assertTrue(id==3L);

            boolean nameEquals = DirtyDataInspector.getDirtyEntities().get(0).getName().equalsIgnoreCase("Gianluigi Buffon");
            assertTrue(nameEquals);
        }
    }

    @Test
    public void whenDetached_thenNotTracked() throws Exception {
        SessionFactory sessionFactory = HibernateLifecycleUtil.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = startTransaction(session);

            FootballPlayer cr7 = session.get(FootballPlayer.class, 1L);

            boolean isOne = HibernateLifecycleUtil.getManagedEntities(session).size()==1;
            assertTrue(isOne);

            Serializable id = HibernateLifecycleUtil.getManagedEntities(session).get(0).getId();
            assertTrue(id.equals(cr7.getId()));

            session.evict(cr7);

            boolean isSizeZero = HibernateLifecycleUtil.getManagedEntities(session).size()==0;
            assertTrue(isSizeZero);

            cr7.setName("CR7");
            transaction.commit();

            boolean isEmpty = DirtyDataInspector.getDirtyEntities().isEmpty();
            assertTrue(isEmpty==true);
        }
    }

    @Test
    public void whenReattached_thenTrackedAgain() throws Exception {
        SessionFactory sessionFactory = HibernateLifecycleUtil.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = startTransaction(session);

            FootballPlayer messi = session.get(FootballPlayer.class, 2L);

            session.evict(messi);
            messi.setName("Leo Messi");
            transaction.commit();

            boolean isEmpty = DirtyDataInspector.getDirtyEntities().isEmpty();
            assertTrue(isEmpty);

            transaction = startTransaction(session);
            session.update(messi);
            transaction.commit();

            boolean isSizeOne = DirtyDataInspector.getDirtyEntities().size()==1;
            assertTrue(isSizeOne);

            boolean isLeoMessi = DirtyDataInspector.getDirtyEntities().get(0).getName().equalsIgnoreCase("Leo Messi");
            assertTrue(isLeoMessi);
        }
    }

    @Test
    public void givenNewEntityWithID_whenReattached_thenManaged() throws Exception {
        SessionFactory sessionFactory = HibernateLifecycleUtil.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = startTransaction(session);

            FootballPlayer gigi = new FootballPlayer();
            gigi.setId(3);
            gigi.setName("Gigi the Legend");

            session.update(gigi);

            boolean isSizeOne = HibernateLifecycleUtil.getManagedEntities(session).size()==1;
            assertTrue(isSizeOne);

            transaction.commit();
            isSizeOne = DirtyDataInspector.getDirtyEntities().size()==1;
            assertTrue(isSizeOne);
        }
    }

    @Test
    public void givenTransientEntity_whenSave_thenManaged() throws Exception {
        SessionFactory sessionFactory = HibernateLifecycleUtil.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = startTransaction(session);

            FootballPlayer neymar = new FootballPlayer();
            neymar.setName("Neymar");

            session.save(neymar);

            boolean sizeIsOne = HibernateLifecycleUtil.getManagedEntities(session).size()==1;
            assertTrue(sizeIsOne);

            Long value = neymar.getId();
            assertTrue(value != null);

            int count = queryCount("select count(*) from Football_Player where name='Neymar'");
            assertTrue(count == 0);

            transaction.commit();

            count = queryCount("select count(*) from Football_Player where name='Neymar'");
            assertTrue(count == 1);

            transaction = startTransaction(session);
            session.delete(neymar);
            transaction.commit();
        }
    }

    @Test()
    public void whenDelete_thenMarkDeleted() throws Exception {
        SessionFactory sessionFactory = HibernateLifecycleUtil.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = startTransaction(session);

            FootballPlayer neymar = new FootballPlayer();
            neymar.setName("Neymar");

            session.save(neymar);
            transaction.commit();

            transaction = startTransaction(session);
            session.delete(neymar);

            Status status = HibernateLifecycleUtil.getManagedEntities(session).get(0).getStatus();
            assertTrue(status.equals(Status.DELETED));
            transaction.commit();
        }
    }
}
