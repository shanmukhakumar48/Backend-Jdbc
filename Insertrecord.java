package com.tmf.eps.backend;

import com.tmf.eps.backend.models.*;
import java.sql.Connection;
import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Insertrecord {

	public static void main(String[] args) {

		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Employee emp = new Employee("sai","sai@1234","sai@gmail.com","RK BEACH","Male",10001,9705859562L);
		Session session = sf.openSession();
		Transaction tx=session.beginTransaction();
		session.save(emp);
		tx.commit();
		session.close();
		System.out.print("Data has been saved suceessfully");
	}

}

