package D0225005;

import java.util.Scanner;

public class Day47 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String senin, selasa, rabu, kamis, jumat, sabtu, minggu;

        System.out.println("=== Input Jadwal Harian Kamu ===");
        System.out.print("Senin  : ");
        senin = input.nextLine();
        System.out.print("Selasa : ");
        selasa = input.nextLine();
        System.out.print("Rabu   : ");
        rabu = input.nextLine();
        System.out.print("Kamis  : ");
        kamis = input.nextLine();
        System.out.print("Jumat  : ");
        jumat = input.nextLine();
        System.out.print("Sabtu  : ");
        sabtu = input.nextLine();
        System.out.print("Minggu : ");
        minggu = input.nextLine();

        System.out.print("\nSekarang hari apa? ");
        String hari = input.nextLine();
        hari = hari.toLowerCase(); // biar input-nya gak sensitif huruf besar/kecil

        System.out.println("\n=== Jadwal Hari Ini ===");

         switch (hari) {
            case "senin":
                System.out.println("Kegiatan hari Senin: " + senin);
                break;

            case "selasa":
                // contoh pakai operator logika
                if (selasa.contains("evaluasi") || selasa.contains("presentasi")) {
                    System.out.println("Kegiatan hari Selasa: " + selasa + " (Jangan lupa siapin bahan presentasinya ya!)");
                } else {
                    System.out.println("Kegiatan hari Selasa: " + selasa);
                }
                break;

            case "rabu":
                System.out.println("Kegiatan hari Rabu: " + rabu);
                break;
             case "kamis":
                // contoh pakai if bersarang
                if (kamis.isEmpty()) {
                    System.out.println("Belum ada jadwal di hari Kamis, santai aja dulu");
                } else if (kamis.contains("kuliah")) {
                    System.out.println("Kegiatan hari Kamis: " + kamis + " (Jangan telat kuliah!)");
                } else {
                    System.out.println("Kegiatan hari Kamis: " + kamis);
                }
                break;

            case "jumat":
                System.out.println("Kegiatan hari Jumat: " + jumat + " — waktunya bersih-bersih sebelum weekend");
                break;

            case "sabtu":
                System.out.println("Kegiatan hari Sabtu: " + sabtu + " (Hari yang pas buat refreshing!)");
                break;
            case "minggu":
                if (minggu.contains("libur") || minggu.contains("tidur")) {
                    System.out.println("Kegiatan hari Minggu: " + minggu + " — Menikmati waktu istirahat dan prepare untuk weeks selanjutnya");
                } else {
                    System.out.println("Kegiatan hari Minggu: " + minggu);
                }
                break;

            default:
                System.out.println("Hari yang kamu masukkan ga valid yahh");
            }

        
        }   
    }
