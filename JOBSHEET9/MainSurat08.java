import java.util.Scanner;

public class MainSurat08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Misalkan kapasitas tumpukan maksimal 10 surat
        StackSurat08 stack = new StackSurat08(10);
        int pilih;

        do {
            System.out.println("\n===== SISTEM PENGELOLAAN SURAT IZIN =====");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = scan.nextInt();
            scan.nextLine(); // Membersihkan buffer

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = scan.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S untuk Sakit / I untuk Izin lain): ");
                    char jenis = scan.nextLine().charAt(0);
                    System.out.print("Durasi Izin (dalam hari): ");
                    int durasi = scan.nextInt();
                    scan.nextLine(); // Membersihkan buffer lagi

                    Surat08 suratBaru = new Surat08(id, nama, kelas, jenis, durasi);
                    stack.push(suratBaru);
                    System.out.println("Surat dari " + nama + " berhasil dimasukkan ke tumpukan!");
                    break;

                case 2:
                    Surat08 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Memproses surat atas nama: " + diproses.namaMahasiswa);
                        System.out.println("Status: Surat telah diverifikasi oleh admin Prodi.");
                    }
                    break;

                case 3:
                    Surat08 teratas = stack.peek();
                    if (teratas != null) {
                        System.out.println("Surat teratas yang menunggu diproses adalah milik: " + teratas.namaMahasiswa
                                + " (" + teratas.idSurat + ")");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa yang ingin dicari: ");
                    String cariNama = scan.nextLine();
                    stack.cariSurat(cariNama);
                    break;

                case 5:
                    System.out.println("Keluar dari program pengelolaan surat. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (pilih != 5);
    }
}