// Nama  : Mar'atus Sholihah
// NIM   : 11200930000011
// Kelas : 2 A - Sistem Informasi
// Mata Kuliah  : Pemrograman Lanjut
// Hari/Tanggal : Minggu, 21 Maret 2021

package bank;

public class BankBeraksi {
    public static void main(String[] args){
        Bank bankhappy = new Bank (200000);
        bankhappy.simUang (100000);
        bankhappy.ambilUang (50000);
    }
}
