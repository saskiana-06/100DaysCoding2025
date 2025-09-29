package D0225005;

import java.util.Scanner;

public class Day22 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan sisi: ");
        double sisi = in.nextDouble();
        double luas = sisi*sisi;
        System.out.println("Luas persegi adalah : "+luas);
    }
  
}
