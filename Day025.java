package D0225005;

import java.util.Scanner;

public class Day25 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan angka: ");       
        int angka1 = in.nextInt();
        System.out.print(" Masukkan Angka kedua:");
        int angka2 = in.nextInt ();
        angka1++;
        angka2--;
        System.out.print("Increment\t:"+ angka1);
        System.out.print("\nDecreament\t:"+ angka2);
        System.out.println();
        
    }
  
}
