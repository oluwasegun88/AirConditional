package arrayQuestions;

import java.util.Scanner;

public class Main {
    private static Poll poll = new Poll();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] topics = poll.getTopics();
        int numberOfTopics=topics.length;
        System.out.println("welcome to unicorn poll");
        var response="yes";
        while(response.equals("yes")) {
            for (int i = 0; i < numberOfTopics; i++) {
                System.out.println("rate" + topics[i]);
                int userRating = scanner.nextInt();
                if (userRating < 1 || userRating > 10)
                    throw new UserFitNoGetSenseException("abeg try get sense");
                saveRating(i,userRating);

            }

            System.out.println("continue?");
            response = scanner.next();

        }

        System.out.println();
        poll.displayTabularReport();
    }
    private static void saveRating(int issueNumber, int userRating){
        int[][] responseDb=poll.responseDb();
        //for (int i = 0; i < poll.responseDb().length; i++) {
            //for (int secondi = 0; secondi < poll.responseDb()[i].length; secondi++) {
                responseDb[issueNumber][userRating-1]=responseDb[issueNumber][userRating-1]+1;

            }

        }



