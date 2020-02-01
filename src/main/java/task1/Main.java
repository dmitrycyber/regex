package task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String text = "Prince Romerson (c. 1840 – 1872) was a Native Hawaiian " +
                "who fought in the American Civil War at a time when the Kingdom " +
                "of Hawaii was an independent nation. Living in the American Northeast " +
                "before the war, Romerson enlisted in the Union Navy in 1863 and served " +
                "in the Atlantic Blockading Squadron. After being discharged, he reenlisted " +
                "in the 5th Regiment Massachusetts Colored Volunteer Cavalry, a United States " +
                "Colored Troops (USCT) regiment, in April 1864. Romerson rose to the rank of " +
                "sergeant and was mustered out in October 1865, due to illness. After the war, " +
                "like many USCT veterans, he remained in the army as a member of the Buffalo Soldiers ";
        String letter = "w";
        searchWord(text, letter);

    }

    private static void searchWord(String text, String letter) {
        Pattern pattern = Pattern.compile("\\b" + letter + "\\w+");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            String group = matcher.group();
            System.out.println(group);
        }
    }


}
