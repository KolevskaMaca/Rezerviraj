package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import model.Desert;
import model.Korisnik;
import model.Meni;
import model.Pici;
import model.Pijalok;
import model.Salati;
import model.Sendvici;
import model.Skara;
import model.TopliNapitoci;

public class MeniDao {
	private static Logger logger =	LogManager.getLogger(MeniDao.class);
	public List<TopliNapitoci> listajNapitoci() {
		List<TopliNapitoci> topliNapitoci = new ArrayList<>();
		try (DBkonekcija db = new DBkonekcija(); Connection konekcija = db.getConnection();) {
			logger.info("gi zema site topli napitoci od bazata");
			PreparedStatement preparedStatement = konekcija
					.prepareStatement("select * from OnlineRezervacija.dbo.TopliNapitoci");
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {

				TopliNapitoci napitoci = new TopliNapitoci();
				napitoci.setImeTopliNapitoci(resultSet.getString("ImeTopliNapitoci"));
				napitoci.setIDTopliNapitoci(resultSet.getInt("IDTopliNapitoci"));

				topliNapitoci.add(napitoci);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error("Greska vo MeniDao vo topli napitoci");
		}
		return topliNapitoci;
	}
	
	public List<Skara> listajSkara() {
		
		List<Skara> skara = new ArrayList<>();
		try (DBkonekcija db = new DBkonekcija(); Connection konekcija = db.getConnection();) {
			logger.info("Gi zema od bazata od Skara");
			PreparedStatement preparedStatement = konekcija
					.prepareStatement("select * from OnlineRezervacija.dbo.Skara");
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {

				Skara skaraobj = new Skara();
				skaraobj.setImeSkara(resultSet.getString("ImeSkara"));
				skaraobj.setIDSkara(resultSet.getInt("IDSkara"));

				skara.add(skaraobj);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error("Greska vo Meni Dao vo Skara");
		}
		return skara;
	}
	public List<Sendvici> listajSendvici() {
		List<Sendvici> sendvici = new ArrayList<>();
		try (DBkonekcija db = new DBkonekcija(); Connection konekcija = db.getConnection();) {
			logger.info("Se zemaat sendivicite od bazata");
			PreparedStatement preparedStatement = konekcija
					.prepareStatement("select * from OnlineRezervacija.dbo.Sendvici");
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {

				Sendvici sendviciobj = new Sendvici();
				sendviciobj.setImeSendvici(resultSet.getString("ImeSendvici"));
				sendviciobj.setIDSendvici(resultSet.getInt("IDSendvici"));

				sendvici.add(sendviciobj);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error("Greska vo MeniDao vo Sendvici");
		}
		return sendvici;
	}
	public List<Salati> listajSalati() {
		List<Salati> salati = new ArrayList<>();
		try (DBkonekcija db = new DBkonekcija(); Connection konekcija = db.getConnection();) {
			logger.info("Gi zema Salatite od bazata");
			PreparedStatement preparedStatement = konekcija
					.prepareStatement("select * from OnlineRezervacija.dbo.Salati");
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {

				Salati salatiobj = new Salati();
				salatiobj.setImeSalati(resultSet.getString("ImeSalati"));
				salatiobj.setIDSalati(resultSet.getInt("IDSalati"));

				salati.add(salatiobj);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return salati;
	}
	public List<Pijalok> listajPijalok() {
		List<Pijalok> pijalok = new ArrayList<>();
		try (DBkonekcija db = new DBkonekcija(); Connection konekcija = db.getConnection();) {
			
			PreparedStatement preparedStatement = konekcija
					.prepareStatement("select * from OnlineRezervacija.dbo.Pijalok");
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {

				Pijalok pijalokobj = new Pijalok();
				pijalokobj.setImePijalok(resultSet.getString("ImePijalok"));
				pijalokobj.setIDPijalok(resultSet.getInt("IDPijalok"));

				pijalok.add(pijalokobj);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pijalok;
	}
	public List<Pici> listajPici() {
		List<Pici> pici = new ArrayList<>();
		try (DBkonekcija db = new DBkonekcija(); Connection konekcija = db.getConnection();) {
			
			PreparedStatement preparedStatement = konekcija
					.prepareStatement("select * from OnlineRezervacija.dbo.Pici");
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {

				Pici piciobj = new Pici();
				piciobj.setImePici(resultSet.getString("ImePici"));
				piciobj.setIDPici(resultSet.getInt("IDPici"));

				pici.add(piciobj);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pici;
	}
	
	public List<Desert> listajDesert() {
		List<Desert> desert = new ArrayList<>();
		try (DBkonekcija db = new DBkonekcija(); Connection konekcija = db.getConnection();) {
			
			PreparedStatement preparedStatement = konekcija
					.prepareStatement("select * from OnlineRezervacija.dbo.Desert");
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {

				Desert desertobj = new Desert();
				desertobj.setImeDesert(resultSet.getString("ImeDesert"));
				desertobj.setIDDesert(resultSet.getInt("IDDesert"));

				desert.add(desertobj);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return desert;
	}
	
	public void vnesuvanje(String Ime, int IDTopliNapitoci, int IDPijalok, int IDSalati, int IDSendvici, int IDSkara, int IDDesert, int IDPici){
		

		try (
				DBkonekcija db=new DBkonekcija();
				Connection konekcija = db.getConnection();) {
			System.out.println("Konekcija Uspesna");
			
	PreparedStatement preparedStatement = konekcija.prepareStatement("insert into OnlineRezervacija.dbo.Meni(IDKorisnik, IDTopliNapitoci, IDPijalok, IDSalati, IDSendvici, IDSkara, IDDesert, IDPici) values ((select IDKorisnik from OnlineRezervacija.dbo.Korisnik where Ime=?),?,?,?,?,?,?,?)");
			preparedStatement.setString(1, Ime);
			preparedStatement.setInt(2, IDTopliNapitoci);
			preparedStatement.setInt(3, IDPijalok);
			preparedStatement.setInt(4, IDSalati);
			preparedStatement.setInt(5, IDSendvici);
			preparedStatement.setInt(6, IDSkara);
			preparedStatement.setInt(7, IDDesert);
			preparedStatement.setInt(8, IDPici);
			
			preparedStatement.executeUpdate();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
