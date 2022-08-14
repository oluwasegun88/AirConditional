package arrayQuestions;

public class ArraySorting {
    public static void check(int[] Array) {
        int[] array = new int[]{4, 2, 56, 78, 34, 23, 1, 12, 45};
        for (int i = 0; i < Array.length; i++) {
            for (int j = i+ 1; j < Array.length; j++) {


                int tmp = 0;
                if (Array[i] > Array[j]) {
                    tmp = Array[i];
                    Array[i] = Array[j];
                    Array[j] = tmp;
                }

            }

            System.out.println(Array[i]);
        }
    }
}
