package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import configuration.HibernateUtil;

public class IndirizzoDAOImpl implements InterfacciaDAO{

	@Override
	public <Indirizzo> void save(Indirizzo tipo) {
		Session session = null;
		Transaction transaction = null;
		

		
		
		try {
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
	public <T> List<T> findAll() {
		// TODO Auto-generated method stub
		return null;
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
