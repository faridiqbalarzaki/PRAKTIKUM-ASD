package CM_2;

public class Pesanan08 {
    int kodePesanan;
    String namaPesanan;
    int harga;

    public Pesanan08(int kodePesanan, String namaPesanan, int harga) {
        this.kodePesanan = kodePesanan;
        this.namaPesanan = namaPesanan;
        this.harga = harga;
    }

    public String getNamaPesanan() {
        return namaPesanan;
    }
}