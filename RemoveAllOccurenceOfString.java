public class RemoveAllOccurenceOfString {
    public static void main(String args[]) {

        String str = "aabababa";
        String part = "aba";

        while(str.contains(part)) {
            str = str.replaceFirst(part,"");
        }

        System.out.println(str);
    }
}
