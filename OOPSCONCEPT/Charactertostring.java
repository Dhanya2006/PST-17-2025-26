package ASCIIFUNCTION;

import java.util.Scanner;

public class Charactertostring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        System.out.print("Enter a character: ");
        char character = sc.next().charAt(0);
        char[] arr = new char[1];
        arr[0] = character;
		 
        String str = new String(arr);
        System.out.println("convert character to string: " + str);

        sc.close();
    }
}
