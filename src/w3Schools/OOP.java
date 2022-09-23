package w3Schools;

public class OOP {


//    int age = 5;
//
//    public static void main(String[] args) {
//        Main myObj = new Main();
//        System.out.println("Name:" + myObj.fname + " " + myObj.lname);
//        System.out.println("Age: " + myObj.age);
//    }
//public static void main(String[] args) {
//    Main myCar = new Main();
//    myCar.fullThrottle();
//    myCar.speed(20);
//}

//    public static void main(String[] args) {
//        Main myCar = new Main(1969,"Benz");
//        System.out.println(myCar.modelYear );
//        System.out.println(myCar.modelName);
//    }
public static void main(String[] args) {
    Practice practice = new Practice();
    System.out.println("Name:" + practice.fname);
    System.out.println("Age:" + practice.age);
    System.out.println("Graduation Year:" + practice.graduationYear);
    practice.study();
}

    }


