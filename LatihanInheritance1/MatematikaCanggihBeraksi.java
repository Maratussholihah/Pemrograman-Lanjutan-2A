// Nama  : Mar'atus Sholihah
// NIM   : 11200930000011
// Kelas : 2A - Sistem Informasi 
// Mata Kuliah  : Pemrograman Lanjut 
// Hari/Tanggal : Minggu, 28 Maret 2021 

package LatihanInheritance1;

public class MatematikaCanggihBeraksi {
  public static void main (String [] args){
        MatematikaCanggih math = new MatematikaCanggih();
        math.setPertambahan(10,10);
             System.out.println("Hasil pertambahan 10+10 adalah: " + math.getPertambahan());
        
        math.setPerkalian(10,10);
              System.out.println("Hasil perkalian 10*10 adalah: " + math.getPerkalian());
        
        math.setModulus(10,2);
             System.out.println("Hasil modulus adalah: " + math.getModulus());
    }
    
}  

