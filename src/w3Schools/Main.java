package w3Schools;

//public class SelectionStatement {
//    public static void main(String[] args) {
//        boolean StudentGrade = false;
//        if (StudentGrade >= 60) {
//        }
//            System.out.println("passed");
        //IF...ELSE
//        int x=20;
//        int y=18;
//        if (x<y){
//            System.out.println(" I love it");
//        } else {
//            System.out.println("Ko possible");
//        }
        //SHORT HAND
//        int time = 20;
//        String result = (time < 20)? "Good day." : "Good evening.";
//        System.out.println(result);

         //SWITCH CASE
//        int day = 8;
//        switch (day){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("This does not exit");
//        }

        //LOOP
//        for (int i = 0; i <= 5; i++) {
//            System.out.println(i);
//        }

//        String[] cars = {"Volvo","BMW", "Ford", "Mazda"};
//        for (String i: cars){
//            System.out.println(i);
//        }
        //BREAK AND CONTINUE
//        for (int i = 0; i < 10; i++) {
//            if(i == 7){
//                break;
//            }
//            System.out.println(i);
//        }

//        for (int i = 0; i < 10; i++) {
//            if(i == 4){
//                continue;
//            }
//            System.out.println(i);
//        }

//        int i = 0;
//        while (i < 10) {
//            System.out.println(i);
//            i++;
//            if (i == 4) {
//                break;
//            }
//        }

//        int i = 0;
//        while (i < 10) {
//            if (i == 4) {
//                i++;
//                continue;
//            }
//            System.out.println(i);
//            i++;
//        }

        //ARRAY
//        String[] cars = {"Volvo","BMW", "Ford", "Mazda"};
//        System.out.println(cars[1]);

        //To replace an element

//        String[] Cars = {"Volvo","BMW", "Ford", "Mazda"};
//        Cars[1] = "Opel";
//        System.out.println(Cars[1]);

        //Array length
//        String[] motors = {"Volvo","BMW", "Ford", "Mazda"};
//        System.out.println(motors.length);

        //Looping through an Array
//        String[] oko = {"Volvo", "BMW", "Ford", "Mazda"};
//        for (int i = 0; i < oko.length; i++) {
//            System.out.println(oko[i]);
//        }

//        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//        for (String i : cars) {
//            System.out.println(i);
//        }
//
//        //Multidimensional Array
//        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
//        for (int i = 0; i < myNumbers.length; ++i) {
//            for(int j = 0; j < myNumbers[i].length; ++j) {
//                System.out.println(myNumbers[i][j]);
//            }
//        }
//
//    }
// }

        //METHODS

//public class Main{
//    int x;

    //WITHOUT PARAMETERS
    //static void myMethod(){
//        System.out.println("I just got executed!");
//    }
//
//    public static void main(String[] args) {
//        myMethod();

        //public class Main {

    //WITH PARAMETER
//            static void myMethod(String fname) {
//                System.out.println(fname + " Olayemi");
//            }
//
//            public static void main(String[] args) {
//                myMethod("Segun");
//                myMethod("Chris");
//                myMethod("Dominion");
//
                //MULTIPLE PARAMETERS

//    static void myMethod(String fname, int age) {
//        System.out.println(fname + " is " + age);
//    }
//
//    public static void main(String[] args) {
//        myMethod("Segun", 5);
//        myMethod("Chris", 8);
//        myMethod("Dominion", 31);

    //RETURN VALUES
//    static int myMethod(int x) {
//        return 5 + x;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(myMethod(3));

//    static int myMethod(int x, int y) {
//        return x * y;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(myMethod(5, 3));
//
//    }

abstract class Main {


//   String fname = "Segun";
//   String lname = "Olayemi;";
//
//    int age=15;
//
//
//    public static void main(String[] args) {
//        Main myObj = new Main();
//        System.out.println("Name:" + myObj.fname + " " + myObj.lname);
//        System.out.println("Age: " + myObj.age);
//    }


//    public void fullThrottle() {
//        System.out.println("The car can run fast!");
//    }
//
//    public void speed(int speed) {
//        System.out.println("Max speed is:" + 20);
//    }

//    int modelYear;
//    String modelName;
//
//    public Main(int modelYear, String modelName) {
//        this.modelYear = modelYear;
//        this.modelName = modelName;
//    }

    public String fname = "John";
    public int age = 24;

    public void study() {

    }
}
