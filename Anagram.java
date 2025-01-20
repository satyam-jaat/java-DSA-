import java.util.ArrayList;
import java.util.Scanner;
public class Anagram {

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        ArrayList<Character> list = new ArrayList<>();
        for(int i=0; i<s.length(); i++) {
            list.add(s.charAt(i));
        }

        for(int i=0; i<t.length(); i++) {
            if(!list.contains(t.charAt(i))) {
                return false;
            }else {
                list.remove(list.indexOf(t.charAt(i)));
            }
        }
        return true;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        boolean value = isAnagram(s,t);

        if(value) {
            System.out.println("Both the strings are Anagram");
        }else {
            System.out.println("Both the strings are not Anagram");
        }
    }
}
