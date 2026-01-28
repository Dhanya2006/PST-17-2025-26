package PST;
public class Ascendingorder {
    public static void main(String[] args) {
        int[] a = {9, 3, 2, 4, 8};
        int temp;

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) 
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}
