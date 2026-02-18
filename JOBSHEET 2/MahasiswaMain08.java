public class MahasiswaMain08 {
    public static void main(String[] args) {
        Mahasiswa08 mhs1 = new Mahasiswa08( "Muhammad Ali Farhan","2241720171",3.80,"SI 2J");

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa08 mhs2 = new Mahasiswa08("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.90);
        mhs2.tampilkanInformasi();

          Mahasiswa08 mhsFaridIqbal = new Mahasiswa08("Farid Iqbal","2241720199",3.80,"SI 1C" );
        mhsFaridIqbal.tampilkanInformasi();
    }
}