import java.util.Scanner;

public class Day67 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan jumlah baris : ");
        int a = in.nextInt();
        System.out.println();
        System.out.println("===POLA HORIZONTAL===");
        
        
        for (int i = 1; i <= a; i++) {
            System.out.print("*"); 
        }
        
    }
