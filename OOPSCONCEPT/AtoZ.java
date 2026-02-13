package OOPSCONCEPT;
import java.util.Scanner;
public class AtoZ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 ascii();
    }
    static void ascii() {
        for(char ch = 'A'; ch <= 'Z'; ch++) {
            ascii1(ch);
        }
    }
    static void ascii1(char ch) {
        int ascii = ch;
        System.out.println(ch + " = " + ascii);
	}

}
