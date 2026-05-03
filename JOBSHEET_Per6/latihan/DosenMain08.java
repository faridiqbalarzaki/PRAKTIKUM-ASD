package JOBSHEET_Per6.latihan;

import java.util.Scanner;

public class DosenMain08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen08 list = new DataDosen08();

        int pilih;

        do {
            System.out.println("====================================");
            System.out.println("\t    DATA DOSEN");
            System.out.println("====================================");
            System.out.println("MENU");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Termuda ke Tertua)");
            System.out.println("4. Sorting DSC (Tertua ke Termuda)");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Kode: ");
                    String kd = sc.nextLine();
                    System.out.print("Nama: ");
                    String nm = sc.nextLine();
                    System.out.print("Jenis Kelamin (L/P): ");
                    String jkInput = sc.nextLine();

                    boolean jk;
                    if (jkInput.equalsIgnoreCase("L")) {
                        jk = true;
                    } else {
                        jk = false;
                    }
                    System.out.print("Usia: ");
                    int usia = sc.nextInt();
                    sc.nextLine();

                    Dosen08 d = new Dosen08(kd, nm, jk, usia);
                    list.tambah(d);
                    break;

                case 2:
                    list.tampil();
                    break;

                case 3:
                    list.SortingASC();
                    System.out.println("Data berhasil diurutkan ASC");
                    break;

                case 4:
                    list.sortingDSC();
                    System.out.println("Data berhasil diurutkan DSC");
                    break;
            }

        } while (pilih != 5);
    }
}