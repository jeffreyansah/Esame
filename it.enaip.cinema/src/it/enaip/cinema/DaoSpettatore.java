package it.enaip.cinema;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;


public class DaoSpettatore implements SpettatoreDao {

	
	private DaoSpettatore() {
	
	}
	
	private static class DaoSpettatoreSingletonHelper{
		private static final DaoSpettatore INSTACE= new DaoSpettatore();
	}
	
	public static DaoSpettatore getInstance() {
		return DaoSpettatoreSingletonHelper.INSTACE;
	}
	
	
	
	@Override
	public Optional<Spettatore> find(String id) throws SQLException {
	String sql=" SELECT idspettatore,nome,cognome,eta,birthDate,biglietto FROM spettatore WHERE idspettatore=?";
	int idspettatore=0;
	String nome="";
	String cognome="";
	int eta=0;
	Date birthDate=null;
	String biglietto="";
	Connection conn=DataSourceFactory.getInstance().getOracleDBConnection();
	try {
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, id);
		ResultSet resultSet = statement.executeQuery();
		if(resultSet.next()) {
			idspettatore=resultSet.getInt("idspettatore");
			nome=resultSet.getString("nome");
			cognome=resultSet.getString("cognome");
			eta=resultSet.getInt("eta");
			birthDate=resultSet.getDate("birthDate");
			biglietto=resultSet.getString("biglietto");
			
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}finally {
		conn.close();
	}
			
		return Optional.of(new Spettatore(idspettatore,nome,cognome,eta,birthDate,biglietto));
	}

	@Override
	public List<Spettatore> findAll() throws SQLException {
		List<Spettatore> listSpettatore=new ArrayList<Spettatore>();
		String sql=" SELECT idspettatore,nome,cognome,eta,birthDate,biglietto FROM spettatore" ;
		int idspettatore=0;
		String nome="";
		String cognome="";
		int eta=0;
		Date birthDate=null;
		String biglietto="";
		Connection conn=DataSourceFactory.getInstance().getOracleDBConnection();
		try {
			PreparedStatement statement = conn.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery(sql);
			if(resultSet.next()) {
				idspettatore=resultSet.getInt("idspettatore");
				nome=resultSet.getString("nome");
				cognome=resultSet.getString("cognome");
				eta=resultSet.getInt("eta");
				birthDate=resultSet.getDate("birthDate");
				biglietto=resultSet.getString("biglietto");
				Spettatore spettatore= new Spettatore(idspettatore,nome,cognome,eta,birthDate,biglietto);
				listSpettatore.add(spettatore);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			conn.close();
		}
		
		return listSpettatore;
	}

	@Override
	public boolean save(Spettatore speta) throws SQLException {
		String sql="INSERT INTO spettatore(nome,cognome,eta,birthDate,biglietto) VALUES(?,?,?,?,?)";
		boolean rigaInserita=false;
		Connection conn=DataSourceFactory.getInstance().getOracleDBConnection();
		try {
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, speta.getNome());
			statement.setString(2, speta.getCognome());
			statement.setInt(3, speta.getEta());
			statement.setDate(4, new java.sql.Date(speta.getBirthDate().getTime()));
			statement.setString(5, speta.getBiglietto());
			rigaInserita=statement.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			conn.close();
		}
		return rigaInserita;
	}

	@Override
	public boolean update(Spettatore speta) throws SQLException {
		String sql="UPDATE spettatore SET nome=?,cognome=?,eta=?,BirthDate=?,biglietto=? WHERE idspettatore=?";
		boolean rigaUpdate=false;
		Connection conn=DataSourceFactory.getInstance().getOracleDBConnection();
		try {
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, speta.getNome());
			statement.setString(2, speta.getCognome());
			statement.setInt(3, speta.getEta());
			statement.setDate(4, new java.sql.Date(speta.getBirthDate().getTime()));
			statement.setString(5, speta.getBiglietto());
			rigaUpdate=statement.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			conn.close();
		}
		return rigaUpdate;
	}

	@Override
	public boolean delete(Spettatore speta) throws SQLException {
	String sql="DELETE FROM spettatore WHERE idspettatore=?";
	boolean rigaDelete=false;
	Connection conn = DataSourceFactory.getInstance().getOracleDBConnection();
	try {
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setInt(1, speta.getIdSpettatore());
		rigaDelete = statement.executeUpdate() > 0;
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		conn.close();
	}

	return rigaDelete;
	}

}
