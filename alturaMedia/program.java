import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many people do you want to inform? ");
        int x = in.nextInt();

        person vect[] = new person[x];
        for(int i = 0; i < x; i++) {
            System.out.print("Name of the individual? ");
            in.nextLine();
            String name = in.nextLine();

            System.out.print("Age of the individual? ");
            int age = in.nextInt();

            System.out.print("Height of the individual? ");
            double height = in.nextDouble();
            System.out.print("\n");

            vect[i] = new person(name, age, height);
        }
        double sum = 0, count = 0;
        for(int i = 0; i < x; i++) {
            sum += vect[i].getHeight();
            if(vect[i].getAge() < 16) {
                count ++;
            }
        }
        double average = sum/vect.length;
        System.out.printf("The average height: %.2fm.\n", average);

        double young = (count/vect.length) * 100;
        System.out.print("People who have less than 16 years old: " + String.format("%.2f", young) + "%.\n");
        for(int i = 0; i < x; i++) {
            if(vect[i].getAge() < 16) {
                System.out.println(vect[i].getName());
            }
        }
        in.close();
    }
}
