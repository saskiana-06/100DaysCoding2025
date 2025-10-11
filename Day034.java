
package D0225005; 

import java.util.Scanner;

public class Day34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nilai Teori : ");
        int a = in.nextInt();
        System.out.print("Nilai Praktek : ");
        int k = in.nextInt();
        if (a>=75 && k>=70) {
            System.out.println("Selamat, Anda Lulus.");
        } else if(a>=60 || k>=65) {
            System.out.println("Maaf, anda belum lulus.");
        }else{
            System.out.println("Silahkan Mengulang Tahun Depan.");
        }
}
  
} 
