
package D0225005;

import java.util.Scanner;

public class Day46 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Nama pelanggan: ");
        String nama = in.nextLine();
        System.out.print("===<<MENU PILIHAN MAKANAN>>===\n1- Nasi goreng\n2- Mie Ayam\n3- Sate Kambieng\nMasukkan pilihan makanan(1-3): ");
        int makan = in.nextInt();
        System.out.print("\n===<<MENU PILIHAN MINUMAN>>===\n1- Le Mineral\n2- Es Teh\n3- Pop Ice Premium\nMasukkan pilihan minuman(1-3): ");
        int minum = in.nextInt();
        System.out.println("\nNama pelanggan\t: " + nama);

        String pesanan1 = null;
        int harga = 0;
        switch (makan) {
            case 1 -> {
                pesanan1 = "Nasi goreng";
                harga = 15000;
            }
            case 2 -> {
                pesanan1 = "Mie Ayam";
                harga = 5000;
            }
            case 3 -> {
                pesanan1 = "Sate Kambing";
                harga = 25000;
            }
            default ->
                pesanan1 = "Pesanan anda tidak valid/tidak ada dalam menu!!!";
        }
        String pesanan2 = null;
        int harga1 = 0;
        switch (minum) {
            case 1 -> {
                pesanan2 = "Le Mineral";
                harga1 = 5000;
            }
            case 2 -> {
                pesanan2 = "Es Teh";
                harga1 = 5000;
            }
            case 3 -> {
                pesanan2 = "Pop Ice Premium";
                harga1 = 13000;
            }
            default ->
                pesanan2 = "PESANAN TIDAK TERSEDIA.";
        }
        int total = harga + harga1;
        System.out.printf("Makanan yang anda pesan\t: %s %s%d\n", pesanan1, "Rp.", harga);
        System.out.printf("Minuman yang anda pesan\t: %s %s%d\n", pesanan2, "Rp.", harga1);
        System.out.println("Total harga pesanan \t: " + total);
    }

}
