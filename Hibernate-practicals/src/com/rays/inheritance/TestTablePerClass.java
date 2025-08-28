package com.rays.inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestTablePerClass {

	public static void main(String[] args) {

		CreditCardPayment ccp = new CreditCardPayment();

		ccp.setAmount(1000);
		ccp.setPaymentType("imps");
		ccp.setCcType("visa");

		Cheque ch = new Cheque();

		ch.setAmount(2000);
		ch.setPaymentType("deposit");
		ch.setBankName("BOI");
		ch.setChqNumber("BOI100");

		Cash c = new Cash();

		c.setAmount(3000);
		c.setPaymentType("cash");

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		session.save(ccp);

		session.save(ch);

		session.save(c);

		tx.commit();

		session.close();

	}

}
