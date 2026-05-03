package JOBSHEET3;

import java.util.Scanner;

public class DosenDemo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = Integer.parseInt(sc.nextLine());

        Dosen08[] daftarDosen = new Dosen08[jumlah];

        for (int i = 0; i < daftarDosen.length; i++) {
            System.out.println("\nData Dosen ke-" + (i + 1));

            System.out.print("Kode          : ");
            String kode = sc.nextLine();

            System.out.print("Nama          : ");
            String nama = sc.nextLine();

            System.out.print("Jenis Kelamin : ");
            String jk = sc.nextLine();
            Boolean jenisKelamin = jk.toUpperCase().startsWith("L");

            System.out.print("Usia          : ");
            int usia = Integer.parseInt(sc.nextLine());

            daftarDosen[i] = new Dosen08(kode, nama, jenisKelamin, usia);
        }

        DataDosen08 data = new DataDosen08();
        int Pilihan;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Tampilkan Semua Dosen");
            System.out.println("2. Jumlah Dosen Per Jenis Kelamin");
            System.out.println("3. Rata-rata Usia Per Jenis Kelamin");
            System.out.println("4. Dosen Paling Tua");
            System.out.println("5. Dosen Paling Muda");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            Pilihan = Integer.parseInt(sc.nextLine());

            switch (Pilihan) {
                case 1:
                    data.dataSemuaDosen(daftarDosen);
                    break;
                case 2:
                    data.jumlahDosenPerJenisKelamin(daftarDosen);
                    break;
                case 3:
                    data.rerataUsiaDosenPerJenisKelamin(daftarDosen);
                    break;
                case 4:
                    data.infoDosenPalingTua(daftarDosen);
                    break;
                case 5:
                    data.infoDosenPalingMuda(daftarDosen);
                    break;
                case 0:
                    System.out.println("Program Selesai");
                    break;

                default:
                    System.out.println("Pilihan Tidak Valid");
                    break;
            }
        } while (Pilihan != 0);

    }
}