import java.util.Scanner;

public class JadwalKuliah {

    static Scanner sc = new Scanner(System.in);
    static String[][] jadwal;

    public static void main(String[] args) {

        System.out.print("Masukkan jumlah jadwal: ");
        int n = sc.nextInt();
        sc.nextLine();

        jadwal = new String[n][4];

        inputJadwal(n);
        tampilSemua();
        cariHari();
        cariMatkul();
    }

    public static void inputJadwal(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("\nData ke-" + (i + 1));

            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = sc.nextLine();

            System.out.print("Ruang            : ");
            jadwal[i][1] = sc.nextLine();

            System.out.print("Hari             : ");
            jadwal[i][2] = sc.nextLine();

            System.out.print("Jam              : ");
            jadwal[i][3] = sc.nextLine();
        }
    }

    public static void tampilSemua() {
        System.out.println("\n=== SEMUA JADWAL ===");
        System.out.println("--------------------------------------------------------");
        System.out.println("No | Mata Kuliah | Ruang | Hari | Jam");
        System.out.println("--------------------------------------------------------");

        for (int i = 0; i < jadwal.length; i++) {
            System.out.println((i + 1) + " | " +
                    jadwal[i][0] + " | " +
                    jadwal[i][1] + " | " +
                    jadwal[i][2] + " | " +
                    jadwal[i][3]);
        }
    }

    public static void cariHari() {
        System.out.print("\nCari jadwal berdasarkan hari: ");
        String hariCari = sc.nextLine();

        boolean ketemu = false;

        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hariCari)) {
                System.out.println(jadwal[i][0] + " | " +
                        jadwal[i][1] + " | " +
                        jadwal[i][2] + " | " +
                        jadwal[i][3]);
                ketemu = true;
            }
        }

        if (!ketemu) {
            System.out.println("Tidak ada jadwal di hari tersebut.");
        }
    }

    public static void cariMatkul() {
        System.out.print("\nCari jadwal berdasarkan nama mata kuliah: ");
        String matkulCari = sc.nextLine();

        boolean ketemu = false;

        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][0].equalsIgnoreCase(matkulCari)) {
                System.out.println(jadwal[i][0] + " | " +
                        jadwal[i][1] + " | " +
                        jadwal[i][2] + " | " +
                        jadwal[i][3]);
                ketemu = true;
            }
        }

        if (!ketemu) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }
}
