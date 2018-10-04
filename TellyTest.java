import java.util.Scanner;

public class TellyTest {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		
		System.out.println("Please enter your name:  ");
		
		String name = "";
		
		in.nextLine();
		
		System.out.println("Please enter your phone number in the format xxxxxxxxxx:  ");
		
		String number= "xxxxxxxxxx";
		String sub = number.substring(0,3);
		String sub2 = number.substring(4,6);
		String sub3 = number.substring(7,10);
		
		System.out.printf("Name:          %20.2f", name);
		System.out.printf("Phone Number:          %20.2f", "(sub)-"+"(sub2)-"+"(sub3)");
		
		
	}
}
