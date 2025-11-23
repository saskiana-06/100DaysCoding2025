import java.util.Scanner;

public class Day77 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // ===== SUBSTRING MENGAMBIL SEBAGIAN TEKS =====
        System.out.print("\nMasukkan kalimat: ");
        String kalimat = in.nextLine();
        System.out.print("Ambil substring mulai index: ");
        int start = in.nextInt();
        System.out.print("Sampai index (akhir): ");
        int end = in.nextInt();
        in.nextLine(); // clear buffer

        String hasilSubstring = kalimat.substring(start, end);
        System.out.println("Hasil substring: " + hasilSubstring);

        // ===== TRIM UNTUK MENGHAPUS SPASI AWAL & AKHIR =====
        System.out.print("Masukkan teks dengan spasi di depan/belakang: ");
        String teksTrim = in.nextLine();
        System.out.println("Hasil trim: '" + teksTrim.trim() + "'");

        

        // ===== REPLACE MENGGANTI KARAKTER KATA =====
        System.out.print("\nTeks yang ingin diganti: ");
        String kalimat2 = in.nextLine();

        System.out.print("Kata yang dicari: ");
        String cari = in.nextLine();

        System.out.print("Diganti menjadi: ");
        String ganti = in.nextLine();

        String hasilReplace = kalimat2.replace(cari, ganti);
        System.out.println("Hasil replace: " + hasilReplace);
    }
}
