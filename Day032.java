package Day1Coding;

import java.util.Scanner;

public class Day28 {
    public static void main(String[] args) {
       Scanner in = new Scanner (System.in);
        System.out.print("masukkan angka: ");
       int tahun = in.nextInt(); 
        if((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)){
        System.out.println(tahun+"adalah tahun kabisat");
            
        }else{
      System.out.println(tahun+"bukan tahun kabisat");
       
                
                }

    }
  
}
