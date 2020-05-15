public class Problem4 {
    /*
    Problem #4 [Hard]
    This problem was asked by Stripe.

    Given an array of integers, find the first missing positive integer in linear time and constant space.
    In other words, find the lowest positive integer that does not exist in the array.
    The array can contain duplicates and negative numbers as well.

    For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.

    You can modify the input array in-place.
     */
    private void swap(int[] array, int pos1, int pos2) {
        int temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;
    }

    private int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] <= 0) i++;
            else if (i == nums[i] - 1) i++;
            else if (nums[i] > nums.length) i++;
            else if (nums[nums[i] - 1] == nums[i]) i++;
            else {
                swap(nums, i, nums[i]-1);
            }
        }

        int count = 1;
        for (i = 0; i < nums.length; i++) {
            if (i == nums[i] - 1) count++;
            else break;
        }
        return count;
    }

    public static void main(String[] args) {
        Problem4 problem4 = new Problem4();
        // Mix of positive and negative
        int[] arr1 = {3, 4, -1, 1};
        System.out.println(problem4.firstMissingPositive(arr1));
        // Only positive, missing elem > array length
        int[] arr2 = {1, 2, 0};
        System.out.println(problem4.firstMissingPositive(arr2));
        // Only positive, missing elem < array length
        int[] arr3 = {1, 2, 0, 5, 6};
        System.out.println(problem4.firstMissingPositive(arr3));
        // Only negative, with duplicates
        int[] arr4 = {-3, -4, -1, -1};
        System.out.println(problem4.firstMissingPositive(arr4));
        // Only positive, with duplicates
        int[] arr5 = {3, 3, 2, 2, 5, 5, 9, 1, 9};
        System.out.println(problem4.firstMissingPositive(arr5));
        // Single number
        int[] arr6 = {1};
        System.out.println(problem4.firstMissingPositive(arr6));
        int[] arr7 = {-1};
        System.out.println(problem4.firstMissingPositive(arr7));
        int[] arr8 = {10};
        System.out.println(problem4.firstMissingPositive(arr8));
    }
}
