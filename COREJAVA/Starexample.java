package PST2;

import java.util.Scanner;

public class Starexample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        horizontal(num);
        System.out.println();
        vertical(num);
         
        sc.close();
    }

    static void horizontal(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
    }

    static void vertical(int num) {
        for (int i = 0; i < num-1; i++) {
            System.out.println("*");
        }
    }
}

