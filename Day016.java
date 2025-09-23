import java.util.Scanner;
public class Day16 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan angka pertama :");
        double angka1 = input.nextDouble();
        System.out.print("Masukkan angka kedua :");
         double angka2 = input.nextDouble();
        
        
        double Hasil_Perkalian = angka1 * angka2;
        System.out.println("Hasil perkalian\t" + Hasil_Perkalian);
      
        double Hasil_Pembagian = angka1 / angka2;
        System.out.println("Hasil pembagian\t" + Hasil_Pembagian);
       
    }
 
        
        
    
  
}
