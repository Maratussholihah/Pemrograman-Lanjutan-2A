// Nama  : Mar'atus Sholihah
// NIM   : 11200930000011
// Kelas : 2A - Sistem Informasi 
// Mata Kuliah  : Pemrograman Lanjut 
// Hari/Tanggal : Minggu, 28 Maret 2021

package LatihanInheritance2;

public class MatematikaCanggihBangetBeraksi {
     public static void main (String [] args){
        MatematikaCanggihBanget math = new MatematikaCanggihBanget();
        
        math.setpertambahanTiga(5,5,5);        
                System.out.println("Hasil dari 5 + 5 + 5 adalah : " +math.getpertambahanTiga());
        math.setpertambahan(15,15);
                System.out.println("Hasil dari 15 + 15 adalah : " +math.getpertambahan());
        math.setperkalian(20,20);
                System.out.println("Hasil dari 20 * 20 adalah : " +math.getperkalian());
        math.setmodulus(20,3);
                System.out.println("Hasil modulus adalah : " +math.getmodulus());
                
}
}

