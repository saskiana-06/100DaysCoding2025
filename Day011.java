public class Day11 {
    public static void main(String[] args) {
       Scanner in = new Scanner (System.in);
        String nama,alamat,prodi;
        int umur,jumlahAdik,TTL;
        System.out.print(" Masukkan nama :");
        nama = in.nextLine();
        System.out.print("Masukkan alamat :");
        alamat = in.nextLine();
        System.out.print("Maasukkan prodi :");
        prodi = in.nextLine();
        System.out.print("Masukkan umur :");
        umur = in.nextInt();
        System.out.print("Masukkan jumlahAdik :");
        jumlahAdik = in.nextInt();
        System.out.print("Masukkan TTL :");
        TTL = in.nextInt();
      
        
        System.out.println("Nama saya :"+ nama);
        System.out.println("Alamat saya :"+ alamat);
        System.out.println("Prodi:"+ prodi);
        System.out.println("Umur saya:"+umur);
        System.out.println("Jumlah Adik saya:"+jumlahAdik);
        System.out.println("Tahun Tanggal Lahir:"+TTL);
        
       
       
    }
 
}
