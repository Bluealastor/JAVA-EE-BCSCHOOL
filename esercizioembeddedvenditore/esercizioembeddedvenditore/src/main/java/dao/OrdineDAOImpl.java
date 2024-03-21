package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import configuration.HibernateUtil;
import entity.Ordine;

public class OrdineDAOImpl implements InterfacciaDAO{

	@Override
	public <Ordine> void save(Ordine tipo) {
		Session session = null;
		Transaction transaction = null;

		try{
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			session.save(tipo);
			
			transaction.commit();
		}catch(HibernateException e) {
			e.printStackTrace();
			transaction.rollback();
			
		}catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}finally {
			session.close();
		}
		
		
	}

	@Override
	public <Ordine> List<Ordine> findAll() {
		List<Ordine> listaOrdine = new ArrayList<>();
		Session session = null;

		try {

			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

			session = sessionFactory.openSession();

			//SeCreaDaJavaLaTabella il nome PerLaQuery deve avere laSintassiJAVA
			listaOrdine = session.createQuery("FROM Ordine").list();
			
			for(Ordine gioco:listaOrdine) {
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
		return listaOrdine;
	}

	
	@Override
	public List<Ordine> getOne(int pk) {
			List<Ordine> listaOrdine = new ArrayList<>();
			Session session = null;
			
			try {

				SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

				session = sessionFactory.openSession();

		        Query<Ordine> query = session.createQuery("FROM Ordine WHERE id LIKE :pk", Ordine.class);
		        query.setParameter("pk",pk );
		        listaOrdine = query.getResultList();

		        for(Ordine partecipante : listaOrdine) {
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

			return listaOrdine;
	}
	
	@Override
	public void deleteOne(int pk) {
		Transaction transaction = null;
		Session session = null;
		
		try {

			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			Ordine giocoDaEliminare = session.find(Ordine.class, pk);

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
	public void aggiornaName(int pk, String nuovaData) {

		Transaction transaction = null;
		Session session = null;
		try {

			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			// Trovo la persona nel database
			Ordine aggiornaOrdine = session.find(Ordine.class, pk);

			// cambio il nome della persona trovata
			aggiornaOrdine.setDataRichiesta(nuovaData);;
			
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
