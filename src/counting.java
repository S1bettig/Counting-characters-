import java.awt.*;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class counting {
    public static void main(String[] args) {
        Scanner myString = new Scanner(System.in);
        System.out.println("Enter a Sentence Please: ");
        String stringToCount = myString.nextLine();
        System.out.println(stringToCount);



        HashMap<Character,Integer> charCountMap = new HashMap<Character, Integer>();

        char[] strArray = stringToCount.toCharArray();

        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            }
                else {
                    charCountMap.put(c, 1);
            }
        }
        for (Map.Entry entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
