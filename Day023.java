package D0225005;

import java.util.Scanner;

public class Day23 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan Panjang: ");
        int panjang = in.nextInt();
        System.out.print("Masukkan Lebar: ");
        int lebar = in.nextInt();
        
        
//        menghitung luas persegi panjang
        int luas = panjang * lebar;
        System.out.println("Luas persegi panjang adalah : "+luas);
    }
  
}
