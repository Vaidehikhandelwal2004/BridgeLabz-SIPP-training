import java.util.*;

public class PairWithTargetSum {
    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 3, 1};
        int target = 10;
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(target - num)) {
                System.out.println(num + " " + (target - num));
                return;
            }
            set.add(num);
        }
        System.out.println("No pair found");
    }
}
