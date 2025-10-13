package D0225005; 

import java.util.Scanner;

public class Day36 {
    public static void main(String[] args) {
Scanner in = new Scanner (System.in);
        System.out.print("Nilai UTS PSTI : ");
        int uts = in.nextInt();
        System.out.print("Nilai UAS PSTI : "); 
        int uas = in.nextInt();
        
        int rata2 = (uts+uas)/2;
        System.out.println("Nilai rata-rata PSTI : "+rata2);
        if (rata2>=75){
            System.out.println("Kategori: LULUS");
            if (uts>uas){
                System.out.println("but Nilai UTS lebih tinggi");
            }else if (uas>uts){
                System.out.println("but Nilai UAS lebih tinggi");    
            }else{
                System.out.println("but Nilai UTS dan UAS sama besar");
            }
            }else{
                    System.out.println("TIDAK LULUS");
                    }
        }

}
