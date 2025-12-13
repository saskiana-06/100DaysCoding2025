import java.util.Scanner;


public class fibbonacci {
    public static void main(String[] args) {
       Scanner in = new Scanner (System.in);
       int a = in.nextInt();
       
       int b =0;
       int c = 1;
        System.out.print("Deret Fibbonacci : ");
        for (int i = 1; i <= a; i++) {
            System.out.print(b+ " "); 
            int d = b+c;
            b=c;c=d;
        }System.out.println(" ");
         
    }
}
