package ASCIIFUNCTION;
import java.util.Scanner;
public class Asciicharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter ASCII value: ");
        int ascii = sc.nextInt();

        printCharacter(ascii);
    }
    public static void printCharacter(int ascii) {
        char ch = (char) ascii;
        System.out.println("Character for ASCII value " + ascii + " is: " + ch);
    }

}
