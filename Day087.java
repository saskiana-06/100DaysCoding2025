import java.util.Scanner;


public class Day87 {
    public static void main(String[] args) {
           Scanner in = new Scanner(System.in);

        int[] angka = {3, 7, 10, 15, 20};

        System.out.print("Cari angka berapa: ");
        int cari = in.nextInt();

        boolean ketemu = false;

        for (int i = 0; i < angka.length; i++) {
            if (angka[i] == cari) {
                ketemu = true;
                break;
            }
        }

        if (ketemu) {
            System.out.println("Angka ditemukan!");
        } else {
            System.out.println("Angka TIDAK ditemukan!");
        }

    }
 
}   
