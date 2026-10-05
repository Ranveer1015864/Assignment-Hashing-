import java.util.*;

public class LongestPalindrome {

    public static void main(String[] args) {

        String s = "abccccdd";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int length = 0;
        boolean odd = false;

        for (int count : map.values()) {

            length += (count / 2) * 2;

            if (count % 2 == 1) {
                odd = true;
            }
        }

        if (odd) {
            length++;
        }

        System.out.println("Longest palindrome length: " + length);
    }
}