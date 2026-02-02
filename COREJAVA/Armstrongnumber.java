package PST2;
import java.util.Scanner;
public class Armstrongnumber {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("enter a number");
        int num = sc.nextInt();
        int temp=num;
        int sum=0;
        while(num>0) {
        	int digit =num%10;
        	sum = sum + (digit * digit * digit);
            num = num / 10;
        }
        if (sum == temp)
            System.out.println(temp + " is an Armstrong number");
        else
            System.out.println(temp + " is not an Armstrong number");
	}
}
