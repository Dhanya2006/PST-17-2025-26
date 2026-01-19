/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
        int a = 5, b = 9, c = 3;
        if (a > b && a > c)
            System.out.println("a is greatest");
        else if (b > c)
            System.out.println("b is greatest");
        else
            System.out.println("c is greatest");
    }
}
