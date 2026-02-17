package OOPSCONCEPT;

public class Smallatoz {

	public static void main(String[] args) {
		 ascii();
   }
   static void ascii() {
       for(char ch = 'a'; ch <= 'z'; ch++) {
           ascii1(ch);
       }
   }
   static void ascii1(char ch) {
       int ascii = ch;
       System.out.println(ch + " = " + ascii);


	}

}
