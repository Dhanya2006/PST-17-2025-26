package OOPSCONCEPT;
import java.util.Scanner;
public class Sumstringascii {
	public static void main(String[] args) {
		String str = method();     
        int sum = method1(str);
        System.out.println("Sum of ASCII values = " + sum);
    }
    static String method() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name: ");
        return sc.nextLine();
    }
    static int method1(String str) {
        int a = 0;
        for (int i = 0; i < str.length(); i++) {
            a = a + str.charAt(i);
        }
        return a;
	}

	}