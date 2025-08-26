package org.example;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.sql.Connection;
import java.sql.SQLException;

import static org.example.CreateRecordsExample.connection;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        new CreateRecordsExample().createRecords();
        new QueryClassesExample().queryDemo01();

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Transaction tx = sessionFactory.getCurrentSession().getTransaction();
        tx.begin();

        tx.commit();
        sessionFactory.close();
    }

}