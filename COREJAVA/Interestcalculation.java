package PST;
import java.util.Scanner;
public class Interestcalculation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter Principal (P): ");
	        double P = sc.nextDouble();
	        System.out.print("Enter r values: ");
	        double R = sc.nextDouble();
	        System.out.print("Enter t values: ");
	        double T = sc.nextDouble();
	        double SI = (P * R * T) / 100;
	        System.out.println("Enter a total values: " + SI);
	        sc.close();
	}

}
