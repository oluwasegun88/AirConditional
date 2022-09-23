package Automatic;

public class reverseMethod {
    public static void reverseMethod(int number) {
        if (number < 10) {
            System.out.println(number);
            return;
        } else {
            System.out.print(number % 10);
            reverseMethod(number/10);
        }
    }

    public static void main(String[] args) {
        int num = 54321;
        reverseMethod(num);

    }
}
