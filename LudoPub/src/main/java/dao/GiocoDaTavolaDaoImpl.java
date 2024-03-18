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

public class GiocoDaTavolaDaoImpl implements InterfacciaDao {

	@Override
	public <T> void salva(T gioco) {
		Transaction transaction = null;
		Session session = null;
		
		try {

			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

			session = sessionFactory.openSession();

			transaction = session.beginTransaction();

			// rende persistente l'oggetto, si comporta similmente al save()
			session.persist(gioco);

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
		List<GiocoDaTavola> listaGiochi = new ArrayList<>();
		Session session = null;

		try {

			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

			session = sessionFactory.openSession();

			//SeCreatiDaJavaLaTabella il nome PerLaQuery deve avere laSintassiJAVA
			listaGiochi = session.createQuery("FROM GiocoDaTavola", GiocoDaTavola.class).list();
			
			for(GiocoDaTavola gioco:listaGiochi) {
				System.out.println(gioco);
			}


			
			session.close();
		} catch (HibernateException hibernateException) {
			System.out.println("Eccezione specifica di Hibernate durante la query");
			hibernateException.printStackTrace();

		} catch (Exception e) {
			System.out.println("Eccezione generica durante la query");
			e.printStackTrace();

		}
		
		
		
		return listaGiochi;
	}

	@Override
	public List<?> getOne(Object pk) {
		List<GiocoDaTavola> listaGiochi = new ArrayList<>();
		Session session = null;
		
		try {

			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

			session = sessionFactory.openSession();

	        Query<GiocoDaTavola> query = session.createQuery("FROM GiocoDaTavola WHERE nome_gioco LIKE :pk", GiocoDaTavola.class);
	        query.setParameter("pk","%" + pk + "%");
	        listaGiochi = query.getResultList();

	        if(listaGiochi.size() > 0){
		        for(GiocoDaTavola gioco : listaGiochi) {
		            System.out.println(gioco);
		        }
	        }else {System.out.println("Nessun Elemento Trovato");}

	        session.close();
		} catch (HibernateException hibernateException) {
			System.out.println("Eccezione specifica di Hibernate durante la query");
			hibernateException.printStackTrace();

		} catch (Exception e) {
			System.out.println("Eccezione generica durante la query");
			e.printStackTrace();

		}

		return listaGiochi;
	}

	@Override
	public void delete(Object pk) {
		Transaction transaction = null;
		Session session = null;
		
		try {

			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			GiocoDaTavola giocoDaEliminare = session.find(GiocoDaTavola.class, pk);

			// elimina la persona trovata con find()
			session.delete(giocoDaEliminare);

			
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
			GiocoDaTavola aggiornaNomeGioco = session.find(GiocoDaTavola.class, pk);

			// cambio il nome della persona trovata
			aggiornaNomeGioco.setCasaProduttrice(nuovoNome);;
			
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
