import java.util.Scanner;

public class Day53 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Masukkan angka : ");
        int angka = in.nextInt();
        int i = 1;
        while (i <= angka){
            if (i == 15){
                System.out.println("Berhenti, karena angka sudah 15");
                break;
            }
            System.out.println("Angka : " + i);
            i++;
        }
        System.out.println("Program berhenti");
        }
}
