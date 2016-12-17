package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import model.RezervaciiMasi;
import model.TopliNapitoci;

public class RezervirajMasaDao {
	// private static Logger logger =
	// LogManager.getLogger(RezervirajMasaDao.class);
	public void vnesuvanje(String Ime, int broj) {

		// logger.info("this is a sample log message.");
		try (DBkonekcija db = new DBkonekcija(); Connection konekcija = db.getConnection();) {
			System.out.println("Konekcija Uspesna");
			PreparedStatement preparedStatement = konekcija.prepareStatement(
					"insert into OnlineRezervacija.dbo.RezervaciiMasi(IDKorisnik,BrojNaMasa) values ((select IDKorisnik from OnlineRezervacija.dbo.Korisnik where Ime=?),?)");
			preparedStatement.setString(1, Ime);
			preparedStatement.setInt(2, broj);
			// preparedStatement.setInt(1, rezervaciiMasi.getIDKorisnik());
			// preparedStatement.setInt(2, rezervaciiMasi.getBrojNaMasa());

			preparedStatement.executeUpdate();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
			// for(int i = 0; i < masicki.size(); i++) {
			// System.out.println(masicki.get(i).getBrojNaMasa());
			// }

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return masicki;
	}

}
