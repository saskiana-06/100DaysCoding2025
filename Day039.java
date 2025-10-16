package D0225005;

import java.util.Scanner;

public class Day39 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== MENU MAKANAN ===");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Ayam");
        System.out.println("3. Soto Ayam");
        System.out.print("Pilih menu (1-3): ");
        int pilihan = input.nextInt();
 
        if (pilihan == 1) {
            System.out.println("Kamu memilih Nasi Goreng");
        } else if (pilihan == 2) {
            System.out.println("Kamu memilih Mie Ayam");
        } else if (pilihan == 3) {
            System.out.println("Kamu memilih Soto Ayam");
        } else {
            System.out.println("Pilihan tidak tersedia");
        }
    }
}
