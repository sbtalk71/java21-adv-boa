package interfaces;

import java.util.Optional;

import interfaces.impl.MySqlDBDriver2;
import interfaces.impl.OracleDBDriver;

public class App2 {

	public static void main(String[] args) {

		Optional<MyDBConnection> connOp = DriverFactory.getDriver("oracle");

		if(connOp.isPresent()) {
			MyDBConnection conn=connOp.get();
		System.out.println(conn.getConnection());

		System.out.println(conn.getDBInfo());
		}else {
			System.out.println("Driver not Supported...");
		}
		

	}

}
