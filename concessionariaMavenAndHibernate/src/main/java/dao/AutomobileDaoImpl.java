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
import entity.Automobile;
import entity.Persona;

public class AutomobileDaoImpl implements InterfacciaDao<Automobile>{

	@Override
	public List<Automobile> findAll() {
		List<Automobile> listaAutomobile = new ArrayList<>();
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			
			listaAutomobile = session.createQuery("FROM Automobile", Automobile.class).list();
			
			session.close();
			
		}catch(HibernateException e) {
			System.out.println("Problema Hibernate GetAll Automobile");
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("Problema generico per la GettAll Automobile");
			e.printStackTrace();
		}
		return listaAutomobile;
	}

	@Override
	public Automobile findOne(int id) {
		Automobile automobile = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			
			
			Query<Automobile> query = session.createQuery("FROM Automobile WHERE id = :id", Automobile.class);
			query.setParameter("id",id);
			automobile = query.getSingleResult();
			session.close();
			
		
		}catch(HibernateException e) {
				System.out.println("Problema Hibernate GetAll Autori");
				e.printStackTrace();
			}catch(Exception e) {
				System.out.println("Problema generico per la GettAll Autori");
				e.printStackTrace();
			}
		
		return automobile;
	}

	@Override
	public void insertMany(List<Automobile> listaAutomobile) {
		//SOLO PER INSERIRE i dati dobbiamo aprire una transaction
				Transaction transaction = null;
				try {
					SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
					Session session = sessionFactory.openSession();
					transaction = session.beginTransaction();
					
					//creiamo il forEach per salvare i dati
					for(Automobile automobile: listaAutomobile) {
						session.save(automobile);
					}
					// diamo il commit per il salvataggio nel DB
					transaction.commit();
					
					session.close();
				
				}catch(ConstraintViolationException ConstraintViolationException) {
					System.out.println("Valore di chiave duplicata in Automobile");
					ConstraintViolationException.printStackTrace();
					// INSERIRE IL ROLLBACK SE CI SONO PROBLEMI
					transaction.rollback();
				}
				catch(HibernateException e) {
					System.out.println("Problema Hibernate GetAll Automobile");
					e.printStackTrace();
					// INSERIRE IL ROLLBACK SE CI SONO PROBLEMI
					transaction.rollback();
				}catch(Exception e) {
					System.out.println("Problema generico per la GettAll Automobile");
					e.printStackTrace();
					// INSERIRE IL ROLLBACK SE CI SONO PROBLEMI
					transaction.rollback();
				}
				
				
		
	}

}
