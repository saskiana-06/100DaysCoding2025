import java.util.Scanner;

public class Day62 {
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();

        int total = 0;

        for (int i = 1; i <= N; i++) {
            total = total + i;
        }

        System.out.println("Jumlah nilai 1 hingga " + N + " adalah: " + total);
    }
}

   
