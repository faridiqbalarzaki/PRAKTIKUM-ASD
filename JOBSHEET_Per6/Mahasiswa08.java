package JOBSHEET_Per6;

public class Mahasiswa08 {

    String nim;
    String nama;
    String kelas;
    double ipk;

    // konstruktor
    Mahasiswa08() {

    }

    // konstruktor berparameter
    Mahasiswa08(String nm, String nama, String kelas, double ipk) {
        this.nim = nm;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    void tampilkanInformasi() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK : " + ipk);
    }
}
