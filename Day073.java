import java.util.Scanner;

public class Day73 {
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        int Total = 0;
        int angka;
        
        while (true) {
            System.out.print("Masukkan angka (negatif untuk berhenti): ");
            angka = in.nextInt();

            if (angka < 0) {
                break;
            }
            Total += angka; 
        }
            
        System.out.println("Total penjumlahan = " + Total);
        }
    
    }    
