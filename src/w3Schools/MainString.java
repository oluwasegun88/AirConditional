package w3Schools;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MainString {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
//        String userName;
//
//        System.out.println("Enter username");
//        userName = scanner.nextLine();
//        System.out.println("username is:" + userName);

//        System.out.println("Enter name, age, salary");
//
//        String name=scanner.nextLine();
//        int age=scanner.nextInt();
//        double salary= scanner.nextDouble();
//

//        System.out.println("Name:" + name);
//        System.out.println("Age:" + age);
//        System.out.println("Salary:" + salary);

        LocalDateTime myDatescanner = LocalDateTime.now();
        //LocalTime scanner = LocalTime.now();
        System.out.println("Before formatting:" + myDatescanner);
        DateTimeFormatter myFormatScanner = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        // =]System.out.println(scanner);
        String formattedDate = myDatescanner.format(myFormatScanner);
        System.out.println("After formatting:" + formattedDate);
    }

    }







