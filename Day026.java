package D0225005;

import java.util.Scanner;

public class Day26 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan angka: ");       
        int angka = in.nextInt();
        System.out.print("massukkan angka kedua: ");
        int angka2 = in.nextInt();
        
        angka += 4;
        angka2 *=6;
       
        System.out.println(angka);
        System.out.println(angka2);
        
    }
  
}
