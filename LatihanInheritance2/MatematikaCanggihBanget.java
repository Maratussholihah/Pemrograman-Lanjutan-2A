// Nama  : Mar'atus Sholihah
// NIM   : 11200930000011
// Kelas : 2A - Sistem Informasi 
// Mata Kuliah  : Pemrograman Lanjut 
// Hari/Tanggal : Minggu, 28 Maret 2021

package LatihanInheritance2;

public class MatematikaCanggihBanget extends MatematikaCanggih{
    private int pertambahan;
    void setpertambahan(int a , int b)
    { pertambahan = a+b;}
        int getpertambahan()
        { return pertambahan;}
    
    private int perkalian;   
     void setperkalian ( int a, int b)
     { perkalian = a*b;}
        int getperkalian()
        { return perkalian;}
    
    private int modulus;
     void setmodulus ( int a, int b)
     {modulus = a%b;}
        int getmodulus()
        { return modulus;}
}
