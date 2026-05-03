package CM_modif;

public class Peminjaman08 {

    Mahasiswa08 mhs;
    Buku08 buku;
    int lamaPinjam;
    int denda;
    String status;

    Peminjaman08(Mahasiswa08 mhs, Buku08 buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        this.hitungDenda();

    }

    // hitung denda
    void hitungDenda() {
        if (lamaPinjam > 5) {
            int terlambat = lamaPinjam - 5;
            denda = terlambat * 2000;
        } else {
            denda = 0;
        }
    }

    // status
    void setStatus() {
        if (lamaPinjam <= 5) {
            status = "Tepat Waktu";

        } else {
            status = "Terlambat";
        }
    }

    void tampil() {
        hitungDenda();
        setStatus();
        System.out.println(mhs.nim + " | " + mhs.nama + " | " +
                buku.judul + " | " + lamaPinjam + " hari | Denda: " + denda + " | " + status);
    }
}
