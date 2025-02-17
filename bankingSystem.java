import java.util.Scanner;
public class bankingSystem {

    public static int money;
    public static Scanner sc = new Scanner(System.in);
    public static String password = "password";
    public static String User = "user";

    public static void withdrawl(int n) {
        System.out.print("Enter the userName: ");
        String name = sc.nextLine();
        System.out.print("Enter the password: ");
        String pass = sc.nextLine();

        if(pass.compareTo(password) == 0 && name.equals(User)) {
            System.out.print("Enter the money you want to withdraw: ");
            int m = sc.nextInt();
            sc.nextLine();
            money-=m;
            System.out.println("\nMoney withdrawn successfully, now your current balance is: "+money+"\n");
        }else {
            System.out.println("\nWorng password! Try again.\n");
        }
    }

    public static void deposit(int n) {
        System.out.print("Enter the userName: ");
        String name = sc.nextLine();
        System.out.print("Enter the password: ");
        String pass = sc.nextLine();
        if(pass.compareTo(password) == 0 && name.equals(User)) {
             System.out.print("Enter the money you want to deposit: ");
            int m = sc.nextInt();
            sc.nextLine();
            money+=m;
            System.out.println("\nThe money is deposited, now your current balance is: "+money+"\n");
        }else {
            System.out.println("\nWorng password! Try again.\n");
        }
       
    }

    public static void check(int n) {
        System.out.print("Enter the userName: ");
        String name = sc.nextLine();
        System.out.print("Enter the password: ");
        String pass = sc.nextLine();

        if(pass.compareTo(password) == 0 && name.equals(User)) {
            System.out.println("\nYour current balance is: "+money+"\n");
        }else {
            System.out.println("\nWorng password! Try again.\n");
        }
        
    }
    public static void main(String args[]) {
        System.out.print("Enter the money in your account: ");
        money = sc.nextInt(); 
        sc.nextLine(); 
        
        boolean a = true;
        while(a) {
            System.out.println("1. check");
            System.out.println("2. withdrawl");
            System.out.println("3. deposit");
            System.out.println("4. exit");

            System.out.print("\nEnter the option: ");
            int x = sc.nextInt();
            sc.nextLine();

            switch (x) {
                case 1:
                    check(money); 
                    break;
                case 2: 
                    withdrawl(money);
                    break;
                case 3:
                    deposit(money);
                    break;
                case 4:
                    a = false;
                    System.out.println("Thanks! for using the banking management system.");
                    break;
                default:
                    System.out.println("Invalid move! Try again.");
                    break;
            }
        }
    }
}
