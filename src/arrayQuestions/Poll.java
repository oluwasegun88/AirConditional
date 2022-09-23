package arrayQuestions;

import java.util.Arrays;

public class Poll {

    private String[] topics = {"Financial issues", "Psycho issue", "Gender Inequality", "Hunger", "Breakfast"};

    private int[][] responses = new int[5][10];

    double averageRatings;


    public String[] getTopics() {
        return topics;
    }

    public void setTopics(String[] topics) {
        this.topics = topics;
    }

    public void calculateAverage(int... pollNumbers) {
        int totalOfRating = 0;
        for (int pollNumber : pollNumbers) {
            totalOfRating += pollNumber;
        }
        averageRatings = totalOfRating / pollNumbers.length;

    }

    public int getHighestPoint(int[] pollNumbers) {
        int highestNumber = pollNumbers[0];

        for (int i = 0; i < pollNumbers.length; i++) {
            if (pollNumbers[i] > highestNumber) {
                highestNumber = pollNumbers[i];
            }

        }

        return highestNumber;
    }

    public int getLowestPoint(int[] pollNumbers) {
        int lowestNumber = pollNumbers[0];

        for (int i = 0; i < pollNumbers.length; i++) {
            if (pollNumbers[i] < lowestNumber) {
                lowestNumber = pollNumbers[i];
            }
        }
        return lowestNumber;
    }


    public double getAverageRatings() {
        return 0;
    }

    public void displayTabularReport() {
        String header = String.format("\t\t\t\t\t\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\n",
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(header);
//        for (String topic : getTopics()) {
//            System.out.println(topic);
//            System.out.println();
//        }

        for (int i = 0; i < responseDb().length; i++) {
            for (int secondi = 0; secondi < responseDb()[i].length; secondi++) {
                System.out.printf("%s\t", getTopics()[i]);
                System.out.println(Arrays.toString(responseDb()[i]));
                //System.out.println(getTopics()[i]);
                System.out.println();
            }

        }
    }

    int[][] responseDb() {
        return responses;

    }


}
