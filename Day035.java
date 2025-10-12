package D0225005; 

import java.util.Scanner;

public class Day35 {
    public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
        System.out.print("masukkan nilai : ");
        int nilai = in.nextInt();
        if (nilai >= 70){
            System.out.println("Maka Aca Lulus");
        }else if (nilai >=60){
            System.out.println("Maka Aca mengulang");
        }else {
            System.out.println("Aca tidak lulus");
        }
    
         
    }
  
} 
