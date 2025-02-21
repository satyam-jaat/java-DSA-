//Question. Move all the x occurs in the string in right?


public class moveAllX {
    public static void main(String args[]) {
        String str = "axdxcxxj";
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) != 'x') {
                sb.append(str.charAt(i));
            }
        }
        int length = sb.length();
        int str_length = str.length()-length;
        for(int i=0; i<str_length; i++) {
            sb.append('x');
        }

        System.out.println(sb);
        
    }
}



//                                                       OR
//                                                 Using recursion


/*
import java.util.*;
public class moveAllX {
    public static int count = 0;
    public static void nextChar(String str, int index, StringBuilder sb) {
        if(index == str.length()) {
            for(int i=0; i<count; i++) {
                sb.append("x");
            }
            System.out.println(sb);
            return ;
        }
        
        if(str.charAt(index) != 'x') {
            sb.append(str.charAt(index));
            nextChar(str, index+1, sb);
        }else {
             count++;
            nextChar(str, index+1, sb);
           
        }
        
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        nextChar(str,0,sb);
    }
}
*/
