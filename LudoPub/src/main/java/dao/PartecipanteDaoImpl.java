package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import configuration.HibernateUtil;
import entity.GiocoDaTavola;
import entity.Partecipante;

public class PartecipanteDaoImpl implements InterfacciaDao {

	@Override
	public <T> void salva(T partecipante) {
		Transaction transaction = null;
		Session session = null;
		
		try {

			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

			session = sessionFactory.openSession();

			transaction = session.beginTransaction();

			// rende persistente l'oggetto, si comporta similmente al save()
			session.persist(partecipante);

			transaction.commit();
			session.close();
		} catch (HibernateException hibernateException) {
			System.out.println("Eccezione specifica di Hibernate durante la query");
			hibernateException.printStackTrace();
			transaction.rollback();
		} catch (Exception e) {
			System.out.println("Eccezione generica durante la query");
			e.printStackTrace();
			transaction.rollback();
		}
		
	}

	@Override
	public List<?> getAll() {
		List<Partecipante> listaPersone = new ArrayList<>();
		Session session = null;

		try {

			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

			session = sessionFactory.openSession();

			listaPersone = session.createQuery("FROM Partecipante", Partecipante.class).list();
			
			
			for(Partecipante partecipante: listaPersone) {
				System.out.println( partecipante);
			}
			

			session.close();
		} catch (HibernateException hibernateException) {
			System.out.println("Eccezione specifica di Hibernate durante la query");
			hibernateException.printStackTrace();

		} catch (Exception e) {
			System.out.println("Eccezione generica durante la query");
			e.printStackTrace();

		}
		
		
		
		return null;
	}

	@Override
	public List<?> getOne(Object pk) {
		List<Partecipante> listaPartecipanti = new ArrayList<>();
		Session session = null;
		
		try {

			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

			session = sessionFactory.openSession();

	        Query<Partecipante> query = session.createQuery("FROM Partecipante WHERE id LIKE :pk", Partecipante.class);
	        query.setParameter("pk",pk );
	        listaPartecipanti = query.getResultList();

	        for(Partecipante partecipante : listaPartecipanti) {
	            System.out.println(partecipante);
	        }

	        session.close();
		} catch (HibernateException hibernateException) {
			System.out.println("Eccezione specifica di Hibernate durante la query");
			hibernateException.printStackTrace();

		} catch (Exception e) {
			System.out.println("Eccezione generica durante la query");
			e.printStackTrace();

		}

		return listaPartecipanti;
	}

	@Override
	public void delete(Object pk) {
		Transaction transaction = null;
		Session session = null;
		
		try {

			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			Partecipante PartecipanteDaEliminare= session.find(Partecipante.class, pk);

			// elimina la persona trovata con find()
			session.delete(PartecipanteDaEliminare);

			
			transaction.commit();
			
			
			session.close();
		} catch (HibernateException hibernateException) {
			System.out.println("Eccezione specifica di Hibernate durante la query");
			hibernateException.printStackTrace();

		} catch (Exception e) {
			System.out.println("Eccezione generica durante la query");
			e.printStackTrace();

		}
	}

	@Override
	public void aggiornaByname(Object pk, String nuovoNome) {
		
		Transaction transaction = null;
		Session session = null;
		try {

			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			// Trovo la persona nel database
			Partecipante aggiornaPartecipante = session.find(Partecipante.class, pk);

			// cambio il nome della persona trovata
			aggiornaPartecipante.setNome(nuovoNome);
			transaction.commit();

			session.close();
		} catch (HibernateException hibernateException) {
			System.out.println("Eccezione specifica di Hibernate durante la query");
			hibernateException.printStackTrace();

		} catch (Exception e) {
			System.out.println("Eccezione generica durante la query");
			e.printStackTrace();

		}
		
	}

}
