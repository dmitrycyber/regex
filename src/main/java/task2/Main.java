package task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text = "Hello! How are you. Please? Give me a tea. Stop.";
        searchOneWordSentece(text);

    }

    private static void searchOneWordSentece(String text) {
        Pattern pattern = Pattern.compile("[A-Z]\\w+([.!?])");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String group = matcher.group();
            System.out.println(group);
        }
    }
}



