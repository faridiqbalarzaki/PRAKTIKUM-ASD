package JOBSHEET11.Tugas;

import java.util.Scanner;

public class QueueMain08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== SISTEM ANTRIAN LAYANAN KEMAHASISWAAN ===");
        System.out.print("Tentukan kapasitas maksimal antrian hari ini: ");
        int kapasitas = sc.nextInt();
        sc.nextLine();

        Queue08 antrian = new Queue08(kapasitas);
        int menu = -1;

        do {
            System.out.println("\n=== PILIHAN MENU ===");
            System.out.println("1. Tambah Antrian Mahasiswa (Mendaftar)");
            System.out.println("2. Panggil Antrian Terdepan");
            System.out.println("3. Cek Antrian Terdepan dan Terakhir");
            System.out.println("4. Cek Jumlah Antrian");
            System.out.println("5. Cek Status Antrian (Kosong/Penuh)");
            System.out.println("6. Tampilkan Seluruh Daftar Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu (0-7): ");
            menu = sc.nextInt();
            sc.nextLine();

            System.out.println("----------------------------------------");
            switch (menu) {
                case 1:
                    System.out.print("Masukkan NIM Mahasiswa: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    Mahasiswa08 mhs = new Mahasiswa08(nim, nama);
                    antrian.enqueue(mhs);
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.peekFrontRear();
                    break;
                case 4:
                    antrian.printSize();
                    break;
                case 5:
                    if (antrian.isEmpty()) {
                        System.out.println("Status: Antrian saat ini KOSONG.");
                    } else if (antrian.isFull()) {
                        System.out.println("Status: Antrian saat ini PENUH.");
                    } else {
                        System.out.println(
                                "Status: Antrian berisi " + antrian.size + " dari kapasitas " + antrian.capacity + ".");
                    }
                    break;
                case 6:
                    antrian.printQueue();
                    break;
                case 7:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Menutup program layanan. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan menu tidak valid!");
            }
        } while (menu != 0);

        sc.close();
    }
}
