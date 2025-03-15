// //Question. Check weather the number(user input) is a armstrong number or not?


import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        //convert integer into string
        String number = Integer.toString(num);

        //finding the length of the converted string
        int length = number.length();

        int sum = 0;
        while(num > 0) {
            int lastdigit = num % 10;
            sum += Math.pow(lastdigit,length);
            num/=10;
        }
        
        //getting the original number
        int original = Integer.valueOf(number);

        //checking weather the number is armstrong or not
        if(original == sum) {
            System.out.println("The number is armstrong");
        }else {
            System.out.println("The number is not armstong");
        }
    }

}





                // or using recursion


/*
import java.util.Scanner;

public class ArmstrongNumber {

    public static boolean isarmstrong(int num, int sum, int n, int length) {
        if(n == sum && num <= 0) {
            return true;
        }
        if(num <= 0 && n != sum ) {
            return false;
        }

        sum += Math.pow(num%10, length);

        return isarmstrong(num/10, sum, n, length);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int n = sc.nextInt();
        int original = n;
        int num = n;

        int length = 0;
        while(num > 0) {
            length++;
            num/=10;
        }

        System.out.println(isarmstrong(n, 0, original, length));

    }
}

*/
