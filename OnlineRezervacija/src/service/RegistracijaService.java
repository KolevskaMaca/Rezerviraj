package service;

import dao.RegistracijaDao;
import model.Korisnik;

public class RegistracijaService {
	
private RegistracijaDao registracijaDao;

public RegistracijaService (Korisnik korisnik){
	registracijaDao=new RegistracijaDao();
	registracijaDao.vnesuvanje(korisnik);	
}

public boolean uspesna(){
	return registracijaDao.zemiStatus()>0 ?true :false;
}

}
