package D0225005;

import java.util.Scanner;

public class Day42 {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nama karyawan : ");
        String nama = in.nextLine();
        System.out.print("Masukkan Gaji pokok : ");
        double gaji = in.nextDouble();
        System.out.println();
        System.out.println("Nama Karyawan\t: "+nama);
        System.out.println("Total gaji kotor: "+gaji);
        System.out.println();
        double pajak = 0;
      if(gaji>5000000){
          pajak =  gaji*12/100.0;
          gaji = gaji-pajak;
          System.out.println("Ada potongan pajak sebesar "+pajak);
          System.out.println("Total gaji bersih anda "+gaji);
      }else{
          System.out.println("Tidak ada potongan pajak ");
          System.out.println("Total gaji bersih anda "+gaji);
        }
      }
    }
