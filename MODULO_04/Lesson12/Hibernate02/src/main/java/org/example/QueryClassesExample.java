package org.example;

import org.example.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import java.util.List;

public class QueryClassesExample {

    public void queryDemo01() {
        System.out.println("queryDemo01...");
        //Prep work
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        //HQL example - Get All USERS
        Transaction tx = session.beginTransaction();
        Query<User> query = session.createQuery("from User", User.class);
        List<User> userList = query.list();
        for(User user : userList){
            System.out.println("List of USERS::" + user.getId() + "," + user.getName() );
        }

        String hql2 = "from User where phone IN (:phone)";
        Query<User> query2 = session.createQuery( hql2, User.class);
        query2.setParameterList("phone", new String[] {"1112131415", ""});
        List<User> usersWithThatFound = query2.list();
        for (User u : usersWithThatFound){
            System.out.println("FOUND: user - ID " + u.getId()+", nombre: " + u.getName());
        }

        NativeQuery<User> query3 = session.createNativeQuery("select * from users", User.class);
        for (User u : query3.getResultList()){
            System.out.println("FOUND ALL: user - ID " + u.getId()+", nombre: " + u.getName());
        }

        //rolling back to save the test data
        tx.rollback();

        //closing hibernate resources
        sessionFactory.close();

    }


}
