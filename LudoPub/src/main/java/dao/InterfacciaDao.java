package dao;

import java.util.List;

public interface InterfacciaDao {

	public <T> void salva(T element);
	
	public List<?> getAll();
	
	public List<?> getOne(Object pk);
	
	public void delete(Object pk);
	
	public void aggiornaByname(Object pk, String nuovoNome);

	
}
