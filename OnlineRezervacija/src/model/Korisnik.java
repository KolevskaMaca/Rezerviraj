package model;

public class Korisnik {

	private int IDKorisnik;
	private String Ime;
	private String Prezime;
	private String Email;
	private String Telefon;
	
	public Korisnik(){
		super();
	}
	
	public int getIDKorisnik() {
		return IDKorisnik;
	}
	public void setIDKorisnik(int iDKorisnik) {
		IDKorisnik = iDKorisnik;
	}
	public String getIme() {
		return Ime;
	}
	public void setIme(String ime) {
		Ime = ime;
	}
	public String getPrezime() {
		return Prezime;
	}
	public void setPrezime(String prezime) {
		Prezime = prezime;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getTelefon() {
		return Telefon;
	}
	public void setTelefon(String telefon) {
		Telefon = telefon;
	}
	
}
