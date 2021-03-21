// Nama  : Mar'atus Sholihah
// NIM   : 11200930000011
// Kelas : 2 A - Sistem Informasi
// Mata Kuliah  : Pemrograman Lanjut
// Hari/Tanggal : Minggu, 21 Maret 2021

package bank;

public class BankBeraksi {
    public static void main(String[] args){
        Bank BankABC = new Bank (100000);
        BankABC.simUang (500000);
        BankABC.ambilUang (150000);
    }
}
