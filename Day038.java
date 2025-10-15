package D0225005;

import java.util.Scanner;

public class Day38 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("masukkaan angka : ");
        int angka = in.nextInt();
        
        if (angka > 0){
            System.out.println("ANGKA POSITIF");
        }else if (angka < 0){
            System.out.println("ANGKA NEGATIF");
        }else{
            System.out.println("ANGKA NOL");
        }
    }
        
    
}
