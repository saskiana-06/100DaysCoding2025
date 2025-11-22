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
        
        
        //Pencetakan dengan equals 
        System.out.println(a.equals(b)); // true
        System.out.println(a.equals(c)); // false
        System.out.println();
        
        
        //Penggunaan IgnoreCase
        System.out.println(a.equalsIgnoreCase(c)); // true
        System.out.println();
        
        
        //Penggunaan contains
        System.out.println(text.contains("DDP"));   // true
        System.out.println(text.contains("java")); // false
        System.out.println();
        
        
        //Penggunaan empty
        System.out.println(kosong.isEmpty()); // true
        System.out.println(isi.isEmpty());    // false
    }

}
