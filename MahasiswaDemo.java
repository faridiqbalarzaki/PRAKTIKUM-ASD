import java.util.Scanner;

public class MahasiswaDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();

        Mahasiswa[] daftarMahasiswa = new Mahasiswa[jumlah];

        for (int i = 0; i < daftarMahasiswa.length; i++) {
            System.out.println("-------------------");
            System.out.println("Data Mahasiswa ke-" + (i + 1));

            System.out.print("NIM           : ");
            String nim = input.next();

            System.out.print("Nama          : ");
            String nama = input.next();

            System.out.print("Prodi         : ");
            String prodi = input.next();

            System.out.print("IPK           : ");
            double ipk = input.nextDouble();

            System.out.print("Jenis Kelamin : ");
            String jk = input.next();
            boolean jenisKelamin = jk.toUpperCase().startsWith("L");
           

            System.out.print("Umur          : ");
            int umur = Integer.parseInt(input.next());
            System.out.println("-------------------");

            daftarMahasiswa[i] = new Mahasiswa(nim, nama, prodi, jenisKelamin, umur, ipk);
        }

        for (int i = 0; i < daftarMahasiswa.length; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            daftarMahasiswa[i].tampilData();
        }
    }
}
