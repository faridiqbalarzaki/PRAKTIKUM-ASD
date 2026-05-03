package JOBSHEET3;

import java.util.Scanner;

public class MatakuliahDemo08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String tambah;
        int index = 0;

        System.out.print("Masukkan jumlah Matakuliah: ");
        int jumlah = Integer.parseInt(sc.nextLine());

        Matakuliah08[] arrOfMatakuliah08 = new Matakuliah08[jumlah];

        do {
            if (index >= arrOfMatakuliah08.length) {
                System.out.println("Data sudah penuh!");
                break;
            }

            arrOfMatakuliah08[index] = new Matakuliah08();
            System.out.println("Masukkan Data Matakuliah ke-" + (index + 1));
            arrOfMatakuliah08[index].tambahData(sc);

            index++;

            System.out.print("Tambah data lagi? (y/t): ");
            tambah = sc.nextLine();

        } while (tambah.equalsIgnoreCase("y"));

        System.out.println("\n=== DATA MATAKULIAH ===");
        for (int i = 0; i < index; i++) {
            arrOfMatakuliah08[i].CetakInfo();
        }

        sc.close();
    }
}