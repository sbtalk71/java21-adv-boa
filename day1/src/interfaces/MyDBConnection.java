package interfaces;

public interface MyDBConnection {

	String releaseVersion="1.0";
	
	String getConnection();
	
	String getDBInfo();
	
	public default boolean custerSuported() {
		throw new IllegalArgumentException(" Must implement the method...");
	};
}
