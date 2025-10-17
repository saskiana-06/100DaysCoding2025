
package D0225005;

import java.util.Scanner;

public class Day40 {
    public static void main(String[] args) {
        Scanner in =  new Scanner (System.in);
        double angka1, angka2, hasil;
        char operator;
        
        System.out.print("Masukkan angka pertama : ");
        angka1 = in.nextDouble();
        System.out.print("Masukkan operator (+, -, *, /): ");
        operator = in.next().charAt(0);
         System.out.print("Masukkan angka kedua: ");
        angka2 = in.nextDouble();

        // Menggunakan if
        if (operator == '+') {
            hasil = angka1 + angka2;
            System.out.println("Hasil: " + hasil);
        } else if (operator == '-') {
            hasil = angka1 - angka2;
            System.out.println("Hasil: " + hasil);
        } else if (operator == '*') {
            hasil = angka1 * angka2;
            System.out.println("Hasil: " + hasil);
        } else if (operator == '/') {
         if (angka2 != 0) {
                hasil = angka1 / angka2;
                System.out.println("Hasil: " + hasil);
            } else {
                System.out.println("Error: Tidak bisa dibagi 0!");
            }
        } else {
            System.out.println("Operator tidak dikenali!");
        }

    }

    
    
}
