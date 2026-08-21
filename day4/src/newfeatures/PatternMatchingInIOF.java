package newfeatures;

public class PatternMatchingInIOF {

	public static void main(String[] args) {
		
		Object s1="Hello";
		
		if(s1 instanceof String) {
			String s2=(String)s1;
			System.out.println(s2.length());
		}
		
		if(s1 instanceof String s) {
			System.out.println(s.length());
		}

	}

}
