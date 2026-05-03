import java.util.Scanner;

public class PangkatMain08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan jumlah elemen: ");
        int elemen = input.nextInt();

        Pangkat08[] png = new Pangkat08[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukan nilai basic elemen ke-" + (i + 1) + ": ");
            int basic = input.nextInt();
            System.out.print("Masukan nilai pangkat elemen ke-" + (i + 1) + ": ");
            int pangkat = input.nextInt();
            png[i] = new Pangkat08(basic, pangkat);
        }
        System.out.println("Hasil Pangkat Brute Force: ");
        for (Pangkat08 p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatBF(p.nilai, p.pangkat));
        }
        System.out.println("Hasil Pangkat Divide and Conquer: ");
        for (Pangkat08 p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatDC(p.nilai, p.pangkat));
        }

    }
}
