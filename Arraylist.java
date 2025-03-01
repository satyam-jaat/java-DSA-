import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Arraylist {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the size of list: ");
        int size = sc.nextInt();
        for(int i=0; i<size; i++) {
            int element = sc.nextInt();
            list.add(element);       //add element in the array list;
        }

        for(int num : list) {
            System.out.print(num+" ");
        }

        list.remove(Integer.valueOf(1));       //remove element from the array list;

        for(int element : list) {
            System.out.print(element+" ");
        }

        System.out.println();
        System.out.println("The size of the arraylist is: ");
        System.out.println(list.size());

        Collections.sort(list);

        
    }
}
