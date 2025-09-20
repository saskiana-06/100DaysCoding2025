public class evaluasi2 {
    public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
        System.out.println("Masukkan nama :\t");
        String nama = in.nextLine();
        System.out.println("Masukkan umur :\t");
        int umur = in.nextInt();
        in.nextLine();
        System.out.println("Masukkan NIM :\t");
        String NIM = in.nextLine();
        System.out.println("Masukkan Tinggi :\t");
        double tinggi = in.nextDouble();
        System.out.println("Masukkan Status :\t");
        boolean status = in.nextBoolean();
        in.nextLine();
        System.out.println("Masukkan Alamat :\t");
        String alamat = in.nextLine();
   
        System.out.print("==============BIODATA===============\n");  
        System.out.print("Nama\t\t:\t"+nama);  
        System.out.print("\nUmur\t\t:\t"+umur);  
        System.out.print("\nNIM\t\t:\t"+NIM);  
        System.out.print("\nTinggi\t\t:\t"+tinggi+ "cm");  
        System.out.print("\nStatus\t\t:\t"+status);  
        System.out.print("\nAlamat\t\t:\t"+alamat);
        System.out.print("\n===================================\n");  
       
    }
}
