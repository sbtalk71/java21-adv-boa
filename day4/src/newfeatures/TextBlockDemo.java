package newfeatures;

public class TextBlockDemo {

	public static void main(String[] args) {
		String post="{\r\n"
				+ "\"userId\": 2,\r\n"
				+ "\"id\": 20,\r\n"
				+ "\"title\": \"doloribus ad provident suscipit at\",\r\n"
				+ "\"body\": \"qui consequuntur ducimus possimus quisquam amet similique\\nsuscipit porro ipsam amet\\neos veritatis officiis exercitationem vel fugit aut necessitatibus totam\\nomnis rerum consequatur expedita quidem cumque explicabo\"\r\n"
				+ "}";
		
		
		String myPost="""
				{
				"userId": %d,
				"id": %d,
				"title": "doloribus ad provident suscipit at",
				"body": "qui consequuntur ducimus possimus quisquam amet similique\nsuscipit porro ipsam amet\neos veritatis officiis exercitationem vel fugit aut necessitatibus totam\nomnis rerum consequatur expedita quidem cumque explicabo"
				}
				""";
	String formatted=	String.format(myPost, 2,20);

		System.out.println(formatted);
	}
	
	

}
