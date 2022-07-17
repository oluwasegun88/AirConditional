import java.util.Scanner;

public class StudentsGrade {
    public static void main(String[] args) {
        int total = 0;
        int gradeCounter = 0;
        int counter = 0;
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int eCount = 0;
        int fCount = 0;

        Scanner input = new Scanner(System.in);

        System.out.print(" ");

        while (counter <= 6) {
            System.out.println("Enter your score: ");
            int grade = input.nextInt();
            counter++;

            switch (grade / 10) {
                case 9:
                    System.out.println("A");
                    ++aCount;
                    break;
                case 8:
                    System.out.println("B");
                    ++bCount;
                    break;
                case 7:
                    System.out.println("C");
                    ++cCount;
                    break;
                case 6:
                    System.out.println("D");
                    ++dCount;
                    break;
                case 5:
                    System.out.println("E");
                    ++eCount;
                    break;
                default:
                    ++fCount;
                    System.out.println("F");
                    break;
            }
        }
    }
}