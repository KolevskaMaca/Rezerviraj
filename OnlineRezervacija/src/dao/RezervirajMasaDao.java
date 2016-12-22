package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class RezervirajMasaDao {
	private static Logger logger = LogManager.getLogger(RezervirajMasaDao.class);

	public void vnesuvanje(String Ime, int broj) {

		logger.info("Pocetok na vnesuvanjeto za rezervacija na masa.");
		try (DBkonekcija db = new DBkonekcija(); Connection konekcija = db.getConnection();) {
			System.out.println("Konekcija Uspesna");
			PreparedStatement preparedStatement = konekcija.prepareStatement(
					"insert into OnlineRezervacija.dbo.RezervaciiMasi(IDKorisnik,BrojNaMasa) values ((select IDKorisnik from OnlineRezervacija.dbo.Korisnik where Ime=?),?)");
			preparedStatement.setString(1, Ime);
			preparedStatement.setInt(2, broj);

			preparedStatement.executeUpdate();
			logger.info("Zavrseno vnesuvanjeto za rezervacija na masa");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error("Greska pri vnesuvanjeto za rezervacija na masata.");
		}

	}

	public List<Integer> proverka() {
		List<Integer> masicki = new ArrayList<>();
		try (DBkonekcija db = new DBkonekcija(); Connection konekcija = db.getConnection();) {
			System.out.println("Konekcija Uspesna");
			PreparedStatement preparedStatement = konekcija
					.prepareStatement("select BrojNaMasa from OnlineRezervacija.dbo.RezervaciiMasi");

			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				masicki.add(resultSet.getInt("BrojNaMasa"));
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return masicki;
	}

}
