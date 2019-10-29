package fr.dalichamp.romain.utilities;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory sessionFactory;
    static{
        try {
            sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        } catch(Throwable th){
            System.err.println("Enitial SessionFactory creation failed"+th);
            throw new ExceptionInInitializerError(th);
        }
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}