package D0225005;

import java.util.Scanner;

public class Day31 {
    public static void main(String[] args) {
       Scanner in = new Scanner (System.in);
        System.out.print("masukkan angka: ");
       int a = in.nextInt(); 
        System.out.print("masukkan angka: ");
       int b = in.nextInt(); 
        
       boolean c = a>=b && b<=a; 
       boolean d = a<=b && b>=a;
        System.out.println("Apakah nilai a lebih besar sama dengan b dan apakah nilai b lebih kecil sama dengan a?: " +c);
        System.out.println("Apakah nilai a lebih kecil sama dengan b dan apakah nilai b lebih besar sama dengan a?: " +d);
      
        
    }
  
}
