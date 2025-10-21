
package D0225005;

import java.util.Scanner;

public class Day44 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan Nilai UTS: ");
        int nilai = in.nextInt();
        char predikat;
        
        if (nilai >= 90){
            predikat = 'A';
        }else if (nilai >= 80){
            predikat = 'B';
        }else if (nilai >= 70){
            predikat = 'C';
        }else if (nilai >= 60){
            predikat = 'D';
        }else{
            predikat = 'E';
        }
        System.out.println("Predikat nilai kamu adalah : "+predikat);
        
        }
    }
