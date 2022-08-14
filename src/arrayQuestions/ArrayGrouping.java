package arrayQuestions;

import java.util.Arrays;

public class ArrayGrouping {
    public static void main(String[] args) {
        int[] array = new int[] {2,4,3,5,6,7,8,10};
        for(int i=0;i< array.length;i++){
        for(int j=i+1; j< array.length; j++){

            int tmp=0;
            if (array[i] > array[j]){
                tmp= array[i];
                array[i] = array[j];
                array[j] = tmp;
            }

            }
            //System.out.println(array[i]);

        }
        System.out.println(Arrays.toString(array));
    }
}
