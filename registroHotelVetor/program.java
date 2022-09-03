import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("How many rooms will be rented? (up to 10) ");
        int x = in.nextInt();

        while(x < 0 && x > 10) {
            System.out.println("Invalid number of rooms available, inform a quantity up to 10.");
            x = in.nextInt();
        }

        registration vect[] = new registration[10];

        for(int i = 1; i <= x; i++ ) {
            System.out.println("Rent #" + i + ":");
            System.out.print("Inform your name: ");
            in.nextLine();
            String name = in.nextLine();

            System.out.print("Inform your e-mail: ");
            String email = in.nextLine();

            System.out.println("Inform the number of the room you desire. (0-9)");
            int room = in.nextInt();

            if(vect[room] != null) {
                System.out.print("Sorry, this room is not available. Inform another room: ");
                room = in.nextInt();
                vect[room] = new registration(name, email, room);
            }
            else {
                vect[room] = new registration(name, email, room);
            }
        }

        System.out.println("\nBusy rooms:");
        for(int i = 0; i < 10; i++) {
            if(vect[i] != null) {
                System.out.println(vect[i].toString());
            }
        }

        in.close();
    }
}
