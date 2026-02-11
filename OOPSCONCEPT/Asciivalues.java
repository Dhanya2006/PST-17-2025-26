package OOPSCONCEPT;
import java.util.Scanner;
public class Asciivalues {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        Ascii(ch);
    }
    public static void Ascii(char ch) {
        int ascii = ch;  
        System.out.println("ASCII value of " + ch + " is: " + ascii);
    }
	}