import java.util.Scanner;

public class NilaiAkhirMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir ");

        System.out.print("Masukkan Nilai Tugas: ");
        double tugas = sc.nextDouble();

        System.out.print("Masukkan Nilai Kuis: ");
        double kuis = sc.nextDouble();

        System.out.print("Masukkan Nilai UTS: ");
        double uts = sc.nextDouble();

        System.out.print("Masukkan Nilai UAS: ");
        double uas = sc.nextDouble();

        if (!valid(tugas) || !valid(kuis) || !valid(uts) || !valid(uas)) {
            System.out.println("\nnilai tidak valid");
            return;
        }
        double nilaiAkhir = (0.20 * tugas) +
                (0.20 * kuis) +
                (0.30 * uts) +
                (0.40 * uas);

        String huruf;
        String keterangan;

        if (nilaiAkhir >= 80) {
            huruf = "A";
            keterangan = "LULUS";
        } else if (nilaiAkhir >= 73) {
            huruf = "B+";
            keterangan = "LULUS";
        } else if (nilaiAkhir >= 65) {
            huruf = "B";
            keterangan = "LULUS";
        } else if (nilaiAkhir >= 60) {
            huruf = "C+";
            keterangan = "LULUS";
        } else if (nilaiAkhir >= 50) {
            huruf = "C";
            keterangan = "LULUS";
        } else if (nilaiAkhir >= 39) {
            huruf = "D";
            keterangan = "TIDAK LULUS";
        } else {
            huruf = "E";
            keterangan = "TIDAK LULUS";
        }

        System.out.println("\nNilai Akhir   : " + nilaiAkhir);
        System.out.println("Nilai Huruf  : " + huruf);
        System.out.println("Keterangan   : " + keterangan);
    }

    static boolean valid(double nilai) {
        return nilai >= 0 && nilai <= 100;
    }
}
