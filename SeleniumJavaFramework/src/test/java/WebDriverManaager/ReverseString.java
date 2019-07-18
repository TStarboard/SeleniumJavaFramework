package WebDriverManaager;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String s = "Selenium";
		
		int len = s.length(); // length = 8
		String rev = "";
		
		for(int i = len - 1; i >= 0; i--){
			rev = rev + s.charAt(i);
			
		}
		System.out.println(rev);
	}
}
