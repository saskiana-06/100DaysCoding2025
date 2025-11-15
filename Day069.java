import java.util.Scanner;

public class EVALUASI_LAST {
    public static void main(String[] args) {
//SOAL 5
     Scanner in = new Scanner (System.in);
      System.out.print("Masukkan Ukuran N (Persegi): ");
      int N = in.nextInt();
      
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
             if (i==1 || i==N| j==1|| j==N){
                 
                 System.out.print("* "); 
             }else{
                 System.out.print("  ");
             }
                     
            }
            System.out.println(); 
            }
               
            }
        }
          
    
//SOAL 3
//        Scanner input = new Scanner(System.in);
//        System.out.print("Masukkan nilai N: ");
//        int N = input.nextInt();
//
//        long faktorial = 1;
//        for (int i = 1; i <= N; i++) {
//            faktorial *= i;
//        }
//        long temp = faktorial;
//        int jumlahDigit = 0;
//
//        if (temp == 0) {
//            jumlahDigit = 1; 
//        } else {
//            while (temp > 0) {
//                jumlahDigit++;
//                temp /= 10; 
//  }
//        } 
//        System.out.println("Hasil " + N + "! = " + faktorial);
//        System.out.println("Jumlah digit = " + jumlahDigit);
//    }
//}
        
        
        
// SOAL 2
//        Scanner in = new Scanner (System.in);
//        System.out.print("Masukkan nilai N : ");
//        int N = in.nextInt();
//        int a = 1;
//        int totgan=0;int junga=0;
//        int totgen=0;int junge=0;
//        while (N>=a){
//           if (a % 2 == 0){
//               junga++;
//               totgan+=a;
//           }else if (a % 2!=0){
//             junge++;
//             totgen+=a;
//           }
//           a++;
//        }
//        System.out.println("total angka ganjil : " + junga);
//        System.out.println("jumlah nilai ganjil : " + totgen);
//        System.out.println("total angka genap : " + junga);
//        System.out.println("jumlah nilai genap : " + totgan);
//        
//        
//        
//        
//        
//     }   
//    }   
        
//SOAL 4
//      Scanner in = new Scanner (System.in);
//      System.out.print("Masukkan Ukuran N (Persegi): ");
//      int N = in.nextInt();
//      
//        for (int i = 1; i <= N; i++) {
//            for (int j = 1; j <= N; j++) {
//             System.out.print(" * ");     
//            }
//            System.out.println();     
//            }
//             
//                
//            }
//          
//      
//        }
//        
//      
//      
//      
//        
//SOAL 1
//        Scanner in = new Scanner (System.in);
//        System.out.print("masukkan nilai : ");
//        int N = in.nextInt();
//        int Total = 0;
//        int Faktor = 1;
//        
//        System.out.print("Deret 1 ke- " + N + " : ");
//        for (int i = 1; i <= N; i++) {
//            System.out.print(i); 
//            Total += i;
//        }
//        System.out.print("\nDeret " + N + " ke-1 : ");
//       
//          do{
//         Faktor*=N;
//           System.out.print(N);
//           N--;
//       }while (N>=1);
//        System.out.println("\njumlah : "+Total);
//        System.out.println("jumlah : "+Faktor);
//  
//        }
//    }
