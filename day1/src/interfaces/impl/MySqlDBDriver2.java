package interfaces.impl;

import interfaces.MyDBConnection;

public class MySqlDBDriver2 implements MyDBConnection{

	@Override
	public String getConnection() {
		
		return "MySQl DB Connected";
	}

	@Override
	public String getDBInfo() {
		
		return "MySql Db 8.0";
	}

}
