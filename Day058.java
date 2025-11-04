package D0225005;

import java.util.Scanner;

public class Day58 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();
        
        // Untuk Mencetak angka 1-N
        System.out.println("Angka dari 1 sampai " + N + ":");
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }
        
        System.out.println(); // baris baru
        
        // Untuk mencetak angka dari N-1
        System.out.println("Angka dari " + N + " sampai 1:");
        for (int i = N; i >= 1; i--) {
            System.out.print(i + " ");
        }
     }
        
        
    }
