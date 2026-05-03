public class Mahasiswa {

    String nim;
    String nama;
    String prodi;
    boolean jenisKelamin;
    int umur;
    double ipk;

    public Mahasiswa(String nim, String nama, String prodi, boolean jenisKelamin, int umur, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.jenisKelamin = jenisKelamin;
        this.umur = umur;
        this.ipk = ipk;
    }

    void tampilData() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.println("Jenis Kelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Umur: " + umur);
        System.out.println("IPK: " + ipk);
    }
}
