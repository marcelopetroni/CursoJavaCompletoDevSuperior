package app;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import app.entities.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int quantity = in.nextInt();

        for (int i = 1; i <= quantity; i++) {
            System.out.println("\nProduct #" + i + " data:");
            System.out.println("[1] Common\n[2] Used\n[3] Imported");
            int choice = in.nextInt();

            while (choice != 1 && choice != 2 && choice != 3) {
                System.out.println("Invalid answer. Inform: ");
                System.out.println("[1] Common\n[2] Used\n[3] Imported");
                choice = in.nextInt();
            }
            System.out.print("Name: ");
            String name = in.next();

            System.out.print("Price: ");
            Double price = in.nextDouble();

            if (choice == 1) {
                Product pd = new Product(name, price);
                list.add(pd);
            } else if (choice == 2) {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date fabrication = date.parse(in.next());
                Product pd2 = new UsedProduct(name, price, fabrication);
                list.add(pd2);
            } else {
                System.out.print("Customs fee: ");
                Double fee = in.nextDouble();
                Product pd3 = new ImportedProduct(name, price, fee);
                list.add(pd3);
            }
        }
        System.out.println("\nPRICE TAGS:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
        in.close();
    }
}
