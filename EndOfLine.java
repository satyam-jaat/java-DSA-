import java.util.*;
public class EndOfLine {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int lineNumber = 1;
        
        while(sc.hasNextLine()) {
            String str = sc.nextLine();
            System.out.println(lineNumber+" "+str);
            lineNumber++;
        }
    }
}
