public class Day93 {

   
    public static double bulatAtas(double angka) { // Method untuk ceil (membulatkan ke atas)
        return Math.ceil(angka);
    }

    
    public static double bulatBawah(double angka) { // Method untuk floor (membulatkan ke bawah)
        return Math.floor(angka);
    }

    
    public static long bulatNormal(double angka) { // Method untuk round (pembulatan normal)
        return Math.round(angka);
    }

    public static void main(String[] args) {

        double nilai = 6.4;

        System.out.println("Nilai asli = " + nilai);

        System.out.println("Ceil  = " + bulatAtas(nilai));
        System.out.println("Floor = " + bulatBawah(nilai));
        System.out.println("Round = " + bulatNormal(nilai));
    }
}
