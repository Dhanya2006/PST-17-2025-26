package PST;
import java.util.Scanner;
public class Largestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        int count = s.length();
        System.out.println(count);
        sc.close();
    }
}
