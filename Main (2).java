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
	    int celsius = obj.nextInt();
	    int fahrenheit = (celsius * 9/5) + 32;
		System.out.println("the celsius:"+celsius);
		System.out.println("the fahrenheit:"+fahrenheit);
	}
}
