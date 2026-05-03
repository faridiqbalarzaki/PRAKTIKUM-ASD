package JOBSHEET6;

import java.util.Scanner;

public class MahasiswaDemo08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = sc.nextInt();
        sc.nextLine();

        // pakai konstruktor yang sudah dimodif
        MahasiswaBerprestasi08 list = new MahasiswaBerprestasi08(jumMhs);

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Data mahasiswa ke-" + (i + 1));

            System.out.print("NIM   : ");
            String nim = sc.nextLine();

            System.out.print("Nama  : ");
            String nama = sc.nextLine();

            System.out.print("Kelas : ");
            String kelas = sc.nextLine();

            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            System.out.println("------------------------------------------");

            Mahasiswa08 m = new Mahasiswa08(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        // optional: kalau mau aman untuk binary search descending
        list.bubbleSort();

        list.tampil();
        System.out.println("------------------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("------------------------------------------");

        System.out.print("Masukkan IPK yang dicari: ");
        double cari = sc.nextDouble();

        System.out.println("------------------------------------------");
        System.out.println("Menggunakan Binary Search");
        System.out.println("------------------------------------------");

        // langsung int, tidak perlu double
        int posisi2 = list.findBinarySearch(cari, 0, list.idx - 1);

        list.tampilPosisi(cari, posisi2);
        list.tampilDataSearch(cari, posisi2);
    }
}