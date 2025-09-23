import java.util.Scanner;
public class Day55 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan angka pertama :");
        int angka1 = input.nextInt();
        System.out.print("Masukkan angka kedua :");
          int angka2 = input.nextInt();
        
        
        if (angka2 !=0){
            int sisa = angka1 % angka2;
            System.out.println("Sisa hasil bagi =\t"+sisa);
            
            
        }else{
            System.out.println("Tidak dapat menghitung sisa bagi 0!");
        }
    }
  
  
}
