/**
 * @author jeremy
 * @version 1.0
 */
package model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class DBConnectionTest {

	private DBConnection dbConnection = null;
	
	@Before
	public void setUp(){
		dbConnection = DBConnection.getInstance();
	}
	
	@After
	public void tearDown() {
		
	}
	
	@Test
	public void getConnection() {
		assertNotNull(this.dbConnection.getConnection());
	}
}
