package PST;
import java.util.Scanner;
public class Sumdigit {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = obj.nextInt();
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num = num / 10;
        }
        System.out.println("Sum of digits = " + sum);
        obj.close();
    }
}

