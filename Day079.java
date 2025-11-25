import java.util.Scanner;

public class Day79 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String username, password;

        //Untuk Membuat akun
        System.out.print("Buat Username: ");
        username = in.nextLine();

        System.out.print("Buat Password: ");
        password = in.nextLine();

        System.out.println("\n=== LOGIN ===");
        
        
        int coba = 0;
        // Proses login
        while (true) {
            System.out.print("Masukkan Username: ");
            String u = in.nextLine();

            System.out.print("Masukkan Password: ");
            String p = in.nextLine();

            
            if (u.equals(username) && p.equals(password)) {
                System.out.println("Login Berhasil! Selamat datang " + username);
                break; // berhenti kalau benar
                
            } else {
                coba++;
                System.out.println("Username atau Password salah! Coba lagi.\n");
                if (coba == 3) {
                    System.out.println("Akun kamu sudah terkunci! Karena sudah gagal 3 kali.");
                    break;
                }
            }
        }

    }

}
