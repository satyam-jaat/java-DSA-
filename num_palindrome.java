//Question. Find weather the number is a palindrome number or not?


import java.util.Scanner;
public class num_palindrome {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original = num;
        
        int reverse = 0;

        while(num > 0) {
            int last = num%10;
            reverse = reverse*10 + last;
            num/=10;
        }

        if(reverse == original) {
            System.out.println("Given number is a palindrome number");
        }else {
            System.out.println("Given number is not a palindrome number");
        }
    }
}

