// Nama  : Mar'atus Sholihah
// NIM   : 11200930000011
// Kelas : 2A - Sistem Informasi 
// Mata Kuliah  : Pemrograman Lanjut 
// Hari/Tanggal : Senin, 29 Maret 2021

package LatihanOverloading;
public class MatematikaCanggih extends Matematika {
    private int Score;
    private double Hasil;
    
//Modulus integer dengan 2 parameter
void setModulus(int a, int b){
    Score=a%b;
}
    
//Modulus integer dengan 3 parameter
void setModulus(int a, int b, int c){
     Score=a%b%c;
 }
     int getScore(){
        return Score;
    }
     
//Modulus double dengan 2 parameter
void setModulus(double a, double b){
    Hasil=a%b;
}
   
//Modulus double dengan 3 parameter 
void setModulus(double a, double b, double c){
    Hasil=a%b%c;
}
     double getHasil(){
    return Hasil;
    }
}
