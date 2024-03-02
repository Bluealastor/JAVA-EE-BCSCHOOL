package Corse;

public class Pilota {
	
	private String nomePiloti;
	private Auto auto;
	
    public Pilota(String nome, Auto auto) {
        this.nomePiloti = nome;
        this.auto = auto;
    }
	
	public String getNomePiloti() {
		return nomePiloti;
	}
	public void setNomePiloti(String nomePiloti) {
		this.nomePiloti = nomePiloti;
	}

	public Auto getAuto() {
		return auto;
	}

	public void setAuto(Auto auto) {
		this.auto = auto;
	}
	

}
