import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List <employee> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        double n = in.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.println("\nEmployee #" + i + ":");
            System.out.print("Id: ");
            Integer id = in.nextInt();
            System.out.print("Name: ");
            in.nextLine();
            String name = in.nextLine();
            System.out.print("Salary: ");
            Double salary = in.nextDouble();
            employee emp = new employee(id, name, salary);
            list.add(emp);
        }
        System.out.print("Enter the employee id that will receive a salary increase: ");
        int y = in.nextInt();

        if(condition(list, y) >= 0) {
            System.out.print("Enter the percentage of raise: ");
            Double raise = in.nextDouble();
            list.get(condition(list, y)).salaryRaise(raise);
        
            for(int z = 0; z < list.size(); z++) {
                System.out.println(list.get(z).toString());
            }
        }
        else {
            System.out.println("\nThis id do not exist!");
        for(int z = 0; z < list.size(); z++) {
            System.out.println(list.get(z).toString());
        }
        }
        
        in.close();
    }
    public static int condition(List<employee> list, int id) {
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
