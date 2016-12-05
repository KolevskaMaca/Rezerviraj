package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.Korisnik;

public class LoginDao {
	
	 
	 private boolean uspesno;
	 private Korisnik korisnik;
	 
	 public LoginDao(String email, String password){
	  try(
	    DBkonekcija db = new DBkonekcija();
	    Connection konekcija = db.getConnection();){
	   
	   //Pripremi query, zemi ime, preizme, status[baniran ili ne], role[regular/admin]
	   PreparedStatement preparedStatement = konekcija.prepareStatement(""
	     + "select OnlineRezervacija.dbo.Korisnik.Ime, OnlineRezervacija.dbo.Korisnik.Prezime from OnlineRezervacija.dbo.Korisnik "
		     + "where (OnlineRezervacija.dbo.Korisnik.Email = ? and OnlineRezervacija.dbo.Korisnik.Password = ?)");
	   preparedStatement.setString(1, email);
	   preparedStatement.setString(2, password);
	   
	   // izvrsi query i prevzemi rezultati dokolku postojat
	   ResultSet resultSet = preparedStatement.executeQuery();
	    
	   // proveri korisnik
	   this.uspesno = resultSet.next();
	   if(uspesno){
	    korisnik = new Korisnik();
	    korisnik.setIme(resultSet.getString("ime"));
	    korisnik.setPrezime(resultSet.getString("prezime"));
	     }
	   
	  }catch(Exception e){
	   e.printStackTrace();
	  }
	 }
	 
	 // proveri uspesnost na login
	 public boolean zemiStatus(){
	  return uspesno;
	 }
	 
	 // vrati korisnik
	 public Korisnik zemiKorisnik(){
	  return korisnik;
	 }
	 
	

}
