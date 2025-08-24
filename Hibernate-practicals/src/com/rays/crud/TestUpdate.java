package com.rays.crud;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestUpdate {

	public static void main(String[] args) {

		UserDTO dto = new UserDTO();

		dto.setId(1);
		dto.setFirstName("amit");
		dto.setLastName("rajpoot");
		dto.setLoginId("amitkirar11@gmai.com");
		dto.setPassword("amit1122");
		dto.setDob(new Date());
		dto.setAddress("indore");

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		session.update(dto);

		tx.commit();

		session.close();

	}

}
