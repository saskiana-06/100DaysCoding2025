public class Day12 {
    public static void main(String[] args) {
        
        //konstanta digunakan agar variabel tidak bisa kita ubah
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nama\t: ");
        final String nama = in.nextLine(); 
        System.out.print("Masukkan NIM\t: ");
        String nim = in.nextLine();
        System.out.print("Masukkan umur\t: ");
        int umur = in.nextInt();
        System.out.print("Masukkan gender\t: ");
        char gender = in.next().charAt(0);
        System.out.println();
        System.out.println("Perkenalkan nama saya\t: "+nama);
        System.out.println("Dengan NIM \t\t: "+nim);
        System.out.println("Saya berumur\t\t: "+umur+" tahun");
        System.out.println("Gender saya\t\t: "+gender);
  
    }
}
