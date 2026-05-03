package quiz1;

import java.util.Scanner;

public class AksesorisDemo08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Aksesoris08[] daftarAksesoris = new Aksesoris08[5];

        String[] katagori = {
                "Kalung",
                "Gelang",
                "Anting-anting",
        };

        String[] nama = {
                "Kalung Emas",
                "Gelang Perak",
                "Gelang Emas",
                "Anting Perak",
                "Anting Emas"
        };

        int[] harga = {
                200000,
                100000,
                300000,
                400000,
                1500000
        };
        for (int i = 0; i < daftarAksesoris.length; i++) {

            String kategori;

            if (nama[i].contains("Kalung")) {
                kategori = katagori[0];
            } else if (nama[i].contains("Gelang")) {
                kategori = katagori[1];
            } else {
                kategori = katagori[2];
            }

            daftarAksesoris[i] = new Aksesoris08(kategori, nama[i], harga[i], i, i);
        }

        for (int i = 0; i < daftarAksesoris.length; i++) {
            System.out.println("\nData Aksesoris ke-" + (i + 1));
            daftarAksesoris[i].tampilData();
        }
    }
}