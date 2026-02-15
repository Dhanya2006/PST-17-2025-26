package OOPSCONCEPT;

public class Polymorphismadd {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println(add(a,b));
		System.out.println(sub(a,b));
		System.out.println(multi(a,b));
		System.out.println(div(a,b));

	}
	public static int add(int a,int b) {
		return a+b;
	}
	public static int sub(int a,int b ) {
		return a-b;
		
	}
	public static int multi(int a,int b) {
	   return a*b;
	}
	public static int div(int c,int d) {
		return c/d;
	}
}
