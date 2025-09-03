package monotonic;


import java.util.*;

public class NextGreaterElement {

    public static int[] nextGreaterElementsI(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];


        Stack<Integer> stack = new Stack<>();

        for (int i = 2 * n; i >= 0; i--) {
            int idx = i % n;
            while (!stack.isEmpty() && stack.peek() <= nums[idx]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                result[idx] = -1;
            } else {
                result[idx] = stack.peek();
            }
            stack.push(nums[idx]);
        }
        return result;
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> greaterElementHolder = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = nums2.length - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() < nums2[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) greaterElementHolder.put(nums2[i], -1);
            else greaterElementHolder.put(nums2[i], stack.peek());

            stack.push(nums2[i]);
        }

        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = greaterElementHolder.getOrDefault(nums1[i], -1);
        }
        return nums1;
    }

}
