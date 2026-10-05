import java.util.*;

public class DouplicateExist {

    public static void main(String[] args) {

        int[] arr = {10, 2, 5, 3};

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {

            if (set.contains(num * 2)) {
                System.out.println(true);
                return;
            }

            if (num % 2 == 0 && set.contains(num / 2)) {
                System.out.println(true);
                return;
            }

            set.add(num);
        }

        System.out.println(false);
    }
}