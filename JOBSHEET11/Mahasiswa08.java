package JOBSHEET11;

public class Mahasiswa08 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa08() {
    }

    public Mahasiswa08(String nm, String name, String kls, double ip) {
        this.nim = nm;
        this.nama = name;
        this.kelas = kls;
        this.ipk = ip;
    }

    public void tampilInformasi() {
        System.out.println(nama + "\t\t" + nim + "\t\t" + kelas + "\t\t" + ipk);

    }
}