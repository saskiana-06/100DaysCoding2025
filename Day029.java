package D0225005;

import java.util.Scanner;

public class Day29 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("masukkan angka: ");
        int p = in.nextInt();
        System.out.print("masukkan angka: ");
        int s = in.nextInt();
        
        System.out.println("Apakah nilai p sama dengan s? :" + (p > s));
        System.out.println("Apakah nilai p tidak sama dengan s? :" + (p < s));
