import java.util.HashSet;
import java.util.Set;

public class Problem1 {
    /*
    Problem #1 [Easy]
    This problem was recently asked by Google.
    ------------------------------------------------------------------------------------------------
    Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
    For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

    Bonus: Can you do this in one pass?
     */
    private boolean isSumK(int[] arr, int k) {
        Set<Integer> seenSoFar = new HashSet<>();
        for (int num : arr) {
            if (seenSoFar.contains(num)) return true;
            seenSoFar.add(k - num);
        }
        return false;
    }

    public static void main(String[] args) {
        Problem1 obj = new Problem1();
        int[] arr1 = {10, 15, 3, 7};
        System.out.println(obj.isSumK(arr1, 17));
        System.out.println(obj.isSumK(arr1, 19));
        int[] arr2 = {27, 15, -3, -10};
        System.out.println(obj.isSumK(arr2, 17));
        System.out.println(obj.isSumK(arr2, 19));
    }
}
