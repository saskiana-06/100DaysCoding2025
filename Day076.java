public class Day76 {

    public static void main(String[] args) {
        //Penggunaan equals, IgnoreCase, contains, empty.
        String a = "Hello";
        String b = "Hello";
        String c = "hello";
        String text = "Belajar DDP itu mudah";
        String kosong = "";
        String isi = "Anaa";
        System.out.println();
        
        
        //Pencetakan dengan equals yaitu untuk mengecek apakah dua string sama persis (huruf besar/kecil juga diperhitungkan).
        System.out.println(a.equals(b)+ " Kata yang ada di a sama dengan b"); // true
        System.out.println(a.equals(c)+ " Kata yang ada di c tidak sama dengan a makanya dia false"); // false
        System.out.println();
        
        
        //Penggunaan IgnoreCase untuk membandingkan tanpa melihat huruf besar/kecil.
        System.out.println(a.equalsIgnoreCase(c) + " "); // true
        System.out.println();
        
        
        //Penggunaan contains Untuk mengecek apakah sebuah string mengandung kata tertentu.
        System.out.println(text.contains("DDP"));   // true
        System.out.println(text.contains("java")); // false
        System.out.println();
        
        
        //Penggunaan empty Untuk mengecek apakah string kosong (tidak ada karakter sama sekali).
        System.out.println(kosong.isEmpty()); // true
        System.out.println(isi.isEmpty());    // false
        // Dengan catatan jika memiliki spasi maka akan di anggap memiliki isi yang betul2 kosong adalah yang tidak memiliki spasi sama sekali.
    }

}
