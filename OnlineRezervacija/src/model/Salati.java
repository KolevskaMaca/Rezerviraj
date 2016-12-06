package model;

public class Salati {
	private int IDSalati;
	private String ImeSalati;
	
	
	public Salati(){
		super();
	}
	
	public Salati(String ImeSalati) {
		this.ImeSalati=ImeSalati;
		

	}
	public Salati(int IDSalati, String ImeSalati){
		this.IDSalati=IDSalati;
		this.ImeSalati=ImeSalati;
		
	}

	public int getIDSalati() {
		return IDSalati;
	}

	public void setIDSalati(int iDSalati) {
		IDSalati = iDSalati;
	}

	public String getImeSalati() {
		return ImeSalati;
	}

	public void setImeSalati(String imeSalati) {
		ImeSalati = imeSalati;
	}

}
