package WebDriverManaager;

public class RemoveCharacters {
	
	public static void main(String [] args){
		
		String s = "!@#$%^& test !@#$%^&* java";
		
		//Regular Expression: [^a-zA-Z0-9]
		
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
				
		
	}

}
