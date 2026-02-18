public class RoyalGarden {

    static int hitungPendapatan(int[] stok, int[] harga) {
        int total = 0;
        for (int i = 0; i < stok.length; i++) {
            total += stok[i] * harga[i];
        }
        return total;
    }

    public static void main(String[] args) {

        String[] cabang = {
                "RoyalGarden 1",
                "RoyalGarden 2",
                "RoyalGarden 3",
                "RoyalGarden 4"
        };

        String[] bunga = {
                "Aglonema", "Keladi", "Alocasia", "Mawar"
        };

        int[] harga = {
                75000, 50000, 60000, 10000
        };

        int[][] stok = {
                { 10, 5, 15, 7 },
                { 6, 11, 9, 12 },
                { 2, 10, 10, 5 },
                { 5, 7, 12, 9 }
        };

        System.out.println("Pendapatan Setiap Cabang RoyalGarden");
        System.out.println("====================================");

        for (int i = 0; i < stok.length; i++) {
            int pendapatan = hitungPendapatan(stok[i], harga);

            System.out.println(cabang[i]);
            System.out.println("Pendapatan : Rp " + pendapatan);

            if (pendapatan > 1_500_000) {
                System.out.println("Status     : Sangat Baik");
            } else {
                System.out.println("Status     : Perlu Evaluasi");
            }

            System.out.println("------------------------------------");
        }
    }
}
