import java.util.*;
public class coutWordsInString {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String name = "this is the beautiful day";
    
        String[] words = name.split("\\s+");
    
        System.out.println(words.length);
    }
}
