package quiz1;

import java.util.Scanner;

public class Aksesoris08 {

    String nama;
    String katagori;
    int harga;
    int terjual;
    int stok;

    public Aksesoris08(String nama, String katagori, int harga, int terjual, int stok) {
        this.nama = nama;
        this.katagori = katagori;
        this.harga = harga;
        this.terjual = terjual;
        this.stok = stok;
    }

    void tampilData() {
        System.out.println("Nama Aksesoris: " + nama);
        System.out.println("Katagori: " + katagori);
        System.out.println("Harga: " + harga);
        System.out.println("Terjual: " + terjual);
        System.out.println("Stok: " + stok);
    }

}
