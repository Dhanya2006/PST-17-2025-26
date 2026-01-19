public class Main {
    public static void main(String[] args) {
        int num = 2; 
        int result;
        switch (num) {
            case 1:
                result = 10;
                break;
            case 2:
                result = 20;
                break;
            case 3:
                result = 30;
                break;
            default:
                result = num;
        }
        System.out.println("Replaced number: " + result);
    }
}