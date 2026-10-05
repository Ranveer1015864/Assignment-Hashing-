import java.util.*;

public class DisappearedNumbers {

    public static void main(String[] args) {

        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 1; i <= nums.length; i++) {

            if (!set.contains(i)) {
                result.add(i);
            }
        }

        System.out.println(result);
    }
}