package model;

public class Meni {


	private int IDMeni;
	private int IDTopliNapitoci;
	private int IDPijalok;
	private int IDSalati;
	private int IDSendvici;
	private int IDSkara;
	private int IDDesert;
	private int IDPici;
	private String Ime;
	
	public Meni(){
		super();
	}
	
	public Meni(String Ime, int IDTopliNapitoci, int IDPijalok, int IDSalati, int IDSendvici, int IDSkara, int IDDesert, int IDPici){
		super();
		this.Ime=Ime;
		this.IDTopliNapitoci=IDTopliNapitoci;
		this.IDPijalok=IDPijalok;
		this.IDSalati=IDSalati;
		this.IDSendvici=IDSendvici;
		this.IDSkara=IDSkara;
		this.IDDesert=IDDesert;
		this.IDPici=IDPici;

	}
	public Meni(int IDTopliNapitoci, int IDPijalok, int IDSalati, int IDSendvici, int IDSkara, int IDDesert, int IDPici){
		this.IDTopliNapitoci=IDTopliNapitoci;
		this.IDPijalok=IDPijalok;
		this.IDSalati=IDSalati;
		this.IDSendvici=IDSendvici;
		this.IDSkara=IDSkara;
		this.IDDesert=IDDesert;
		this.IDPici=IDPici;

	}

	public int getIDMeni() {
		return IDMeni;
	}

	public void setIDMeni(int iDMeni) {
		IDMeni = iDMeni;
	}

	public int getIDTopliNapitoci() {
		return IDTopliNapitoci;
	}

	public void setIDTopliNapitoci(int iDTopliNapitoci) {
		IDTopliNapitoci = iDTopliNapitoci;
	}

	public int getIDPijalok() {
		return IDPijalok;
	}

	public void setIDPijalok(int iDPijalok) {
		IDPijalok = iDPijalok;
	}

	public int getIDSalati() {
		return IDSalati;
	}

	public void setIDSalati(int iDSalati) {
		IDSalati = iDSalati;
	}

	public int getIDSendvici() {
		return IDSendvici;
	}

	public void setIDSendvici(int iDSendvici) {
		IDSendvici = iDSendvici;
	}

	public int getIDSkara() {
		return IDSkara;
	}

	public void setIDSkara(int iDSkara) {
		IDSkara = iDSkara;
	}

	public int getIDDesert() {
		return IDDesert;
	}

	public void setIDDesert(int iDDesert) {
		IDDesert = iDDesert;
	}

	public int getIDPici() {
		return IDPici;
	}

	public void setIDPici(int iDPici) {
		IDPici = iDPici;
	}

	public String getIme() {
		return Ime;
	}

	public void setIme(String ime) {
		Ime = ime;
	}
	
}
