package PST;
import java.util.Scanner;
public class Palinogram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a string: ");
		String s = sc.nextLine();
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
		  rev = rev + s.charAt(i);
		  } if (s.charA+(0)==rev.charAt(0)) {
		     System.out.println("Palindrome");
		  } else {
		     System.out.println("Not a Palindrome");
		  }
		     sc.close();
		    }
		}