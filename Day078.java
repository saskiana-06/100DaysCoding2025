import java.util.Scanner;

public class Day78 {

    // Method non-void: mengubah ke huruf besar
    public static String keHurufBesar(String teks) {
        return teks.toUpperCase();
    }

    // Method non-void: menghitung panjang teks
    public static int panjangTeks(String teks) {
        return teks.length();
    }

    // Method non-void: mengambil sebagian teks
    public static String potongTeks(String teks) {
        return teks.substring(0, 3);   // ambil 3 huruf pertama
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan sebuah kata: ");
        String kata = in.nextLine();

        System.out.println("\n=== HASIL ===");
        System.out.println("Huruf besar : " + keHurufBesar(kata));
        System.out.println("Panjang kata: " + panjangTeks(kata));

        // cek aman untuk substring
        if (kata.length() >= 3) {
            System.out.println("3 huruf pertama: " + potongTeks(kata));
        } else {
            System.out.println("Kata terlalu pendek untuk dipotong.");
        }
    }
}
