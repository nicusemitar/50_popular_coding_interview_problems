package Problem_2;


import java.util.HashMap;
import java.util.Map;

//first repeating character
public class Problem_2 {
    public static void main(String[] args) {
        String str = "abba";
        firstRepeating(str);
    }

    public static char firstRepeating(String str) {

        char[] ch = str.toCharArray();
        Map<Character, Boolean> map = new HashMap<>();
        for (char character : ch) {
            if (map.containsKey(character)) {
                System.out.println(character);
                return character;
            } else map.put(character, true);
        }
        return '\0';
    }
}
