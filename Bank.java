// Nama  : Mar'atus Sholihah
// NIM   : 11200930000011
// Kelas : 2 A - Sistem Informasi
// Mata Kuliah  : Pemrograman Lanjut
// Hari/Tanggal : Minggu, 21 Maret 2021

package bank;

public class Bank {

    int saldo, simUang, ambilUang;
    public Bank (int saldo){
        this.saldo=saldo;
        System.out.println("Selamat datang di Bank ABC");
        System.out.println("Saldo saat ini: RP"+saldo);
        }
    void simUang(int simUang){
        System.out.println("Simpan uang: Rp"+simUang);
        System.out.println("Saldo saat ini: Rp"+saldo);
    }
    void ambilUang(int simUang){
        System.out.println("Ambil uang: RP" +ambilUang);
        System.out.println("Saldo saat ini:"+saldo);
    }
    }
    
    
    

