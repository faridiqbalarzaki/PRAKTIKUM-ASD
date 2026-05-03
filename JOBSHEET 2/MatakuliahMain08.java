public class MatakuliahMain08 {
    public static void main(String[] args) {

        Matakuliah08 mk1 = new Matakuliah08();
        mk1.kodeMK = "ALSD01";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);
        mk1.tampilInformasi();

        Matakuliah08 mk2 = new Matakuliah08(
                "BD02",
                "Basis Data",
                3,
                6);

        mk2.tampilInformasi();
        mk2.ubahSKS(2);
        mk2.tambahJam(1);
        mk2.kurangiJam(3);
        mk2.tampilInformasi();
    }
}
