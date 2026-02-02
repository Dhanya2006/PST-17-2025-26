package PST2;
import java.util.Scanner;
public class Leapyear {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the year:");
	int year=sc.nextInt();
		if(year % 4==0||(year % 100==0) && (year % 400==0))
		{
			System.out.print("This year is leap year"+year);
		}
		else
		{
	System.out.print("This year is not leap year"+year);
	
	}
sc.close();
}
}