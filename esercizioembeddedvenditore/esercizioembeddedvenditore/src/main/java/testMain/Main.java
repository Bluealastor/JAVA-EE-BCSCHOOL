package testMain;



import dao.InterfacciaDAO ;
import dao.AcquirenteDAOImpl;
import dao.OrdineDAOImpl;
import dao.IndirizzoDAOImpl;


import entity.Acquirente;
import entity.Ordine;
import entity.Residenza;

public class Main {

	public static void main(String[] args) {
		InterfacciaDAO AcquirenteDAO = new AcquirenteDAOImpl();
		InterfacciaDAO OrdineDAO = new OrdineDAOImpl();
		InterfacciaDAO IndirizzoDAO = new IndirizzoDAOImpl();
		
//		Ordine ordine1 = new Ordine("2023-04-04", 22,2);
//		Residenza residenza1 = new Residenza("Via Sto cefalo", "05743", "Milano");
//		Acquirente acquirente1 = new Acquirente("TJDgfg£4", "Mario","Rossi","1324322",residenza1 ,ordine1);
//
//		OrdineDAO.save(ordine1);
//		AcquirenteDAO.save(acquirente1);
		
		
		AcquirenteDAO.findAll();
		
		
		

	}

}
