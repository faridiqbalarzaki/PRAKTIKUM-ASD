
public class MainNilaiMahasiswa08 {

    public static void main(String[] args) {

        Mahasiswa08[] mhs = new Mahasiswa08[8];

        mhs[0] = new Mahasiswa08("Ahmad", 220101001, 2022, 78, 82);
        mhs[1] = new Mahasiswa08("Budi", 220101002, 2022, 85, 88);
        mhs[2] = new Mahasiswa08("Cindy", 220101003, 2021, 90, 87);
        mhs[3] = new Mahasiswa08("Dian", 220101004, 2021, 76, 79);
        mhs[4] = new Mahasiswa08("Eko", 220101005, 2023, 92, 95);
        mhs[5] = new Mahasiswa08("Fajar", 220101006, 2020, 88, 85);
        mhs[6] = new Mahasiswa08("Gina", 220101007, 2023, 80, 83);
        mhs[7] = new Mahasiswa08("Hadi", 220101008, 2020, 82, 84);

        NilaiMahasiswa08 nm = new NilaiMahasiswa08();

        int maxUTS = nm.utsTertinggi(mhs, 0, mhs.length - 1);
        int minUTS = nm.utsTerendah(mhs, 0, mhs.length - 1);
        double rataUAS = nm.rataUAS(mhs);

        System.out.println("Nilai UTS Tertinggi : " + maxUTS);
        System.out.println("Nilai UTS Terendah  : " + minUTS);
        System.out.println("Rata-rata Nilai UAS : " + rataUAS);

    }

}