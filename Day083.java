import java.util.Scanner;

public class Day83 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Menjumlahkan Nilai Array ===");
        System.out.print("Masukkan batas jumlah array : ");
        int angka1 = sc.nextInt();
        System.out.println();
        int angka[] = new int[angka1];
        int tot = 0;
        for (int i = 0; i < angka.length; i++) {
            angka[i] = sc.nextInt();
            tot += angka[i]; //menjumlahkan
        }
        System.out.println("Total dari penjumlahan array adalah : " + tot);

    }
}
