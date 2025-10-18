package Day1Coding;

import java.util.Scanner;

public class EVAL {
    public static void main(String[] args) {
      //SOAL 5  
      Scanner sc = new Scanner (System.in);
		int mangga = 12000;
		int alpukat = 15000;
		int jeruk = 10000;
		
		System.out.print("=== ISC Cafe ===");
		System.out.println("\n1. Kopi" + 
		                   "\n2. Jus" + 
		                   "\n3. Keluar");
		System.out.print("Pilih kategori (1-3): ");
		byte kategori = sc.nextByte();
		
		if (kategori == 1){
		    System.out.println("=== Menu Kopi ===" + 
		                       "\n1. Americano (Rp12.000)" + 
		                       "\n2. Kapal Api (Rp10.000)" + 
		                       "\n3. Hytam (Rp5.000)");
		}else if(kategori == 2){
		    System.out.println("\n=== Menu Jus ===" + 
		                       "\n1. Jus Mangga (Rp12.000)" + 
		                       "\n2. Jus Alpukat (Rp15.000)" + 
		                       "\n3. Jus Jeruk (Rp10.000)");
		System.out.print("Pilih menu (1-3): ");
		byte menu = sc.nextByte();
		System.out.print("\nMasukkan jumlah pesanan: ");
		byte jumlah = sc.nextByte();
		
		if ( menu == 1 ){
		    System.out.println("\nAnda memesan "+jumlah+" mangga");
		    System.out.println("Total bayar Rp"+jumlah*mangga);
		}else if (menu == 2){
		    System.out.println("\nAnda memesan "+jumlah+" alpukat");
		    System.out.println("Total bayar Rp"+jumlah*alpukat);
		}else if(menu == 3){
		    System.out.println("\nAnda memesan "+jumlah+" jeruk");
		    System.out.println("Total bayar Rp"+jumlah*jeruk);
		}
		
		System.out.println("\nPilih metode pembayaran: " + 
		                   "\n1. Cash" + 
		                   "\n2. QRIS");
		System.out.print("Masukkan pilihan (1-2): ");
		byte bayar = sc.nextByte();
		
		if ( bayar == 1){
		    System.out.println("Pembayaran dengan Cash. Silahkan bayar di kasir");
		}else{
		    System.out.println("Pembayaran dengan QRIS. Silahkan scan QR");
		}
		    
		}else{
		    System.out.println("Dadahh");
		}
	}
}
      
      
      
  //SOAL 4    
//        System.out.print("Masukkan kecepatan kendaraan (km/jam): ");
//        int kecepatan = in.nextInt();
//        System.out.print("Masukkan batas kecepatan jalan (km/jam): ");
//        int batas = in.nextInt();
//        
//        if (kecepatan <40){
//            System.out.println("Terlalu lambat, bisa mengganggu lalu lintas");
//        }else if (kecepatan >= 40 && kecepatan<=batas){
//            System.out.println("kecepatan normal");
//        }else if (kecepatan> batas && kecepatan<= batas+20){
//            System.out.println("Hati-hati, anda melebihi batas!");
//        }else if (kecepatan> batas+20){
//            System.out.println("Bahaya! Anda ,melaju terlalu cepat");
//        }else{
//            System.out.println("anda aman.");
//        } 
//      
      
      
      
      
      
 //SOAL 3     
//        System.out.println("Apakah anda member? (true/false)");
//        boolean member = in.nextBoolean();
//        System.out.println("Masukkan total belanja (Rp): ");
//        int belanja = in.nextInt();
//        if (belanja >=500000 && belanja <=50000){
//            System.out.println("Anda mendapat diskon 25%!");
//        }else{
//            System.out.println("Dapat diskon 10%");
//        }
        
        
// SOAL2      
//     Scanner in = new Scanner (System.in);
//        System.out.print("Masukkan daya Listrik: ");
//        int watt = in.nextInt();
//        
//        if (watt <= 2200 && watt != 2200 ){
//            System.out.println(" Status : Daya aman");
//        }else{
//            System.out.println("Status: Daya tidak aman");
//        }
        
       
        
        
 //SOAL1       
//        Scanner in = new Scanner (System.in);
//        System.out.print("masukkan nilai Asep : ");
//        int a = in.nextInt();
//      
//        System.out.print("masukkan nilai Budi : ");
//        int b = in.nextInt();
//        
//        if (a >= b){
//            System.out.println("Asep memiliki nilai lebih tinggi"); 
//        }else if(b >= a){
//            System.out.println("Budi memiliki nilai lebih tinggi");
//            
//        }else{
//            System.out.println("nilai sama");
//        }
                
    
//}
//    
//  
//}
