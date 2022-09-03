import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many products do you want to inform? ");
        int x = in.nextInt();

        product vect[] = new product[x];
        for(int i = 0; i < x; i++) {
            System.out.print("What is the name of the product? ");
            in.nextLine();
            String name = in.nextLine();
            System.out.print("What is the price of the product? ");
            double price = in.nextDouble();
            vect[i] = new product(name, price);
        }
        double sum = 0;
        for(int i = 0; i < x; i++) {
           sum += vect[i].getPrice();
        }
        double averagePrice = sum/vect.length;
        System.out.printf("\nThe average price of the products of this store is: R$%.2f.", averagePrice);

        in.close();
    }
}
