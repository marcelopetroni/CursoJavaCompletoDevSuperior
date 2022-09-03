import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        student std = new student();

        System.out.print("Inform your first grade: ");
        std.grade1 = in.nextDouble();

        while(std.grade1 < 0 || std.grade1 > 30) {
            System.out.println("Please inform a grade between 0 and 30.");
            std.grade1 = in.nextDouble();
        }
        System.out.print("Inform your second grade: ");
        std.grade2 = in.nextDouble();

        while(std.grade2 < 0 || std.grade2 > 35) {
            System.out.println("Please inform a grade between 0 and 35.");
            std.grade2 = in.nextDouble();
        }
        System.out.print("Inform your third grade: ");
        std.grade3 = in.nextDouble();

        while(std.grade3 < 0 || std.grade3 > 35) {
            System.out.println("Please inform a grade between 0 and 35.");
            std.grade3 = in.nextDouble();
        }
        System.out.println(std.result());

        in.close();
    }
}