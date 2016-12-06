package model;

public class MeniRezervacija {
	private int IDMeni;
	private int IDRezervacija;
	
	
	public MeniRezervacija(){
		super();
	}
	
	public MeniRezervacija(int IDMeni, int IDRezervacija) {
		this.IDMeni=IDMeni;
		this.IDRezervacija=IDRezervacija;
	
	}

	public int getIDMeni() {
		return IDMeni;
	}

	public void setIDMeni(int iDMeni) {
		IDMeni = iDMeni;
	}

	public int getIDRezervacija() {
		return IDRezervacija;
	}

	public void setIDRezervacija(int iDRezervacija) {
		IDRezervacija = iDRezervacija;
	}
	
}
