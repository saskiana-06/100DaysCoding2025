import java.util.Scanner;

public class Day81 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Latihan mencari Angka Terbesar, dan Jumlahnya ===");
        System.out.print("Masukkan batas : ");
        int angka1 = sc.nextInt();
        System.out.println();
        int angka[] = new int[angka1];
        int tot = 0;
        int besar = 0;
        for (int i = 0; i < angka.length; i++) {
            angka[i] = sc.nextInt();
            
            if (angka[i] >= besar) {
                besar = angka[i];
            }
            
            tot += angka[i]; //menjumlahkan
        }
        System.out.println("Angka terbesar dari array adalah : " + besar);
        System.out.println("Total dari penjumlahan array adalah : " + tot);
        if (tot % 2 == 0) {
            System.out.println("Penjumlahan diatas adalah Angka genap");
        } else {
            System.out.println("Penjumlahan diatas  adalah Angka Ganjil");
        }
        
        
