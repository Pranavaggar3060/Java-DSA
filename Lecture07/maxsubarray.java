package Lecture07;

public class maxsubarray {
    public static void main(String[] args) {
        int[] nums = {5, 4, -1, 7, 8};
        int max = Integer.MIN_VALUE;

        // Brute force approach to find the maximum subarray sum
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum > max) {
                    max = sum;
                }
            }
        }

        // Output the result
        System.out.println("Maximum subarray sum: " + max);
    }
}


