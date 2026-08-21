package newfeatures;

import java.util.stream.Stream;

public class NewMethodsOfString {

	public static void main(String[] args) {
		String s1="";
		String s2="  ";
		String s3="  java  ";
		
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());
		System.out.println(s3.isEmpty());
		
		System.out.println("*-*".repeat(20));
		
		System.out.println(s1.isBlank());
		System.out.println(s2.isBlank());
		System.out.println(s3.isBlank());
		
		System.out.println(s3.strip()+" end");
		System.out.println(s3.stripLeading()+" end");
		System.out.println(s3.stripTrailing()+" end");
		
		
		String fileLines="""
				this is line1
				 this is line2
				   this is line3
				     lion king
				       tom and jerry
				""";
		Stream<String> lines=fileLines.lines();
		lines.forEach(System.out::println);
		
		//from Java 12
		
		System.out.println(fileLines.indent(5));
		
		System.out.println(fileLines.stripIndent());

	}

}
