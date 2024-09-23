import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] rooms = new Rent[10];

        System.out.print("How many people will rent the room?: ");
        int listSize = sc.nextInt();

        //Date entry
        for (int i = 0; i < listSize; i++) {
            System.out.println("Rent #" + (i + 1) + ":");

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.next();

            System.out.print("Room (0-9): ");
            int room = sc.nextInt();

            rooms[room] = new Rent(name, email);
        }

        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null) {
                System.out.println("Room " + i + ": " + rooms[i]);
            }
        }

        sc.close();
    }

}