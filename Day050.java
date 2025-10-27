package D0225005;

import java.util.Scanner;
 
public class Day50 {
    public static void main(String[] args) {
        int[] angka = {10, 7, 22, 13, 9, 6};

        //Untuk menampilkan isi array
        System.out.println("Isi array: ");
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }

        System.out.println("\n\nHasil pengecekan ganjil / genap:");

        //Untuk mengecek ganjil/genap
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] % 2 == 0) { // menampilkan genap jika habis dibagi 2||0
                System.out.println(angka[i] + " adalah bilangan genap");
            } else { // menampilkan ganjil jika tidak habis dibagi 2||!=0
                System.out.println(angka[i] + " adalah bilangan ganjil");
            }
        }
    }
}

       
