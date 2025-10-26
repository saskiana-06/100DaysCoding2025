package D0225005;

import java.util.Scanner; 

public class Day49 {
    public static void main(String[] args) {
       Scanner in = new Scanner (System.in);
        System.out.print("Masukkan nama : ");
        String nama = in.nextLine();
        System.out.print("Masukkan nilai : ");
        int nilai = in.nextInt();  
        
        //Operator ternary
        String ketentuan = (nilai >=70)? "LULUS" : "REMIDI";
        System.out.println("Status:" + ketentuan);
        
       } 
    } 
        
        
        
      
