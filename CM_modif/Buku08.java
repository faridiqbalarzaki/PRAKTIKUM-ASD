package CM_modif;

public class Buku08 {

    String kode;
    String judul;
    int tahun;

    Buku08(String kode, String judul, int tahun) {
        this.kode = kode;
        this.judul = judul;
        this.tahun = tahun;
    }

    void tampil() {
        System.out.println("Kode: " + kode + " | " + "Judul: " + judul + " | " + "Tahun: " + tahun);
    }
}
