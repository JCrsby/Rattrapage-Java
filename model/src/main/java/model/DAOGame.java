package model;

import java.sql.SQLException;

import java.sql.CallableStatement;
import java.sql.Connection;

public class DAOGame {

	/** The connection. */
	private final Connection connection;

	/**
	 * Instantiates a new DAO game.
	 *
	 * @param connection2
	 *          the connection
	 * @throws SQLException
	 *           the SQL exception
	 */
	public DAOGame(final Connection connection) throws SQLException {
		this.connection = connection;
	}

	/**
	 * Gets the connection.
	 *
	 * @return the connection
	 */
	protected Connection getConnection() {
		return this.connection;
	}
	
	public void pushGame(int Time, String Winner) {
		
		try {
			
			final String sql = "{call FINISH(?,?)}";
			final CallableStatement call = this.getConnection().prepareCall(sql);
			call.setInt(1, Time);
			call.setString(2, Winner);
			call.execute();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
