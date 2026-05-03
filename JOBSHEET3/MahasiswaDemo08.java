package JOBSHEET3;

import java.util.Scanner;

public class MahasiswaDemo08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa08[] arrayOfMahasiswa08 = new Mahasiswa08[3];
        String dummy;
        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa08[i] = new Mahasiswa08();

            System.out.println("Masukan Data Mahasiswa ke-" + (i + 1));
            System.out.print("Masukan NIM     : ");
            arrayOfMahasiswa08[i].nim = sc.nextLine();
            System.out.print("Masukan Nama    : ");
            arrayOfMahasiswa08[i].nama = sc.nextLine();
            System.out.print("Masukan Kelas   : ");
            arrayOfMahasiswa08[i].kelas = sc.nextLine();
            System.out.print("Masukan IPK     : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa08[i].ipk = Float.parseFloat(dummy);
            System.out.println("------------------------------------------");
        }

        for (Mahasiswa08 mhs : arrayOfMahasiswa08) {
            mhs.cetakinfo();

        }

    }
}
