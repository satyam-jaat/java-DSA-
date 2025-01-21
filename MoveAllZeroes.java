import java.util.Scanner;

public class MoveAllZeroes {

    public static void move(int[] arr) {
        int j=0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }

        for(int i=j; i<arr.length; i++) {
            arr[i] = 0;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        move(arr);

        for(int i=0; i<n; i++) {
            System.out.print(arr[i]);
        }
    }
}
