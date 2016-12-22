package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import model.Korisnik;

public class RegistracijaDao {
	private static Logger logger =	LogManager.getLogger(RezervirajMasaDao.class);
private int uspesnaRegistracija;
	public RegistracijaDao() {

	}

	public void vnesuvanje(Korisnik korisnik) {
logger.info("Vnesuvanje vo baza pri registracija");
		try (
				DBkonekcija db=new DBkonekcija();
				Connection konekcija = db.getConnection();) {
			System.out.println("Konekcija Uspesna");
			PreparedStatement preparedStatement = konekcija.prepareStatement("insert into OnlineRezervacija.dbo.Korisnik(Ime, Prezime, Email, Telefon, Password) values (?,?,?,?,?)");
			preparedStatement.setString(1, korisnik.getIme());
			preparedStatement.setString(2, korisnik.getPrezime());
			preparedStatement.setString(3, korisnik.getEmail());
			preparedStatement.setString(4, korisnik.getTelefon());
			preparedStatement.setString(5, korisnik.getPassword());
			
			uspesnaRegistracija=preparedStatement.executeUpdate();
		logger.info("Korisnikot e registriran.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error("Greska pri vnesuvanjeto vo bazata.");
		}

	}
public int zemiStatus(){
	return uspesnaRegistracija;
}
}
