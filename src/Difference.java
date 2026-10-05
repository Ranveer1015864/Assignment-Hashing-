import java.util.*;

public class Difference {

    public static void main(String[] args) {

        String s = "abcd";
        String t = "abcde";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {

            if (!map.containsKey(c)) {
                System.out.println("Added character: " + c);
                return;
            }

            map.put(c, map.get(c) - 1);

            if (map.get(c) == 0) {
                map.remove(c);
            }
        }
    }
}