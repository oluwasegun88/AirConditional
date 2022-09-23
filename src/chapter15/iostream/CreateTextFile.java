package chapter15.iostream;


import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

    public class CreateTextFile {
        public static void main(String[] args) {
            try(Formatter output = new Formatter("clients.txt")){
                Scanner scanner = new Scanner(System.in);
                System.out.printf("%s%n%s%n", "Enter Account Number: , First Name, Last Name and Balance", "Enter End Of File Indicator");
                while (scanner.hasNext()){
                    try {
                        output.format("%d %s %s %.2f%n", scanner.nextInt(), scanner.next(), scanner.next(), scanner.nextDouble());
                    } catch (NoSuchElementException exception) {
                        System.err.println("Invalid Input, Please Try again");
                        scanner.nextLine();
                    }
                    System.out.println("? ");
                }
            }
            catch (SecurityException | FileNotFoundException| FormatterClosedException exception){
                exception.getStackTrace();
            }
        }
    }

