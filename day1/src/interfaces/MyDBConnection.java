package interfaces;

public interface MyDBConnection {

	String releaseVersion="1.0";
	
	String getConnection();
	
	String getDBInfo();
	
	public default boolean custerSuported() {
		System.out.println("Default method called private method "+privateMethod());
		throw new IllegalArgumentException(" Must implement the method...");
	};
	
	static void mystaticMethod() {
		
		System.out.println("This is a static method in interface..");
	}
	
	private String privateMethod() {
		return "from Private Method";
	}
}
