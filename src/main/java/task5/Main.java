package task5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text = "Prince Romerson (c. 1840 – 1872) was a Native Hawaiian " +
                "who fought in the American Civil War at a time when the Kingdom " +
                "of Hawaii was an independent nation. Living in the American Northeast " +
                "before the war, Romerson enlisted in the Union Navy in 1863 and served " +
                "in the Atlantic google.com Blockading Squadron. After being discharged, he reenlisted " +
                "in the 5th Regiment Massachusetts Colored Volunteer Cavalry, a United States " +
                "Colored Troops (USCT) 2019.12.14 17:34 regiment, in April 1864. Romerson rose to the rank of " +
                "sergeant and was mustered out in October 1865, due to illness. After the war, " +
                "like many USCT veterans, www.yandex.ru he remained in 1999.12.12 12:11 the army as a member of the " +
                "www.tut.by  Buffalo Soldiers ";

        searchLinks(text);
    }

    private static void searchLinks(String text) {
        Pattern pattern = Pattern.compile("(www\\.)?\\w+\\.(com|ru|by)");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            String group = matcher.group();
            System.out.println(group);
        }
    }
}



