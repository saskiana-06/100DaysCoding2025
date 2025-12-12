import java.util.Scanner;

public class Day95 {

static int a (int a1, int a2){
    return a1*a2;
}
static int b (int b1, int b2){
    return b1+b2;
}
static int c (int c1, int c2){
    return c1-c2;
}
static int d (int d1, int d2){
    return d1/d2;
}
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        int angka = in.nextInt();
        int angka1 = in.nextInt();
        System.out.println("Hasil perkalian adalah : "+a(angka,angka1));
        System.out.println("Hasil penjumlahan adalah : "+b(angka,angka1));
        System.out.println("Hasil pengurangan adalah : "+c(angka,angka1));
        System.out.println("Hasil pembagian adalah : "+d(angka,angka1));
    }
}
