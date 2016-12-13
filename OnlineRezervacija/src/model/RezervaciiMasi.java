package model;

public class RezervaciiMasi {
	private int IDRezervaciMasi;
	private int IDKorisnik;
	private int BrojNaMasa;
	private String Ime;
	
	public RezervaciiMasi(){
		super();
	}
	
	public RezervaciiMasi(String Ime,int BrojNaMasa){
		this.Ime=Ime;
		this.BrojNaMasa=BrojNaMasa;
	}
	public RezervaciiMasi(int IDKorisnik,int BrojNaMasa){
		this.IDKorisnik=IDKorisnik;
		this.BrojNaMasa=BrojNaMasa;
	}

	public int getIDRezervaciMasi() {
		return IDRezervaciMasi;
	}

	public void setIDRezervaciMasi(int iDRezervaciMasi) {
		IDRezervaciMasi = iDRezervaciMasi;
	}

	public int getIDKorisnik() {
		return IDKorisnik;
	}

	public void setIDKorisnik(int iDKorisnik) {
		IDKorisnik = iDKorisnik;
	}

	public int getBrojNaMasa() {
		return BrojNaMasa;
	}

	public void setBrojNaMasa(int brojNaMasa) {
		BrojNaMasa = brojNaMasa;
	}

	public String getIme() {
		return Ime;
	}

	public void setIme(String ime) {
		Ime = ime;
	}

}