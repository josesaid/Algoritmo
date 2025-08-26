package com.mx.development.said.hibernate;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.hibernate.Transaction;
import java.io.IOException;
import org.hibernate.Session;

import com.mx.development.said.hibernate.pojo.Product;
import com.mx.development.said.hibernate.pojo.Course;
import com.mx.development.said.hibernate.pojo.OrderEntry;
import com.mx.development.said.hibernate.pojo.OrderEntryIdClass;
import com.mx.development.said.hibernate.pojo.OrderEntryPK;
import com.mx.development.said.hibernate.pojo.Student;
import com.mx.development.said.hibernate.pojo.User;
import com.mx.development.said.hibernate.pojo.UserProfile;

import static org.junit.Assert.assertTrue;

public class IdentifiersIntegrationTest {
    private Session session;

    private Transaction transaction;

    @Before
    public void setUp() throws IOException {
        session = HibernateUtil.getSessionFactory()
            .openSession();
        transaction = session.beginTransaction();
    }

    @After
    public void tearDown() {
        transaction.rollback();
        session.close();
    }

    @Test
    public void whenSaveSimpleIdEntities_thenOk() {
        Student student = new Student();
        session.save(student);
        User user = new User();
        session.save(user);

        boolean isOne = student.getStudentId()==1L;

        assertTrue(isOne);
        assertTrue(user.getUserId()==4L);

        Course course = new Course();
        session.save(course);

    }

    @Test
    public void whenSaveCustomGeneratedId_thenOk() {
        Product product = new Product();
        session.save(product);
        Product product2 = new Product();
        session.save(product2);

        assertTrue(product2.getProdId().equals("prod-2"));
    }

    @Test
    public void whenSaveCompositeIdEntity_thenOk() {
        User user = new User();

        OrderEntryPK entryPK = new OrderEntryPK();
        entryPK.setOrderId(1L);
        entryPK.setProductId(30L);
        entryPK.setUser(user);

        OrderEntry entry = new OrderEntry();
        entry.setEntryId(entryPK);
        session.save(entry);


        assertTrue(entry.getEntryId().getOrderId()==1L);
    }

    @Test
    public void whenSaveIdClassEntity_thenOk() {
        User user = new User();

        OrderEntryIdClass entry = new OrderEntryIdClass();
        entry.setOrderId(1L);
        entry.setProductId(30L);
        entry.setUser(user);
        session.save(entry);

        assertTrue(entry.getOrderId()==1L);
    }

    @Test
    public void whenSaveDerivedIdEntity_thenOk() {
        User user = new User();
        session.save(user);

        UserProfile profile = new UserProfile();
        profile.setUser(user);
        session.save(profile);

        boolean areEquals = profile.getProfileId() == user.getUserId();
        assertTrue(areEquals);
    }

}
