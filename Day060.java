package D0225005;

import java.util.Scanner;

public class Day60 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();

        System.out.println("Angka Ganjil dari N ke 1:");
        for (int i = N; i >= 1; i--) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
           
            }    
        }    
                       
      System.out.println("\n\nAngka Genap dari N ke 1: ");
        for (int j = N; j >=1; j--) {
            if (j % 2 == 0) { 
                System.out.print(j + " ");
               
                }
                
            }
        System.out.println();
        }        
                
                
            }
        
