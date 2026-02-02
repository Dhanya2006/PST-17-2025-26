package PST2;
import java.util.Scanner;
public class ArmStrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number:");
		int num = sc.nextInt();
        int temp=num;
        int count=0;
        int sum=0;
        while (num != 0) {
            count++;
            num = num / 10;
        }
        while(temp!=0);
        {
        	sum=num/10;
        	for (int i = 0; i<count;i++);
        }
        if (sum == temp) {
            System.out.println(temp + " is an Armstrong number");
        }
        else {
            System.out.println(temp + " is not an Armstrong number");
        }
        	

	}

}
