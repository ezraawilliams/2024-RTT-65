package org.ezrawilliams.controller;

import org.ezrawilliams.model.Department;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DepartmentController {
    public static void main(String[] args) {
        //Build from our configuration:
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        //call the addDepartment method:
        addDepartment(factory, session);


        //close:
        factory.close();
        session.close();
    }

    public static void addDepartment(SessionFactory sessionFactory, Session session) {
        Transaction transaction = session.beginTransaction();
        Department department = new Department();
        department.setName("Computer Science");
        department.setState("Georgia");

        //save to the database:
        session.persist(department);
        transaction.commit();
        sessionFactory.close();
        session.close();
    }
}
