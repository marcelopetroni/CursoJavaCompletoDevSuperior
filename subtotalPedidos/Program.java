import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy"); 

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = in.nextLine();

        System.out.print("E-mail: ");
        String email = in.next();

        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = date.parse(in.next());
        Client client = new Client(name, email, birthDate);

        System.out.println("\nEnter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(in.next());

        Order order = new Order(new Date(), status, client);

        System.out.print("How many itens to this order? ");
        int x = in.nextInt();

        int i;
        for(i = 1; i <= x; i++) {
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            in.nextLine();
            String productName = in.nextLine();

            System.out.print("Product price: ");
            double price = in.nextDouble();

            System.out.print("Product quantity: ");
            int quantity = in.nextInt();
            Product product = new Product(productName, price);
            OrderItem it = new OrderItem(quantity, price, product);
            order.addItem(it);
        }
        System.out.print("\n" + order);

        in.close();
    }
}
