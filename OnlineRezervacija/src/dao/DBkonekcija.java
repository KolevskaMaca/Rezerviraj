package dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.tomcat.jdbc.pool.DataSource;

public class DBkonekcija implements AutoCloseable {
	protected Connection konekcija;
	
	public DBkonekcija(){
		try{
			InitialContext context=new InitialContext();
			DataSource dataSource=(DataSource) context.lookup("java:/comp/env/jdbc/OnlineRezervacija");
			konekcija = dataSource.getConnection();
		}
		catch(NamingException e){
			e.printStackTrace();
		} catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public Connection getConnection(){
		return konekcija;
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
