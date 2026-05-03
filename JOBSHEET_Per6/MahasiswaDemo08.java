package JOBSHEET_Per6;

import java.util.Scanner;

public class MahasiswaDemo08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();
        sc.nextLine();

        MahasiswaBerprestasi list = new MahasiswaBerprestasi();

        for (int i = 0; i < n; i++) {
            System.out.println("Data mahasiswa ke-" + (i + 1));

            System.out.print("Nama: ");
            String nim = sc.nextLine();

            System.out.print("NIM: ");
            String nama = sc.nextLine();

            System.out.print("Kelas: ");
            String kelas = sc.nextLine();

            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa08 m = new Mahasiswa08(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC) ");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC) ");
        list.insertionSort();
        list.tampil();
    }
}
