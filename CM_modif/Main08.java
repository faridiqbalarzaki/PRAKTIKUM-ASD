package CM_modif;

import java.util.Scanner;

public class Main08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa08[] mhs = {
                new Mahasiswa08("22001", "Andi", "Teknik Informatika"),
                new Mahasiswa08("22002", "Budi", "Teknik Informatika"),
                new Mahasiswa08("22003", "Citra", "Sistem Informasi Bisnis"),
        };

        Buku08[] buku = {
                new Buku08("B001", "Algoritma", 2020),
                new Buku08("B002", "Basis Data", 2019),
                new Buku08("B003", "Pemrograman", 2021),
                new Buku08("B004", "Fisika", 2024),
        };

        Peminjaman08[] pinjam = {
                new Peminjaman08(mhs[0], buku[0], 7),
                new Peminjaman08(mhs[1], buku[1], 3),
                new Peminjaman08(mhs[2], buku[2], 10),
                new Peminjaman08(mhs[2], buku[3], 6),
                new Peminjaman08(mhs[0], buku[1], 4)
        };

        int pilihan;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tampil Mahasiswa ");
            System.out.println("2. Tampil Buku");
            System.out.println("3. Tampil Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Urutkan Berdaarkan Lama Pinjam");
            System.out.println("6. Cari berdasarkan NIM");
            System.out.println("7. Cari berdasarkan Judul Buku");
            System.out.println("8. Tampilkan Data yang terlambat");
            System.out.println("9. Hitung total seluruh Denda");
            System.out.println("10.Cari berdasarkan Nama Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\nData Mahasiswa:");
                    for (Mahasiswa08 m : mhs) {
                        m.tampil();
                    }
                    break;

                case 2:
                    System.out.println("\nTampil Buku:");
                    for (Buku08 p : buku) {
                        p.tampil();
                    }
                    break;

                case 3:
                    for (Peminjaman08 p : pinjam) {
                        p.tampil();
                    }
                    break;

                case 4:
                    // Insertion Sort (descending denda)

                    for (Peminjaman08 p : pinjam) {
                        p.hitungDenda();
                    }
                    for (int i = 1; i < pinjam.length; i++) {
                        Peminjaman08 temp = pinjam[i];
                        int j = i - 1;

                        while (j >= 0 && pinjam[j].denda < temp.denda) {
                            pinjam[j + 1] = pinjam[j];
                            j--;
                        }
                        pinjam[j + 1] = temp;
                    }
                    System.out.println("Setelah diurutkan (Denda terbesar):");
                    for (Peminjaman08 p : pinjam)
                        p.tampil();
                    break;

                // Insertion Sort (ascending lama pinjam)
                case 5:
                    for (int i = 1; i < pinjam.length; i++) {
                        Peminjaman08 temp = pinjam[i];
                        int j = i - 1;

                        while (j >= 0 && pinjam[j].lamaPinjam > temp.lamaPinjam) {
                            pinjam[j + 1] = pinjam[j];
                            j--;
                        }
                        pinjam[j + 1] = temp;
                    }
                    System.out.println("Setelah diurutkan (Lama pinjam terpendek):");
                    for (Peminjaman08 p : pinjam)
                        p.tampil();
                    break;
                // cari nim menggunakan binary search
                case 6:
                    System.out.print("\nMasukkan NIM: ");
                    String cariNim = sc.nextLine();
                    Boolean ketemuNim = false;
                    for (Peminjaman08 p : pinjam) {
                        if (p.mhs.nim.equalsIgnoreCase(cariNim)) {
                            p.tampil();
                            ketemuNim = true;
                        }
                    }
                    if (!ketemuNim) {
                        System.out.println("Data tidak ditemukan!");
                    }
                    break;

                case 7:
                    System.out.print("\nMasukkan judul buku: ");
                    String cariBuku = sc.nextLine();

                    Boolean ketemuBuku = false;
                    for (Peminjaman08 p : pinjam) {
                        if (p.buku.judul.equalsIgnoreCase(cariBuku)) {
                            p.tampil();
                            ketemuBuku = true;
                        }
                    }

                    if (!ketemuBuku) {
                        System.out.println("Data tidak ditemukan!");
                    }
                    break;

                case 8:
                    System.out.println("\nData Peminjaman yang terlambat:");

                    boolean terlambat = false;
                    for (Peminjaman08 p : pinjam) {

                        if (p.lamaPinjam > 5) {
                            p.tampil();
                            terlambat = true;
                        }
                        if (!terlambat) {
                            System.out.println("Tidak ada peminjaman yang terlambat.");
                        }

                    }

                    break;

                case 9:
                    System.out.println("\nTotal seluruh Denda");

                    int totalDenda = 0;
                    for (Peminjaman08 p : pinjam) {
                        totalDenda += p.denda;
                    }
                    System.out.println("Total Denda: " + totalDenda);
                    break;

                case 10:
                    System.out.print("\nMasukkan Nama Mahasiswa: ");
                    String cariNama = sc.nextLine();
                    Boolean ketemuNama = false;
                    for (Peminjaman08 p : pinjam) {
                        if (p.mhs.nama.equalsIgnoreCase(cariNama)) {
                            p.tampil();
                            ketemuNama = true;
                        }
                    }
                    if (!ketemuNama) {
                        System.out.println("Data tidak ditemukan!");
                    }
                    break;

            }

        } while (pilihan != 0);

    }
}
