import java.util.*;

public class ArrayTwoSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the value of array elements: ");
        for(int i=0; i<5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target: ");
        int target = sc.nextInt();


        HashSet<Integer> list = new HashSet<>();
        boolean a = false;
        for(int nums : arr) {
            int n = target-nums;
            if(list.contains(n)) {
                a = true;
            }
            list.add(nums);
        }

        if(a) {
            System.out.println("arr has two value whose sum is equals to target: ");
        }else {
            System.out.println( " NO ");
        }
    }
}
