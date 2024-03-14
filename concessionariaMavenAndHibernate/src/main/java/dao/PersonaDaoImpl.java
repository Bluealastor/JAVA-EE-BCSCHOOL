package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.query.Query;

import configuration.HibernateUtil;
import entity.Persona;

public class PersonaDaoImpl implements InterfacciaDao<Persona> {

	@Override
	public List<Persona> findAll() {
		
		List<Persona> listaPersone = new ArrayList<>();
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			
			listaPersone = session.createQuery("FROM Persona", Persona.class).list();
			
			session.close();
			
		}catch(HibernateException e) {
			System.out.println("Problema Hibernate GetAll Persona");
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("Problema generico per la GettAll Persona");
			e.printStackTrace();
		}
		
		
		
		
		return listaPersone;
	}

	@Override
	public Persona findOne(int id) {
		Persona persona = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			
			
			Query<Persona> query = session.createQuery("from Persona where id = :id", Persona.class);
			query.setParameter("id", id);
			persona = query.getSingleResult();
			
			session.close();
			
		
		}catch(HibernateException e) {
				System.out.println("Problema Hibernate GetAll Autori");
				e.printStackTrace();
			}catch(Exception e) {
				System.out.println("Problema generico per la GettAll Autori");
				e.printStackTrace();
			}
		
		
		
		return persona;
	}

	@Override
	public void insertMany(List<Persona> listaPersona) {
		//SOLO PER INSERIRE i dati dobbiamo aprire una transaction
		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			//creiamo il forEach per salvare i dati
			for(Persona persona: listaPersona) {
				session.save(persona);
			}
			// diamo il commit per il salvataggio nel DB
			transaction.commit();
			
			session.close();
		
		}catch(ConstraintViolationException ConstraintViolationException) {
			System.out.println("Valore di chiave duplicata in Persona");
			ConstraintViolationException.printStackTrace();
			// INSERIRE IL ROLLBACK SE CI SONO PROBLEMI
			transaction.rollback();
		}
		catch(HibernateException e) {
			System.out.println("Problema Hibernate GetAll Persona");
			e.printStackTrace();
			// INSERIRE IL ROLLBACK SE CI SONO PROBLEMI
			transaction.rollback();
		}catch(Exception e) {
			System.out.println("Problema generico per la GettAll Persona");
			e.printStackTrace();
			// INSERIRE IL ROLLBACK SE CI SONO PROBLEMI
			transaction.rollback();
		}
		
		
	}

}
