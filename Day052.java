package D0225005;

import java.util.Scanner;
 
public class Day52 {
    public static void main(String[] args) {
int angka = 1;
            System.out.println("Bilangan ganjil dari 1 sampai 40:");
                
            while (angka <= 40) {
            if (angka % 2 != 0) {
                System.out.println(angka);
             }
            angka++;
        }
                System.out.println("Finally!!");
    }
}
