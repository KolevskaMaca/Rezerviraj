package service;

import dao.LoginDao;
import model.Korisnik;

public class LoginService {
	private LoginDao loginDao;
	 
	 // inicijaliziraj login dao, so email i password
	 public LoginService(String email, String password){
	  loginDao = new LoginDao(email, password);
	 }
	 
	 // proveri dali postoi korisnik so dadenite email i password
	 public boolean ProveriVoBaza(){
	  return loginDao.zemiStatus();
	 }
	 
	 // vrati korisnicki detali
	 public Korisnik ZemiDetali(){
	  return loginDao.zemiKorisnik();
	 }
	 

}
