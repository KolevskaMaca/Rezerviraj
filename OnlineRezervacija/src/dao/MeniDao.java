package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.TopliNapitoci;

public class MeniDao {
	public List<TopliNapitoci> listajNapitoci(){
List<TopliNapitoci> topliNapitoci = new ArrayList<>();
try(
	DBkonekcija db = new DBkonekcija();
	Connection konekcija = db.getConnection();)
	{
		System.out.println("Konekcija Uspesna");
		PreparedStatement preparedStatement = konekcija.prepareStatement("select * from OnlineRezervacija.dbo.TopliNapitoci");
		ResultSet resultSet = preparedStatement.executeQuery();
System.out.println(resultSet);
		while(resultSet.next()){
			TopliNapitoci napitoci=new TopliNapitoci();
			napitoci.setImeTopliNapitoci(resultSet.getString("ImeTopliNapitoci"));
		topliNapitoci.add(napitoci);
		}

	}catch(
	Exception e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
return topliNapitoci;
}
	} 
