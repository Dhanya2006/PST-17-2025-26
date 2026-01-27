/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class stringline
{
	public static void main(String[] args) {
	    Scanner obj1 = new Scanner(System.in);
	    int a = obj1.nextInt();
		System.out.println(a);
		obj1.nextLine();
		String word = obj1.next();
		System.out.println(word);
		double b =obj1.nextDouble();
		System.out.println(b);
		boolean c =obj1.nextBoolean();
		System.out.println(c);
	}
}