package JOBSHEET12.Praktikum2;

import java.util.Scanner;

public class DoubleLinkedListMain08 {

    public static Mahasiswa08 inputMahasiswa(Scanner scan) {
        System.out.print("Masukkan NIM   : ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Nama  : ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Kelas : ");
        String kelas = scan.nextLine();
        System.out.print("Masukkan IPK   : ");
        double ipk = scan.nextDouble();
        scan.nextLine();
        return new Mahasiswa08(nim, nama, kelas, ipk);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DoubleLinkedList08 list = new DoubleLinkedList08();
        int pilihan;

        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data di tengah (setelah NIM)");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilkan data");
            System.out.println("7. Hapus data pada indeks tertentu");
            System.out.println("8. Hapus data setelah NIM tertentu");
            System.out.println("9. Tampilkan Node Pertama");
            System.out.println("10. Tampilkan Node Terakhir");
            System.out.println("11. Tampilkan Node Berdasarkan Indeks");
            System.out.println("12. Tampilkan semua data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1:
                    Mahasiswa08 mhsAwal = inputMahasiswa(scan);
                    list.addFirst(mhsAwal);
                    break;
                case 2:
                    Mahasiswa08 mhsAkhir = inputMahasiswa(scan);
                    list.addLast(mhsAkhir);
                    break;
                case 3:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String keyNim = scan.nextLine();
                    System.out.println("Masukkan data baru: ");
                    Mahasiswa08 dataBaru = inputMahasiswa(scan);
                    list.insertAfter(keyNim, dataBaru);
                    break;
                case 4:
                    list.removeFirst();
                    break;
                case 5:
                    list.removeLast();
                    break;
                case 6:
                    list.print();
                    break;
                case 7:
                    System.out.print("Masukkan Indeks yang akan dihapus: ");
                    int rmIdx = scan.nextInt();
                    scan.nextLine();
                    list.remove(rmIdx);
                    break;
                case 8:
                    System.out.print("Masukkan NIM referensi (data setelahnya akan dihapus): ");
                    String rmNim = scan.nextLine();
                    list.removeAfter(rmNim);
                    break;
                case 9:
                    list.getFirst();
                    break;
                case 10:
                    list.getLast();
                    break;
                case 11:
                    System.out.print("Masukkan Indeks yang dicari: ");
                    int getIdx = scan.nextInt();
                    scan.nextLine();
                    list.getIndex(getIdx);
                    break;
                case 12:
                    list.print();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (pilihan != 0);

        scan.close();
    }
}
