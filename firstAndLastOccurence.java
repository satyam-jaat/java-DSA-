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




// public class firstAndLastOccurence {
//     public static int lastOccurence(String str) {
//         char array[] = str.toCharArray();
//         int a = -1;
//         for(int i = str.length()-1; i>=0; i--) {
//             if(array[i] == 'a') {
//                 a = i;
//                 break;
//             }
//         }
//         return a;
//     }
//     public static int firstOccurence(String str) {
//         char array[] = str.toCharArray();
//         int a = -1;
//         for(int i=0; i<str.length(); i++) {
//             if(array[i] == 'a'){
//                 a = i;
//                 break;
//             }
//         }
//         return a;
//     }
//     public static void main(String args[]) {
//         String str = "abcabcabcabc";

//         System.out.println("First Occurence of the target is at index: "+firstOccurence(str));
//         System.out.println("Last Occurence of the target is at index: "+lastOccurence(str));
//     }
// }





//                        or using recursions with two methods





// public class firstAndLastOccurence {
//     public static int firstOccurence(String str, int index) {
//         char[] array = str.toCharArray();
//         if(index == str.length()) {
//             return -1;
//         }
//         if(array[index] == 'a') {
//             return index;
//         }
//         return firstOccurence(str, index+1);

//     }
//     public static int lastOccurence(String str, int index) {
//         char[] array = str.toCharArray();
//         if(index < 0) {
//             return -1;
//         }
//         if(array[index] == 'a') {
//             return index;
//         }
//         return lastOccurence(str, index-1);
//     }
//     public static void main(String args[]) {
//         String str = "bcabcabcabc";
//         System.out.println("The first occurence is: "+firstOccurence(str, 0));
//         System.out.println("The last occurence is: "+lastOccurence(str, str.length()-1));
//     }
// }



//                             or using recursion in one method rather than two method.



// public class firstAndLastOccurence {
    
//     public static int check(String str, int index, boolean whichOne) {
//         char array[] = str.toCharArray();
//         if(whichOne == true && index == str.length()) {
//             return -1;
//         }
//         if(whichOne == false && index < 0) {
//             return -1;
//         }
//         if('a' == array[index]) {
//             return index;
//         }
        
//         if(whichOne == true) {
//             return check(str, index+1, true);
//         }else{
//             return check(str,index-1, false);
//         }
//     }
//     public static void main(String args[]) {
//         String str = "bcabcabcabc";
//         System.out.println("The first Occurence is: "+check(str, 0, true));
//         System.out.println("The last occurence is: "+check(str, str.length()-1, false));
//     }
// }
