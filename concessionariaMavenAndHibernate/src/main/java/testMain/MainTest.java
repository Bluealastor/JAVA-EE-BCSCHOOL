package testMain;

import java.util.ArrayList;
import java.util.List;

import dao.InterfacciaDao;
import dao.PersonaDaoImpl;
import dao.AutomobileDaoImpl;
import entity.Automobile;
import entity.Persona;

public class MainTest {
	
	public static void main(String[] args) {
		InterfacciaDao<Persona> personaDao = new PersonaDaoImpl();
//		List<Persona> listaPersona = new ArrayList<>();
//		listaPersona.add(new Persona("gino","paoli","Italia", "Cantautore", 70));
//		listaPersona.add(new Persona("Mario","Rossi","Italia", "Farmacista", 30));
//		listaPersona.add(new Persona("Giovanni","Neri","Wacanda", "Venditore", 40));
//		listaPersona.add(new Persona("Micael","Schumacher","Germania", "Pilota", 50));
//		listaPersona.add(new Persona("Valentino","Rossi","Italia", "Pilota", 45));
		
		InterfacciaDao<Automobile> automobileDao = new AutomobileDaoImpl();
		List<Automobile> listaAutomobile = new ArrayList<>();
		listaAutomobile.add(new Automobile("mercedes","Classe A", "AE000IO", "A1BCD0","Posteriore"));
		listaAutomobile.add(new Automobile("Ferrari","PuroSangue", "UY123IO", "A1BCD0","Posteriore"));
		listaAutomobile.add(new Automobile("Bugatti","Veiron", "AE000IO", "A1BCD0","Posteriore"));
		listaAutomobile.add(new Automobile("Lamborghini","Guntach", "AE000IO", "A1BCD0","Posteriore"));
		listaAutomobile.add(new Automobile("McLaren","750S", "AE000IO", "A1BCD0","Posteriore"));
//		personaDao.insertMany(listaPersona);
//		System.out.println(personaDao.findAll());
//		System.out.println(personaDao.findOne(6));
		
//		automobileDao.insertMany(listaAutomobile);
		System.out.println(automobileDao.findOne(2));
		System.out.println(automobileDao.findAll());

	}

}
