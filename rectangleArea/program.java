import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        rectangle rec = new rectangle();

        System.out.print("Inform the width of the rectangle: ");
        rec.side1 = in.nextDouble();

        System.out.print("Inform the height of the rectangle: ");
        rec.side2 = in.nextDouble();

        System.out.print(rec.toString());

        in.close();
    }
}