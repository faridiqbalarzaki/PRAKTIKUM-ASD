package JOBSHEET3;

import java.util.Scanner;

public class Matakuliah08 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public Matakuliah08() {
    }

    public void tambahData(Scanner sc) {
        System.out.print("Kode : ");
        kode = sc.nextLine();

        System.out.print("Nama : ");
        nama = sc.nextLine();

        System.out.print("SKS : ");
        sks = Integer.parseInt(sc.nextLine());

        System.out.print("Jumlah Jam : ");
        jumlahJam = Integer.parseInt(sc.nextLine());
    }

    public void CetakInfo() {
        System.out.println("Kode       : " + kode);
        System.out.println("Nama       : " + nama);
        System.out.println("SKS        : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
        System.out.println("----------------------------");
    }
}