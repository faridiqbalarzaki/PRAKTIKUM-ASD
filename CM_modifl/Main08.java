package CM_modifl;

import java.util.Scanner;

public class Main08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa08[] mhs = null;
        Peminjaman08[] pinjam = null;

        Buku08[] buku = {
                new Buku08("B001", "Algoritma", 2020),
                new Buku08("B002", "Basis Data", 2019),
                new Buku08("B003", "Pemrograman", 2021),
                new Buku08("B004", "Fisika", 2024),
        };

        int menuAwal;

        do {
            System.out.println("\n=== MENU AWAL ===");
            System.out.println("1. Input Data Mahasiswa");
            System.out.println("2. Input Data Peminjaman");
            System.out.println("3. Menu Utama");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            menuAwal = sc.nextInt();
            sc.nextLine();

            switch (menuAwal) {

                // ================= INPUT DATA =================
                case 1:
                    System.out.print("\nMasukkan jumlah mahasiswa: ");
                    int n = sc.nextInt();
                    sc.nextLine();

                    mhs = new Mahasiswa08[n];

                    for (int i = 0; i < n; i++) {
                        System.out.println("Data mahasiswa ke-" + (i + 1));

                        System.out.print("NIM: ");
                        String nim = sc.nextLine();

                        System.out.print("Nama: ");
                        String nama = sc.nextLine();

                        System.out.print("Prodi: ");
                        String prodi = sc.nextLine();

                        mhs[i] = new Mahasiswa08(nim, nama, prodi);
                    }

                    break;

                // INPUT DATA
                case 2:
                    System.out.print("\nMasukkan jumlah peminjaman: ");
                    int jml = sc.nextInt();
                    sc.nextLine();

                    pinjam = new Peminjaman08[jml];

                    for (int i = 0; i < jml; i++) {
                        System.out.println("Data peminjaman ke-" + (i + 1));

                        System.out.print("Masukkan NIM: ");
                        String nim = sc.nextLine();

                        Mahasiswa08 mhsCari = null;
                        for (Mahasiswa08 m : mhs) {
                            if (m.nim.equalsIgnoreCase(nim)) {
                                mhsCari = m;
                            }
                        }

                        if (mhsCari == null) {
                            System.out.println("Mahasiswa tidak ditemukan!");
                            i--;
                            continue;
                        }

                        System.out.print("Masukkan kode buku: ");
                        String kode = sc.nextLine();

                        Buku08 bukuCari = null;
                        for (Buku08 b : buku) {
                            if (b.kode.equalsIgnoreCase(kode)) {
                                bukuCari = b;
                            }
                        }

                        if (bukuCari == null) {
                            System.out.println("Buku tidak ditemukan!");
                            i--;
                            continue;
                        }

                        System.out.print("Lama pinjam: ");
                        int lama = sc.nextInt();
                        sc.nextLine();

                        pinjam[i] = new Peminjaman08(mhsCari, bukuCari, lama);
                    }

                    System.out.println("Data berhasil diinput!");

                    // \ MENU UTAMA
                case 3:
                    if (mhs == null || pinjam == null) {
                        System.out.println("Silakan input data dulu!");
                        break;
                    }

                    int pilihan;
                    do {
                        System.out.println("\n=== MENU UTAMA ===");
                        System.out.println("1. Tampil Mahasiswa");
                        System.out.println("2. Tampil Buku");
                        System.out.println("3. Tampil Peminjaman");
                        System.out.println("4. Urutkan Denda");
                        System.out.println("5. Urutkan Lama Pinjam");
                        System.out.println("6. Cari NIM");
                        System.out.println("7. Cari Judul Buku");
                        System.out.println("8. Data Terlambat");
                        System.out.println("9. Total Denda");
                        System.out.println("10. Cari Nama");
                        System.out.println("0. Kembali");
                        System.out.print("Pilih: ");
                        pilihan = sc.nextInt();
                        sc.nextLine();

                        switch (pilihan) {
                            case 1:
                                for (Mahasiswa08 m : mhs)
                                    m.tampil();
                                break;

                            case 2:
                                for (Buku08 b : buku)
                                    b.tampil();
                                break;

                            case 3:
                                for (Peminjaman08 p : pinjam)
                                    p.tampil();
                                break;

                            case 4:
                                for (Peminjaman08 p : pinjam)
                                    p.hitungDenda();
                                for (int i = 1; i < pinjam.length; i++) {
                                    Peminjaman08 temp = pinjam[i];
                                    int j = i - 1;
                                    while (j >= 0 && pinjam[j].denda < temp.denda) {
                                        pinjam[j + 1] = pinjam[j];
                                        j--;
                                    }
                                    pinjam[j + 1] = temp;
                                }
                                System.out.println("Sudah diurutkan!");
                                break;

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
                                System.out.println("Sudah diurutkan!");
                                break;

                            case 6:
                                System.out.print("NIM: ");
                                String nim = sc.nextLine();
                                for (Peminjaman08 p : pinjam)
                                    if (p.mhs.nim.equalsIgnoreCase(nim))
                                        p.tampil();
                                break;

                            case 7:
                                System.out.print("Judul: ");
                                String judul = sc.nextLine();
                                for (Peminjaman08 p : pinjam)
                                    if (p.buku.judul.equalsIgnoreCase(judul))
                                        p.tampil();
                                break;

                            case 8:
                                for (Peminjaman08 p : pinjam)
                                    if (p.lamaPinjam > 5)
                                        p.tampil();
                                break;

                            case 9:
                                int total = 0;
                                for (Peminjaman08 p : pinjam) {
                                    p.hitungDenda();
                                    total += p.denda;
                                }
                                System.out.println("Total: " + total);
                                break;

                            case 10:
                                System.out.print("Nama: ");
                                String nama = sc.nextLine();
                                for (Peminjaman08 p : pinjam)
                                    if (p.mhs.nama.equalsIgnoreCase(nama))
                                        p.tampil();
                                break;
                        }

                    } while (pilihan != 0);
                    break;
            }

        } while (menuAwal != 0);
    }
}