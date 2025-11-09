import java.util.Scanner;

public class Day63 {
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();

        int total = 1;

        for (int i = 1; i <= N; i++) {
            total = total * i; 
        }

        System.out.println("Jumlah perkalian dari 1 sampai   " + N + " adalah: " + total);
    }
}
