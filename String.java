//Question. Check weather the string is palindrome or not?


// import java.util.Scanner;
// public class string_palindrome {
//     public static void main(String args[]) {

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter a name: ");
//         String name = sc.next();

//         char[] array = name.toCharArray();

//         char[] reverse = new char[name.length()];

//         int j = 0;
//         for(int i=name.length()-1; i>=0; i--) {
//             reverse[j] = array[i];
//             j++;
//         }

        
//         String result = new String(reverse);

//         if(result.equals(name)) {
//             System.out.println("String is Palindrome");
//         }else {
//             System.out.println("String is not Palindrome");
//         }
//     }
// }


//                             or using stringbuilder


/*
public class string_palindrome {
    public static void main(String args[]) {
        String str = "malayalam";
        char[] array = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(char c : array) {
            sb.append(c);
        }
        String reverse = sb.reverse().toString();
        if(reverse.equals(str)) {
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a Palindrome");
        }
    }
}
    */






    //LeetCode Problem
    


    // class string_palindrome {
    //     public boolean isPalindrome(String s) {
    //         var reversedString = new StringBuilder(s).reverse();
    
    //         return reversedString.toString().replaceAll("[^a-zA-Z0-9]", "").equalsIgnoreCase(s.replaceAll("[^a-zA-Z0-9]", ""));
    //     }
    // }



    // class Solution {
    //     public boolean isPalindrome(String s) {
    //         StringBuilder sb = new StringBuilder();
    
    //         for(int i=0; i<s.length(); i++) {
    //             char ch = s.charAt(i);
    //             if(Character.isLetterOrDigit(ch)) {
    //                 sb.append(Character.toLowerCase(ch));
    //             }
    //         }
    //         if(sb.length() ==0){
    //             return true;
    //         }
    //         String ori = sb.toString();
    
    //         String reversed = sb.reverse().toString();
    
    //         return ori.equals(reversed);
    //     }
    // }
