package D0225005;

import java.util.Scanner;

public class Day28 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("masukkan angka: ");
        int a = in.nextInt();
        System.out.print("masukkan angka: ");
        int b = in.nextInt();
        
        System.out.println("Apakah nilai a sama dengan b? :"+(a==b));
        System.out.println("Apakah nilai a tidak sama dengan b? :"+(a!=b));
    }
  
}
