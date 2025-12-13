import java.util.Scanner;


public class Day97 {
    static int persegi (int sisi){
        return sisi*sisi;
    }
        
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int a = in.nextInt();
        System.out.println("Hasilnya adalah : "+ persegi(a));
           
    }
  
}
