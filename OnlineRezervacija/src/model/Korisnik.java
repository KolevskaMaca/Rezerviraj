package model;

public class Korisnik {

	private int IDKorisnik;
	private String Ime;
	private String Prezime;
	private String Email;
	private String Telefon;
	private String Password;
	
	public Korisnik(){
		super();
	}
	
	public Korisnik(String Ime, String Prezime, String Email, String Telefon, String Password){
		super();
		this.Ime=Ime;
		this.Prezime=Prezime;
		this.Email=Email;
		this.Telefon=Telefon;
		this.Password=Password;

	}
	public Korisnik(int IDKorisnik, String Ime, String Prezime, String Email, String Telefon, String Password){
		this.IDKorisnik=IDKorisnik;
		this.Ime=Ime;
		this.Prezime=Prezime;
		this.Email=Email;
		this.Telefon=Telefon;
		this.Password=Password;

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

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
	
}
