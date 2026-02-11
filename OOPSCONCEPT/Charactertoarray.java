package ASCIIFUNCTION;
import java.util.Scanner;
public class Charactertoarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char character = sc.next().charAt(0);
		System.out.print("enter a character:");
		char[] arr = new char[1];
        arr[0] = character;

        System.out.println("convert character to array: " + arr[0]);

        sc.close();
	}

}
