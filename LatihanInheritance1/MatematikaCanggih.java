// Nama  : Mar'atus Sholihah
// NIM   : 11200930000011
// Kelas : 2A - Sistem Informasi 
// Mata Kuliah  : Pemrograman Lanjut 
// Hari/Tanggal : Minggu, 28 Maret 2021

package LatihanInheritance1;

public class MatematikaCanggih extends Matematika{
 private int modulus;
    
    void setModulus (int a, int b){
        modulus=a%b;
    }
    int getModulus(){
        return modulus;
    }
}
