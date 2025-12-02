public class Day86 {
    public static void main(String[] args) {
          int[] angka = {5, 2, 9, 1, 7};

        int minimal = angka[0]; 

        for (int i = 1; i < angka.length; i++) {
            if (angka[i] < minimal) { 
                minimal = angka[i]; 
            }
        }

        System.out.println("Angka terkecil/Minimal : " + minimal);

    }
 
} 
