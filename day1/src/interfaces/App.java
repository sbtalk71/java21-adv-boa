package interfaces;

import interfaces.impl.MySqlDBDriver2;
import interfaces.impl.OracleDBDriver;

public class App {

	public static void main(String[] args) {

		MyDBConnection conn = new OracleDBDriver();

		System.out.println(conn.getConnection());

		System.out.println(conn.getDBInfo());

		
		conn = new MySqlDBDriver2();

		System.out.println(conn.getConnection());

		System.out.println(conn.getDBInfo());

	}

}
