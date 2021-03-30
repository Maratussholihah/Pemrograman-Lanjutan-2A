// Nama  : Mar'atus Sholihah
// NIM   : 11200930000011
// Kelas : 2A - Sistem Informasi 
// Mata Kuliah  : Pemrograman Lanjut 
// Hari/Tanggal : Senin, 29 Maret 2021

package LatihanOverloading;

public class Matematika {
   private int Score;
   private double Hasil;
   
    //Methode integer dengan 2 parameter
    void setPertambahan(int a, int b){
        Score=a+b;
    }
    void setPengurangan(int a, int b){
        Score=a-b;
    }
    void setPerkalian(int a, int b){
        Score=a*b;
    }
    void setPembagian(int a, int b){
        Score=a/b;
    }

    //Methode integer dengan 3 parameter
    void setPertambahan(int a, int b, int c){
        Score=a+b+c;
    }
    void setPengurangan(int a, int b, int c){
        Score=a-b-c;
    }
    void setPerkalian(int a, int b, int c){
        Score=a*b*c;
    }
    void setPembagian(int a, int b, int c){
        Score=a/b/c;
    }
    int getScore(){
    return Score;
    }
    
    
    //Methode double dengan 2 parameter
    void setPertambahan(double a, double b){
        Hasil=a+b;
    }
    void setPengurangan(double a, double b){
        Hasil=a-b;
    }
    void setPerkalian(double a, double b){
        Hasil=a*b;
    }
    void setPembagian(double a, double b){
        Hasil=a/b;
    }
    
    //Methode double dengan 3 Parameter
    void setPertambahan(double a, double b, double c){
        Hasil=a+b+c;
    }
    void setPengurangan(double a, double b, double c){
        Hasil=a-b-c;
    }
    void setPerkalian(double a, double b, double c){
        Hasil=a*b*c;
    }
    void setPembagian(double a, double b, double c){
        Hasil=a/b/c;
    }
    double getHasil(){
    return Hasil;
    }
} 

   
