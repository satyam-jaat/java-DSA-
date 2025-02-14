import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Comparator;

public class KthLargestElementInArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();  //By default the priority queue works like a min heap which is having the highest priority to the lowest element
        // PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder()); // to get the priority to the highest element in the queue
        
        int k = sc.nextInt();

        for(int num : arr) {
            minHeap.offer(num);
            
            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }

        System.out.println("The kth largest element from the given array is: "+minHeap.peek());
    }
}
