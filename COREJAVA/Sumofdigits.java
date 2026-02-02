package PST2;
import java.util.Scanner;
public class Sumofdigits {
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int sum =0;
			System.out.println("Enter the Digits:");
			int num=sc.nextInt();
			while(num>0) {
				sum = sum + num%10;
				num = num / 10;
			}
			System.out.println("the sum of digits:"+sum);

		}

	}