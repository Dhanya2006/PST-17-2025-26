package ASCIIFUNCTION;
import java.util.Scanner;
public class Integertostring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("enter a number:");
	            int a = sc.nextInt();

	            String str = "";

	            while (a > 0) {
	                int digit = a % 10;          
	                char ch = (char) ('0' + digit);
	                str = ch + str;
	                a = a / 10;
	            }

	            System.out.println("String value is: " + str);
	            sc.close();

	}

}
