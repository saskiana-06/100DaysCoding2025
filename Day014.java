public class Day14 {
    public static void main(String[] args) {
        
    // MENGUBAH STRING MENJADI TIPE DATA PRIMITIF    
    //Mengubah String ke Integer
        String nana = "128";
        String darma = "166";
        
        int kamu = Integer.parseInt(nana)+Integer.parseInt(darma);
        System.out.println(kamu);
        
    //Mengubah String ke double  
       String a = "2.2";
        String b = "8.8";
        
        double kita = Double.parseDouble(a)+Double.parseDouble(b);   
        System.out.println(kita);
        
    //Mengubah String ke boolean   
       String yaya = "true";
       String yoji = "false";
        
        boolean kiki = Boolean.parseBoolean(yaya);   
        System.out.println(kiki);
        
     
    //Mengubah String ke float
        String nopa = "1.2f";
        String lopa = "8.8f";
        
        float nusa = Float.parseFloat(nopa)+Float.parseFloat(lopa);   
        System.out.println(nusa);
        
    
    //Mengubah String ke byte
        String bubu = "12";
        
        byte lala = Byte.parseByte(bubu)  ;   
        System.out.println(lala);
        
        
    //Mengubah String ke long    
        String p = "128";
        String s = "182";
        
        long yuh = Long.parseLong(p)+Long.parseLong(s);   
        System.out.println(yuh);
        
        
    //Mengubah String ke short  
        String u = "12";
        
        short yeh = Short.parseShort(u);   
        System.out.println(yeh);
        
    //Mengubah String ke char 
        String nunu = "A";
        String jiji = "S";
        
        char palu = nunu.charAt(0);   
        System.out.println(palu);
        
        
        
    }
 
}
