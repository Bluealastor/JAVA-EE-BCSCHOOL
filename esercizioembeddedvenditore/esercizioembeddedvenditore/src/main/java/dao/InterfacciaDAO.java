package dao;

import java.util.List;

public interface InterfacciaDAO {
	
	public <T >void save(T tipo);
	
	public <T> List<T> findAll();
	
	public <T> T getOne(int pk);
	
	public void deleteOne(int pk);
	
	public void aggiornaName(int pk, String nuovotelefono);

}
