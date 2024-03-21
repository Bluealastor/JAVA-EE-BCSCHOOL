package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import configuration.HibernateUtil;


public class AcquirenteDAOImpl implements InterfacciaDAO {

	@Override
	public <Aquirente> void save(Aquirente tipo) {
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
	public <Acquirente> List<Acquirente> findAll() {
		List<Acquirente> listaAcquirente = new ArrayList<>();
		Session session = null;

		try {

			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

			session = sessionFactory.openSession();

			//SeCreatiDaJavaLaTabella il nome PerLaQuery deve avere laSintassiJAVA
			listaAcquirente = session.createQuery("FROM Acquirente").list();
			
			for(Acquirente gioco:listaAcquirente) {
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
		return listaAcquirente;
	}

	@Override
	public <T> T getOne(int pk) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void deleteOne(int pk) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void aggiornaName(int pk, String nuovotelefono) {
		// TODO Auto-generated method stub
		
	}





}
