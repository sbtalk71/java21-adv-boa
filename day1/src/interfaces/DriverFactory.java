package interfaces;

import java.util.Optional;

import interfaces.impl.MySqlDBDriver2;
import interfaces.impl.OracleDBDriver;
import interfaces.impl.PostGreSQLDB;

public class DriverFactory {

	public static Optional<MyDBConnection> getDriver(String driverName) {
		if(driverName.equals("oracle")) {
			return Optional.of(new OracleDBDriver());
		}else if (driverName.equals("mysql")) {
			return Optional.of(new MySqlDBDriver2());
		}else if(driverName.equals("postgres")) {
			return Optional.of(new PostGreSQLDB());
		}else {
			return Optional.empty();
		}
	}
}
