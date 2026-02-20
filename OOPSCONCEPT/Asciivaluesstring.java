package ASCIIFUNCTION;
import java.util.Scanner;
public class Asciivaluesstring {

	public static void main(String[] args) {
		String str = method();
        method1(str);            
    }
    static String method() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }
    static void method1(String str) {
        for(int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            int ascii = a;
            System.out.println(a + " = " + ascii);
        }

	}

}
