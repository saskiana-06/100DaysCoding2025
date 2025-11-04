package D0225005;

import java.util.Scanner;

public class DAY59 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();
        
        System.out.println("Angka ganjil dari 1 sampai " + N + ":");
        for (int i = 1; i <= N; i++) {
            if (i % 2 != 0) { // jika sisa bagi 2 tidak 0, berarti ganjil
                System.out.print(i + " ");
            }
        }
        
        System.out.println("\nAngka genap dari 1 sampai " + N + ":");
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) { // jika sisa bagi 2 = 0, berarti genap
                System.out.print(i + " ");
            }
        }
    }
}
