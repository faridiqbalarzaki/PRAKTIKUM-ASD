package JOBSHEET11;

import java.util.Scanner;

public class SLLMain08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList08 sll = new SingleLinkedList08();

        System.out.print("Masukkan Jumlah data Mahasiswa yang ingin diinput: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("Masukkan data Mahasiswa ke-" + i);
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa08 mhsBaru = new Mahasiswa08(nim, nama, kelas, ipk);
            sll.addLast(mhsBaru);
        }

        System.out.println("\n=== Data Antrian Mahasiswa ===");
        sll.print();
    }
}
