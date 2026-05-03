import JOBSHEET3.Dosen08;

public class DosenMain08 {
    public static void main(String[] args) {

        Dosen08 dosen1 = new Dosen08();
        dosen1.idDosen = "DS001";
        dosen1.nama = "Dr. Budi Santoso";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2015;
        dosen1.bidangKeahlian = "Struktur Data";

        Dosen08 dosen2 = new Dosen08(
                "DS002",
                "Dr. Siti Aminah",
                false,
                2018,
                "Basis Data");

        System.out.println("=== DATA DOSEN 1 ===");
        dosen1.tampilInformasi();

        System.out.println("=== DATA DOSEN 2 ===");
        dosen2.tampilInformasi();

        dosen2.setStatusAktif(true);

        dosen1.ubahKeahlian("Algoritma");

        int masaKerja1 = dosen1.hitungMasaKerja(2026);
        int masaKerja2 = dosen2.hitungMasaKerja(2026);

        System.out.println("Masa kerja " + dosen1.nama + " : " + masaKerja1 + " tahun");
        System.out.println("Masa kerja " + dosen2.nama + " : " + masaKerja2 + " tahun");

        System.out.println("\n=== DATA SETELAH PERUBAHAN ===");
        dosen1.tampilInformasi();
        dosen2.tampilInformasi();
    }
}
