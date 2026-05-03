import java.util.Scanner;

public class FaktorialMain08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai: ");
        int nilai = input.nextInt();

        Faktorial08 fk = new Faktorial08();
        System.out.println("Nilai Faktorial " + nilai + " Menggunakan BF: " + fk.FaktorialBF(nilai));
        System.out.println("Nilai Faktorial " + nilai + " Menggunakan DC: " + fk.faktorialDC(nilai));

    }
}
