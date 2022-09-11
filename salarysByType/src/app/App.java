package app;

import java.util.ArrayList;
import java.util.List;
import app.entities.*;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        List <Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int quantity = in.nextInt();

        for(int i = 1; i <= quantity; i++) {
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsorced? (y/n) ");
            char condition = in.next().charAt(0);
            condition = Character.toLowerCase(condition);

            while(condition != 'y' && condition != 'n') {
                System.out.print("Invalid value. Inform 'y' for yes or 'n' for no: ");
                condition = in.next().charAt(0);
                condition = Character.toLowerCase(condition);
            }
            System.out.print("Name: ");
            String name = in.next();

            System.out.print("Hours of work: ");
            Integer hours = in.nextInt();

            System.out.print("Value per hour: ");
            Double valuePerHour = in.nextDouble();

            if(condition == 'n') {
                Employee emp = new Employee(name, hours, valuePerHour);
                list.add(emp);
            }
            else {
                System.out.print("Aditional Charge? ");
                Double charge = in.nextDouble();
                Employee emp2 = new OutsorcedEmployee(name, hours, valuePerHour, charge);
                list.add(emp2);
            }
        }
        System.out.println("PAYMENTS:");
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
        in.close();
    }
}
