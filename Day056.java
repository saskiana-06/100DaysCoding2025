import java.util.Scanner;


public class Day56 {
    public static void main(String[] args) {
    Scanner in = new  Scanner (System.in);
        int angka;

        do {
            System.out.print("Masukkan angka (0 untuk berhenti): ");
            angka = in.nextInt();
        } while (angka != 0);

        System.out.println("Program selesai.");

    }
}
