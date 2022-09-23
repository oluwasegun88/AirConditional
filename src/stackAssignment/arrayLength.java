package stackAssignment;

public class arrayLength {

    public static void main(String[] args) {

        String[] arr1 = {"good", "way", "good"};
        String[] arr2 = {"good", "way", "good"};
        boolean check = equals(arr1, arr2);
        System.out.println(check);

    }

    public static boolean equals(String[] array1, String[] array2) {
        int count = 0;
        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i].equals(array2[i])) {
                    count++;
                }
            }

        }
        else return false;

        if(count == array1.length){
            return true;
        }
        else return false;
    }
}


