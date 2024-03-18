package main;

import dao.InterfacciaDao;
import entity.GiocoDaTavola;
import entity.Partecipante;

import java.util.ArrayList;
import java.util.List;

import dao.GiocoDaTavolaDaoImpl;
import dao.PartecipanteDaoImpl;

public class Main {

	public static void main(String[] args) {
		InterfacciaDao giocoDao = new GiocoDaTavolaDaoImpl();
		InterfacciaDao partecipanteDao = new PartecipanteDaoImpl();
		
		List<GiocoDaTavola> listaGiochi = new ArrayList<>();
		List<Partecipante> listaPartecipanti = new ArrayList<>();
		
//	listaGiochi.add(new GiocoDaTavola("CarteUno", "Uno", 2, 10,8));
//		listaGiochi.add(new GiocoDaTavola("Forza4", "Forza4", 2, 8,12));
//		listaPartecipanti.add(new Partecipante("Mario", "Rossi",20));
//	listaPartecipanti.add(new Partecipante("Giuseppe", "verdi",30));
//		listaPartecipanti.add(new Partecipante("Angela", "Neri",22));
//		
//		
//	for (Partecipante gioco : listaPartecipanti) {
//	    giocoDao.salva(gioco);
//	}
//
//	for (GiocoDaTavola gioco : listaGiochi) {
//	    giocoDao.salva(gioco);
//	}
//		partecipanteDao.getAll();
//		partecipanteDao.getOne(2);
//		partecipanteDao.delete(1);
//		partecipanteDao.getAll();
//		partecipanteDao.aggiornaByname(2, "Mario");
//		partecipanteDao.getAll();
//		giocoDao.getAll();		
////		giocoDao.getOne("Uno");
//		giocoDao.delete("CarteUno");
//		giocoDao.getAll();	
		giocoDao.aggiornaByname("Forza4", "CarteDue");
		giocoDao.getAll();	
	}
	
	
}