package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.Korisnik;

public class RegistracijaDao {
private int uspesnaRegistracija;
	public RegistracijaDao() {

	}

	public void vnesuvanje(Korisnik korisnik) {

		try (
				DBkonekcija db=new DBkonekcija();
				Connection konekcija = db.getConnection();) {
			System.out.println("Konekcija Uspesna");
			PreparedStatement preparedStatement = konekcija
					.prepareStatement("insert into Korisnik(Ime,Prezime,Email,Telefon,Password) values (?,?,?,?,?)");
			preparedStatement.setString(1, korisnik.getIme());
			preparedStatement.setString(2, korisnik.getPrezime());
			preparedStatement.setString(3, korisnik.getEmail());
			preparedStatement.setString(4, korisnik.getTelefon());
			preparedStatement.setString(5, korisnik.getPassword());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
public int zemiStatus(){
	return uspesnaRegistracija;
}
}
