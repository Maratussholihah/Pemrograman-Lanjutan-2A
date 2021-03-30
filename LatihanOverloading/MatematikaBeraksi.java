// Nama  : Mar'atus Sholihah
// NIM   : 11200930000011
// Kelas : 2A - Sistem Informasi 
// Mata Kuliah  : Pemrograman Lanjut 
// Hari/Tanggal : Senin, 29 Maret 2021

package LatihanOverloading;

public class MatematikaBeraksi {
    public static void main(String [] args){
        MatematikaCanggih mtk= new MatematikaCanggih ();
       
        //Pemanggilan Methode pertambahan
        mtk.setPertambahan(12.5, 28.7, 14.2);
          System.out.println("Hasil Pertambahan 12.5+28.7+14.2 = " + mtk.getHasil());
        mtk.setPertambahan(12, 28, 14);
          System.out.println("Hasil Pertambahan 12+28+14 = " + mtk.getScore());
        mtk.setPertambahan(23, 34);
          System.out.println("Hasil Pertambahan 23+34 = " + mtk.getScore());
        mtk.setPertambahan(3.4, 4.9);
          System.out.println("Hasil Pertambahan 3.4+4.9 = " + mtk.getHasil());         
          
        //Pemanggilan Methode pengurangan
        mtk.setPengurangan(12.5, 28.7, 14.2);
          System.out.println("Hasil Pengurangan 12.5-28.7-14.2 = " + mtk.getHasil());
        mtk.setPengurangan(12, 28, 14);
          System.out.println("Hasil Pengurangan 12-28-14 = " + mtk.getScore());
        mtk.setPengurangan(23, 34);
          System.out.println("Hasil Pengurangan 23-34 = " + mtk.getScore());
        mtk.setPengurangan(3.4, 4.9);
          System.out.println("Hasil Pengurangan 3.4-4.9 = " + mtk.getHasil());       
          
        //Pemanggilan Methode Perkalian
        mtk.setPerkalian(12.5, 28.7, 14.2);
          System.out.println("Hasil Perkalian 12.5*28.7*14.2 = " + mtk.getHasil());
        mtk.setPerkalian(12, 28, 14);
          System.out.println("Hasil Perkalian 12*28*14 = " + mtk.getScore());
        mtk.setPerkalian(23, 34);
          System.out.println("Hasil Perkalian 23*34 = " + mtk.getScore());
        mtk.setPerkalian(3.4, 4.9);
          System.out.println("Hasil Perkalian 3.4*4.9 = " + mtk.getHasil());
                  
        //Pemanggilan Methode Pembagian
        mtk.setPembagian(12.5, 28.7, 14.2);
          System.out.println("Hasil Pembagian 12.5/28.7/14.2 = " + mtk.getHasil());
        mtk.setPembagian(12, 28, 14);
          System.out.println("Hasil Pembagian 12/28/14 = " + mtk.getScore());
        mtk.setPembagian(23, 34);
          System.out.println("Hasil Pembagian 23/34 = " + mtk.getScore());
        mtk.setPembagian(3.4, 4.9);
          System.out.println("Hasil Pembagian 3.4/4.9 = " + mtk.getHasil());
                  
        //Pemanggilan Methode Modulus 
        mtk.setModulus(12.5, 28.7, 14.2);
          System.out.println("Hasil Modulus 12.5%28.7%14.2 = " + mtk.getHasil());
        mtk.setModulus(12, 28, 14);
          System.out.println("Hasil Modulus 12%28%14 = " + mtk.getScore());
        mtk.setModulus(23, 34);
          System.out.println("Hasil Modulus 23%34 = " + mtk.getScore());
        mtk.setModulus(3.4, 4.9);
          System.out.println("Hasil Modulus 3.4%4.9 = " + mtk.getHasil());
        
   } 
}


