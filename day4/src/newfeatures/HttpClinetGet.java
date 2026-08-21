package newfeatures;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class HttpClinetGet {

	public static void main(String[] args) throws Exception{
		
		HttpClient httpClient=HttpClient.newHttpClient();
		
		HttpRequest request=HttpRequest.newBuilder()
				.uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
				.GET()
				.build();
		
		HttpResponse<String> response=httpClient.send(request, BodyHandlers.ofString());
		
		System.out.println("Status of response: "+response.statusCode());
		System.out.println(response.body());
		
		

	}

}
