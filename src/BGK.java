import java.util.Random;
import java.util.Scanner;

public class BGK {

    void game() {
        int hp = 100;
        System.out.println("Permainan Batu-Gunting-Kertas");
        System.out.println("1. Batu");
        System.out.println("2. Gunting");
        System.out.println("3. Kertas");
        System.out.print("Masukkan pilihan Anda: ");

        Scanner input = new Scanner(System.in);
        int pilihan = input.nextInt();

        int komputer = new Random().nextInt(3) + 1;

        if (pilihan == komputer) {
            System.out.println("Seri!");
        } else if ((pilihan == 1 && komputer == 2) || (pilihan == 2 && komputer == 3) || (pilihan == 3 && komputer == 1)) {
            System.out.println("Menang!");
        } else {
            System.out.println("Kalah!");
            hp -= 25;
            System.out.println("HP Anda: " + hp);
        }
    }
}
