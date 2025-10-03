
package D0225005;

import java.util.Scanner;

public class Day26 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan angka: ");       
        int angka = in.nextInt();
        System.out.print("masukkan angka kedua: ");
        int angka2 = in.nextInt();
        System.out.print("masukkan angka ketiga: ");
        int angka3 = in.nextInt();
        System.out.print("masukkan angka keempat: ");
        int angka4 = in.nextInt();
        
        angka += 2;
        angka2 -= 2;
        angka3 *= 2;
        angka4 /= 2;
        
       
        System.out.println(angka);
        System.out.println(angka2);
        System.out.println(angka3);
        System.out.println(angka4);
       
    }
  
}
  
