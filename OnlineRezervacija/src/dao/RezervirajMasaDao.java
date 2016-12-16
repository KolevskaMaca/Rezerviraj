package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.RezervaciiMasi;



public class RezervirajMasaDao {
	
	public void vnesuvanje(String Ime,int broj) {

		try (
				DBkonekcija db=new DBkonekcija();
				Connection konekcija = db.getConnection();) {
			System.out.println("Konekcija Uspesna");
			PreparedStatement preparedStatement = konekcija.prepareStatement("insert into OnlineRezervacija.dbo.RezervaciiMasi(IDKorisnik,BrojNaMasa) values ((select IDKorisnik from OnlineRezervacija.dbo.Korisnik where Ime=?),?)");
			preparedStatement.setString(1,Ime);
			preparedStatement.setInt(2, broj); 
			//	preparedStatement.setInt(1, rezervaciiMasi.getIDKorisnik());
			//preparedStatement.setInt(2, rezervaciiMasi.getBrojNaMasa());
			
			preparedStatement.executeUpdate();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void proverka(String Ime){
		try (
			DBkonekcija db=new DBkonekcija();
			Connection konekcija = db.getConnection();) {
		System.out.println("Konekcija Uspesna");
		PreparedStatement preparedStatement = konekcija.prepareStatement("select BrojNaMasa from OnlineRezervacija.dbo.RezervaciiMasi");
				
		preparedStatement.executeUpdate();
	
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
	}

}
