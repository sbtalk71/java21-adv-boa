package interfaces.impl;

import interfaces.MyDBConnection;

public class PostGreSQLDB implements MyDBConnection{

	@Override
	public String getConnection() {
		
		return "PostGreSQL DB Connected";
	}

	@Override
	public String getDBInfo() {
		
		return "PostGresql 16";
	}
	
	@Override
	public boolean custerSuported() {
		return true;
	}

}
