package CM_2;

import java.util.Scanner;

public class RoyalDelishApp08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DLLAntrian08 antrian = new DLLAntrian08();
        DLLPesanan08 pesanan = new DLLPesanan08();

        System.out.println("--- Proses Inisialisasi Data Awal ---");
        antrian.enqueue("Ainra", "08224500000");
        antrian.enqueue("Danra", "08224511111");
        antrian.enqueue("Sanri", "08224522222");

        int menu = -1;
        do {
            System.out.println("\n======================================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("======================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");

            if (sc.hasNextInt()) {
                menu = sc.nextInt();
                sc.nextLine();

                switch (menu) {
                    case 1:
                        System.out.print("Nama Pembeli : ");
                        String nama = sc.nextLine();
                        System.out.print("No HP        : ");
                        String hp = sc.nextLine();
                        antrian.enqueue(nama, hp);
                        break;

                    case 2:
                        antrian.print();
                        break;

                    case 3:
                        if (antrian.isEmpty()) {
                            System.out.println("Antrian kosong. Tidak ada pembeli yang bisa dipanggil.");
                        } else {
                            Pembeli08 p = antrian.dequeue();
                            System.out.println("\n=> Memanggil Antrian No. " + p.getNoAntrian() + " (Atas Nama: "
                                    + p.getNamaPembeli() + ")");

                            System.out.print("Kode Pesanan : ");
                            int kode = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Nama Pesanan : ");
                            String namaPesan = sc.nextLine();
                            System.out.print("Harga        : ");
                            int harga = sc.nextInt();

                            pesanan.addPesanan(new Pesanan08(kode, namaPesan, harga));
                            System.out.println(p.getNamaPembeli() + " telah memesan " + namaPesan);
                        }
                        break;

                    case 4:
                        pesanan.printLaporan();
                        break;

                    case 0:
                        System.out.println("Menutup program... Terima kasih!");
                        break;

                    default:
                        System.out.println("Maaf, pilihan menu tidak tersedia.");
                }
            } else {
                System.out.println("Maaf, masukkan menu dalam bentuk angka!");
                sc.next();
            }
        } while (menu != 0);

        sc.close();
    }
}