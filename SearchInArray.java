import java.util.ArrayList;
import java.util.Scanner;

class SearchInArray {
    public static int search(int[] arr, int target) {
        ArrayList<Integer> ar = new ArrayList<>();
        for(int element : arr) {
            ar.add(element);
        }
        return ar.indexOf(target);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of array: ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target: ");
        int target = sc.nextInt();
        
        int sol = search(arr, target);
        System.out.println("Index is: "+sol);
    }
}
