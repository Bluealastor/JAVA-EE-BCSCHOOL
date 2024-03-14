package configuration;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//Classe di configurazione che serve ad HIBERNATE 
//per sapere su quale file(in questo caso è (hibernate.cfg.xml))
//prendere le configurazioni
public class HibernateUtil {

	//Importarlo da org.hibernate
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		if(sessionFactory == null)
			System.out.println("Sono entrato nella sessione");
			//Importare Configuration d org.hibernate.cfg
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

			return sessionFactory;
	}
	
	
}
