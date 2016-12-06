package model;

public class Rezervacija {
	private int IDRezervacija;
	private int IDKorisnik;
	private int IDRezervaciiMasi;
	private int IDRezervaciiSobi;
	private int IDMeni;
	
	
	public Rezervacija(){
		super();
	}
	
	public Rezervacija(int IDRezervacija, int IDKorisnik, int IDRezervaciiMasi, int IDRezervaciiSobi, int IDMeni) {
		this.IDRezervacija=IDRezervacija;
		this.IDKorisnik=IDKorisnik;
		this.IDRezervaciiMasi=IDRezervaciiMasi;
		this.IDRezervaciiSobi=IDRezervaciiSobi;
		this.IDMeni=IDMeni;
		

	}

	public int getIDRezervacija() {
		return IDRezervacija;
	}

	public void setIDRezervacija(int iDRezervacija) {
		IDRezervacija = iDRezervacija;
	}

	public int getIDKorisnik() {
		return IDKorisnik;
	}

	public void setIDKorisnik(int iDKorisnik) {
		IDKorisnik = iDKorisnik;
	}

	public int getIDRezervaciiMasi() {
		return IDRezervaciiMasi;
	}

	public void setIDRezervaciiMasi(int iDRezervaciiMasi) {
		IDRezervaciiMasi = iDRezervaciiMasi;
	}

	public int getIDRezervaciiSobi() {
		return IDRezervaciiSobi;
	}

	public void setIDRezervaciiSobi(int iDRezervaciiSobi) {
		IDRezervaciiSobi = iDRezervaciiSobi;
	}

	public int getIDMeni() {
		return IDMeni;
	}

	public void setIDMeni(int iDMeni) {
		IDMeni = iDMeni;
	}
	
}
