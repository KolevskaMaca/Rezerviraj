package model;

public class Pijalok {
	private int IDPijalok;
	private String ImePijalok;
	
	
	public Pijalok(){
		super();
	}
	
	public Pijalok(String ImePijalok) {
		this.ImePijalok=ImePijalok;
		

	}
	public Pijalok(int IDPijalok, String ImePijalok){
		this.IDPijalok=IDPijalok;
		this.ImePijalok=ImePijalok;
		
	}

	public int getIDPijalok() {
		return IDPijalok;
	}

	public void setIDPijalok(int iDPijalok) {
		IDPijalok = iDPijalok;
	}

	public String getImePijalok() {
		return ImePijalok;
	}

	public void setImePijalok(String imePijalok) {
		ImePijalok = imePijalok;
	}

}
