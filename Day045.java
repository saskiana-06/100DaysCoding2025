package D0225005;

import java.util.Scanner;

public class Day45 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Pilih menu makanan dari (1-3): ");
        int pilihan = in.nextInt();
        String menu = null;
        
        switch(pilihan){
            case 1 :
                menu = "Kamu dapat cireng";
                break;
            case 2 : 
                menu = "Kamu dapat dimsum";
                break;
            case 3 :
                menu = "Kamu dapat Bakso"; 
                break;
            default : 
               menu = "Pilihan tidak tersedia, silahkan coba lagi.";
                break;

        
            }
            System.out.println(menu);
        }
    }
