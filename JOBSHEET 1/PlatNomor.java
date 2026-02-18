import java.util.Scanner;

public class PlatNomor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] KODE = { 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T' };

        String[] KOTA = {
                "BANTEN",
                "JAKARTA",
                "BANDUNG",
                "CIREBON",
                "BOGOR",
                "PEKALONGAN",
                "SEMARANG",
                "SURABAYA",
                "MALANG",
                "TEGAL"
        };

        System.out.print("Masukkan kode plat nomor: ");
        char input = sc.next().toUpperCase().charAt(0);

        boolean ditemukan = false;

        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == input) {
                System.out.println("Nama Kota: " + KOTA[i]);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Kode plat tidak ditemukan");
        }
    }
}
 