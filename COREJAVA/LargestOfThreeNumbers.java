package PST2; 
import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number:");
		int a =sc.nextInt();
		System.out.print("Enter Second Number:");
		int b= sc.nextInt();
		System.out.print("Enter Third Number:");
		int c = sc.nextInt();
		if (a >= b && a >= c) {
            System.out.println("Largest number is: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Largest number is: " + b);
        } else {
            System.out.println("Largest number is: " + c);
        }

        sc.close();
		
		
		
}

}
