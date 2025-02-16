import java.util.*;
public class firstAndLastOccurence {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char c = sc.next().charAt(0);

        int firstOccurence = str.indexOf(c);
        int lastOccurence = str.lastIndexOf(c);

        System.out.println(firstOccurence);
        System.out.println(lastOccurence);
    }
}
