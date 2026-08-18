package interfaces.impl;

import interfaces.MyDBConnection;

public class OracleDBDriver implements MyDBConnection{

	@Override
	public String getConnection() {
		
		return "Oracle DB Connected";
	}

	@Override
	public String getDBInfo() {
		
		return "Oracle Db 14c";
	}

}
