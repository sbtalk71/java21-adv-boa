package newfeatures;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FilesDemo {

	public static void main(String[] args) throws Exception{
		String content=Files.readString(Path.of("employees.txt"));
		System.out.println(content);
		
		
		String newContent="""
				
				5,Ranga,hyderabad,45000
				6,Raju,chennai,56000
				7,Kirthi,kolkata,67000
				8,Madan,hyderabad,68000
				""";

		//Files.writeString(Path.of("NewEmployee.txt"), newContent);
		
		Files.writeString(Path.of("employees.txt"), newContent, StandardOpenOption.WRITE, StandardOpenOption.APPEND);
		
		Files.lines(Path.of("employees.txt")).filter(line->line.contains("hyderabad")).forEach(System.out::println);
	}

}
