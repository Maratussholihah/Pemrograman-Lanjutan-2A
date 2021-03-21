// Nama  : Mar'atus Sholihah
// NIM   : 11200930000011
// Kelas : 2 A - Sistem Informasi
// Mata Kuliah  : Pemrograman Lanjut
// Hari/Tanggal : Sabtu, 20 Maret 2021

package hp;

public class HandphoneBeraksi {
    public static void main (String[] args){
        HandPhone handphonesholihah = new HandPhone ();
        handphonesholihah.Nyalahkan = "Handphone Nyala";
        handphonesholihah.LakukanPanggilan = "Kring kring kring panggilan dilakukan";
        handphonesholihah.KirimSMS = "Dung dung dung SMS berhasil terkirim";
        handphonesholihah.Matikan = "Handphone mati";
System.out.println(handphonesholihah.Nyalahkan);
System.out.println(handphonesholihah.LakukanPanggilan);
System.out.println(handphonesholihah.KirimSMS);
System.out.println(handphonesholihah.Matikan);
    }
    
}
