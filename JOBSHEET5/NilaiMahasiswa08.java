public class NilaiMahasiswa08 {
    // UTS TERTINGGI (Divide and Conquer)
    int utsTertinggi(Mahasiswa08[] arr, int l, int r) {

        if (l == r) {
            return arr[l].uts;
        }

        int mid = (l + r) / 2;

        int left = utsTertinggi(arr, l, mid);
        int right = utsTertinggi(arr, mid + 1, r);

        if (left > right) {
            return left;
        } else {
            return right;
        }
    }

    // UTS TERENDAH (Divide and Conquer)
    int utsTerendah(Mahasiswa08[] arr, int l, int r) {

        if (l == r) {
            return arr[l].uts;
        }

        int mid = (l + r) / 2;

        int left = utsTerendah(arr, l, mid);
        int right = utsTerendah(arr, mid + 1, r);

        if (left < right) {
            return left;
        } else {
            return right;
        }
    }

    // RATA-RATA UAS (Brute Force)
    double rataUAS(Mahasiswa08[] arr) {

        double total = 0;

        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i].uas;
        }

        return total / arr.length;
    }

}
