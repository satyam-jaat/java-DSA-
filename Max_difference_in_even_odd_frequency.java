import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int maxDifference(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency of each character
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int maxOdd = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;

        // Find max odd frequency and min even frequency
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            if(value % 2 != 0) {
                maxOdd = Math.max(maxOdd, value);
            } else {
                minEven = Math.min(minEven, value);
            }
        }

        // If no valid odd or even frequency found
        if(maxOdd == Integer.MIN_VALUE || minEven == Integer.MAX_VALUE) {
            return -1; // You can change this return value based on requirement
        }

        return maxOdd - minEven;
    }

    // Main method to test the function
    public static void main(String[] args) {
        Solution sol = new Solution();

        String test1 = "aabbccddeeef";
        String test2 = "abcde";         // all frequency = 1 (odd), no even freq
        String test3 = "aabbcc";        // all frequency = 2 (even), no odd freq
        String test4 = "aaabbbbcc";     // a=3(odd), b=4(even), c=2(even)

        System.out.println("Test 1 Output: " + sol.maxDifference(test1)); // Expected: 1 (3 - 2)
        System.out.println("Test 2 Output: " + sol.maxDifference(test2)); // Expected: -1
        System.out.println("Test 3 Output: " + sol.maxDifference(test3)); // Expected: -1
        System.out.println("Test 4 Output: " + sol.maxDifference(test4)); // Expected: 3 - 2 = 1
    }
}
