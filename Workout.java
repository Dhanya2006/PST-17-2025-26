package PRACTICAL;

import java.util.Scanner;

public class Workout {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int i = 1;
        System.out.println("Increment:");
        while (i <= n) {
            System.out.println(i);
            i++;
        }

        System.out.println("Decrement:");
        int j = n;
        do {
            System.out.println(j);
            j--;
        } while (j >= 1);

        sc.close();
    }
}
