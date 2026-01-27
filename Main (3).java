/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner obj = new Scanner(System.in);
	    int mark1 = obj.nextInt();
	    int mark2 = obj.nextInt();
	    int mark3 = obj.nextInt();
	    int total =mark1+mark2+mark3;
	    int average=total/3;
		System.out.println("total marks of the students:"+total);
		System.out.println("average of the students:"+average);
	}
}
