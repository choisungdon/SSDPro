package com.project.ssdpro;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;
import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTest {
	
	static {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testConnection() {
		final String URL = "jdbc:mariadb://127.0.0.1:3307/ssdpro?user=root&password=1234";
	

		try (
		Connection con = DriverManager.getConnection(URL)
				) 
		{
		log.info(con);
		if(con != null) {
		System.out.println("DB Connection Success!");
		}
		} catch (Exception e) {
		e.printStackTrace();
		fail(e.getMessage());
		}
	}

}
