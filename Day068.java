import java.util.Scanner;

public class Day68 {
    public static void main(String[] args) {
        int N = 5;
        System.out.println("===POLA SEGITIGA===");
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
