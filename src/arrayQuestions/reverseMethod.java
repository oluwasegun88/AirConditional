package arrayQuestions;

import java.util.Scanner;

public class reverseMethod {

    public static void main(String[] args) {
        letters();
    }

    public static void letters(){

        Scanner input = new Scanner(System.in);
        System.out.println("Input a String: ");
        char[] letter = input.nextLine().toCharArray();
        System.out.println("Reverse string: ");
        for (int i = letter.length - 1; i >= 0; i--){
            System.out.print(letter[i]);
        }
    }
}
