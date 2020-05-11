public class Problem2 {
    /*
    Problem #2 [Hard]
    This problem was asked by Uber.
    -----------------------------------------------------------------------------------------------------
    Given an array of integers, return a new array such that each element at index i of the new array is
    the product of all the numbers in the original array except the one at i.
    For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24].
    If our input was [3, 2, 1], the expected output would be [2, 3, 6].

    Follow-up: what if you can't use division?
     */

    private int[] allProductExceptMe(int[] arr) {
        int[] res =  new int[arr.length];

        int prod = arr[0];
        res[0] = 1;
        for (int i = 1; i < arr.length-1; i++) {
            res[i] = prod;
            prod = prod * arr[i];
        }
        res[arr.length - 1] = prod;
        prod = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            res[i] = res[i] * prod;
            prod = prod * arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        Problem2 obj = new Problem2();
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] res1 = obj.allProductExceptMe(arr1);
        for (int value : res1) {
            System.out.print(value + " ");
        }
        System.out.println();
        int[] arr2 = {3, 2, 1};
        int[] res2 = obj.allProductExceptMe(arr2);
        for (int value : res2) {
            System.out.print(value + " ");
        }
    }
}
