package model;

public class Pici {
	private int IDPici;
	private String ImePici;
	
	
	public Pici(){
		super();
	}
	
	public Pici(String ImePici) {
		this.ImePici=ImePici;
		

	}
	public Pici(int IDPici, String ImePici){
		this.IDPici=IDPici;
		this.ImePici=ImePici;
	}

	public int getIDPici() {
		return IDPici;
	}

	public void setIDPici(int iDPici) {
		IDPici = iDPici;
	}

	public String getImePici() {
		return ImePici;
	}

	public void setImePici(String imePici) {
		ImePici = imePici;
	}
	
}
