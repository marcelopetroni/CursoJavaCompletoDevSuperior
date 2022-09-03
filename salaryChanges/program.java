import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        changes ch = new changes();

        System.out.println("What is your name?");
        ch.name = in.nextLine();

        System.out.println("How much do you earn?");
        ch.salary = in.nextDouble();

        System.out.println("How much does the employee need to pay of taxes?");
        ch.tax = in.nextDouble();

        System.out.println("\nEmployee: " + ch.name + "\nSalary: " + (ch.salary - ch.tax));
        System.out.println("\nWhich percentage to increase salary? (from 1 to 100%)");
        ch.percentage = in.nextDouble();
        
        System.out.println("Updated data: " + ch.toString());

        in.close();
    }
}