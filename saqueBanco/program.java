import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double value;

        System.out.print("Enter account number: ");
        int number = in.nextInt();

        System.out.print("Enter the name of the owner: ");
        in.nextLine();
        String name = in.nextLine();

        System.out.print("Is there an initial deposit? (y/n) ");
        char condition = in.next().charAt(0);

        if(condition == 'y') {
            System.out.print("Enter initial deposit value: ");
            value = in.nextDouble();
        }
        else {
            value = 0;
        }
        account account = new account(number, name, value);

        System.out.println("Account data:");
        System.out.print(account.toString() + "\n");

        System.out.print("\nEnter a deposit value: ");
        double deposit = in.nextDouble();
        account.deposit(deposit);
        System.out.print("Updated account data:\n" + account.toString() + "\n");

        System.out.print("\nEnter a withdraw value: ");
        double withdraw = in.nextDouble();
        account.withdraw(withdraw);
        System.out.println("Updated account data:\n" + account.toString());

        in.close();
    }
}
