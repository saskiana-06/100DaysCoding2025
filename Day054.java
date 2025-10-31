public class soal3 {
    public static void main(String[] args) {
        System.out.println("Menampilkan angka 1-10, kecuali kelipatan 3: ");
        
        for (int i = 1; i <= 10; i++) {
          if (i %3 == 0){
              continue;
          } 
            System.out.println(i);
        }
    }
}
  
