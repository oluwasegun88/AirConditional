package regex3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex3 {
    public static void main(String[] args) {
        String email = "f.oladeji@semicolon.africa";
        if(isValidEmailAddress(email)) System.out.println("email address is valid");
        else System.out.println("email is invalid");

        var isValid = Pattern.matches("[a-z].[a-z]+@semicolon.africa",
                                                "[a-z].[a-z]+@semicolon.africa");
        System.out.println(isValid);


        Pattern p = Pattern.compile("[a-z].[a.z] +@semicolon.africa");
        Matcher m = p.matcher("[a-z].[a-z]+@semicolon.africa");
        System.out.println(m.find());

    }

    public static boolean isValidEmailAddress(String email){
        boolean inValid = email.matches("[a-z].[a-z]+@semicolon.africa");
        return inValid;
    }
}
