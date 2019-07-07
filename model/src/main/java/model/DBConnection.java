package model;

import contract.ScriptRunner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;

/**
 * The Class DBConnection.
 *
 * @author jeremy
 */
public final class DBConnection {
	/** The instance. */
	private static DBConnection	INSTANCE	= null;

	private DBProperties dbProperties;
	
	/** The connection. */
	private Connection connection;

	/**
	 * Instantiates a new DB connection.
	 */
	private DBConnection() {
		this.open();
		executeScript("script_db.sql");
	}
	
	public DBConnection(String url, String login, String password) {
		
		dbProperties = new DBProperties();
		dbProperties.setUrl(url);
		dbProperties.setLogin(login);
		dbProperties.setPassword(password);
		this.open();
		executeScript("script_db.sql");
	}

	/**
	 * Gets the single instance of DBConnection.
	 *
	 * @return single instance of DBConnection
	 */
	public static synchronized DBConnection getInstance() {
		if (DBConnection.INSTANCE == null) {
			DBConnection.INSTANCE = new DBConnection();
		}
		return DBConnection.INSTANCE;
	}

	/**
	 * Open.
	 *
	 * @return the boolean
	 */
	private Boolean open() {
		 if (dbProperties == null)
	            dbProperties = new DBProperties();
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            this.connection = DriverManager.getConnection(dbProperties.getUrl(), dbProperties.getLogin(), dbProperties.getPassword());
	        } catch (final ClassNotFoundException | SQLException e) {
	            e.printStackTrace();
	        }
	        return true;
	}

	/**
	 * Gets the connection.
	 *
	 * @return the connection
	 */
	public Connection getConnection() {
		return this.connection;
	}
	
	public void executeScript(String file) {
		
		ScriptRunner runner = new ScriptRunner(this.connection, false, false);
        try {
            runner.runScript(new BufferedReader(new InputStreamReader(Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream(file)))));
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }

	}
}
