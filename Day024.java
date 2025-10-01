package D0225005;

import java.util.Scanner;

public class Day24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("masukkan jari-jari lingkaran : ");
        double r = in.nextDouble();
        
        double Luas = Math.PI * r * r;
        System.out.printf("Luas lingkaran dengan jari-jari %.2f adalah : %.2f\n", r, Luas);
    }
}
