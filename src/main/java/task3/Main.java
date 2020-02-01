package task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String tel1 = "+375291233214";
        String tel2 = "375331233212";
        String tel3 = "+375(25)4321232";
        String tel4 = "+375(29) 123-32-12";
        String tel5 = "+375(29) 123 32 13";


        isValidNumber(tel1);
        isValidNumber(tel2);
        isValidNumber(tel3);
        isValidNumber(tel4);
        isValidNumber(tel5);

    }

    private static void isValidNumber(String telNumber) {
        Pattern pattern = Pattern.compile("\\+?375\\(?(25|33|29)\\)? ?\\d{3}[ \\-]?\\d{2}[ \\-]?\\d{2}");
        Matcher matcher = pattern.matcher(telNumber);
        System.out.println(matcher.find());
    }
}



