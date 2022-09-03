import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is the current price of the dolar in reais? ");
        double price = in.nextDouble();

        System.out.print("How many dolars are you considering to purchase? ");
        double reais = in.nextDouble();

        double x = CurrencyConverter.conversion(price, reais);
        System.out.println("Amount to be paid in reais: R$" + x);

        in.close();
    }
}
