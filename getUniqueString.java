import java.util.Scanner;
class getUniqueString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        StringBuilder unique = new StringBuilder();

        for(int i=0; i<str.length(); i++) {
            char current_char = str.charAt(i);
            if(unique.indexOf(String.valueOf(current_char)) == -1) {
                unique.append(current_char);
            }
        }

        System.out.println(unique);
    }
}
