package simple;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author shizhy
 * @date 2020/8/6
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 5};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }


}
