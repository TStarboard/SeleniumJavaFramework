package WebDriverManaager;

public class ReverseInteger {
	
	public static void main(String [] args){
		
		int num = 12345;  // want to write in reverse 54321
		int rev = 0;
		
		while(num != 0){
			rev = rev *10 + num % 10;
			num = num / 10;
			
		}
		System.out.println("Revesrse num is :" + rev);
	}

}
