package JOBSHEET10;

public class QueueKRS08 {
    Mahasiswa08[] antrian;
    int front;
    int rear;
    int size;
    int max;
    int sudahKRS;
    final int kuotaDPA = 30; // Batas mahasiswa yang ditangani DPA

    public QueueKRS08(int max) {
        this.max = max;
        this.antrian = new Mahasiswa08[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.sudahKRS = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        if (!isEmpty()) {
            front = 0;
            rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan.");
        } else {
            System.out.println("Antrian masih kosong.");
        }
    }

    public void tambahAntrian(Mahasiswa08 mhs) {
        if (sudahKRS + size >= kuotaDPA) {
            System.out.println("Maaf, kuota DPA (30 mahasiswa) sudah penuh.");
            return;
        }

        if (isFull()) {
            System.out.println("Antrian penuh (maksimal 10), silahkan tunggu.");
        } else {
            rear = (rear + 1) % max;
            antrian[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " berhasil masuk ke antrian KRS.");
        }
    }

    public void panggilKRS() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Memanggil mahasiswa untuk proses KRS:");
            int count = 0;
            // Memanggil maksimal 2 mahasiswa sekaligus
            while (!isEmpty() && count < 2) {
                Mahasiswa08 mhs = antrian[front];
                System.out.print("- ");
                mhs.tampilkanData();
                front = (front + 1) % max;
                size--;
                sudahKRS++;
                count++;
            }
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Antrian KRS:");
        System.out.println("NO \t NIM \t NAMA \t PRODI \t KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". \t ");
            antrian[index].tampilkanData();
        }
    }

    public void tampilkanDuaTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("2 Antrian Terdepan:");
            int batas = Math.min(size, 2);
            for (int i = 0; i < batas; i++) {
                int index = (front + i) % max;
                System.out.print((i + 1) + ". \t ");
                antrian[index].tampilkanData();
            }
        }
    }

    public void tampilkanPalingAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Antrian Paling Akhir:");
            antrian[rear].tampilkanData();
        }
    }

    public void cetakStatistik() {
        int belumKRS = kuotaDPA - sudahKRS;
        System.out.println("=== Statistik KRS DPA ===");
        System.out.println("Jumlah Antrian Saat Ini      : " + size);
        System.out.println("Jumlah Sudah Proses KRS      : " + sudahKRS);
        System.out.println("Sisa Kuota DPA (Belum KRS)   : " + belumKRS);
    }
}
