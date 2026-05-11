package JOBSHEET11.Tugas;

public class Queue08 {
    Node08 front;
    Node08 rear;
    int size;
    int capacity;

    public Queue08(int capacity) {
        this.capacity = capacity;
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    // Cek antrian kosong
    public boolean isEmpty() {
        return size == 0;
    }

    // Cek antrian penuh
    public boolean isFull() {
        return size == capacity;
    }

    // Menambahkan antrian (Enqueue)
    public void enqueue(Mahasiswa08 data) {
        if (isFull()) {
            System.out.println("Mohon maaf, antrian sudah penuh!");
        } else {
            Node08 newNode = new Node08(data, null);
            if (isEmpty()) {
                front = newNode;
                rear = newNode;
            } else {
                rear.next = newNode;
                rear = newNode;
            }
            size++;
            System.out.println("Mahasiswa atas nama " + data.nama + " berhasil masuk ke antrian.");
        }
    }

    // Memanggil antrian (Dequeue)
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong, tidak ada yang bisa dipanggil.");
        } else {
            System.out.println("Memanggil mahasiswa ke loket:");
            front.data.print();
            front = front.next; // Geser antrian terdepan ke orang berikutnya
            if (front == null) {
                rear = null;
            }
            size--;
        }
    }

    // Menampilkan antrian terdepan dan paling akhir
    public void peekFrontRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("--- Antrian Terdepan ---");
            front.data.print();
            System.out.println("--- Antrian Paling Akhir ---");
            rear.data.print();
        }
    }

    // Menampilkan jumlah mahasiswa yang masih mengantre
    public void printSize() {
        System.out.println("Jumlah mahasiswa yang masih mengantre saat ini: " + size + " orang.");
    }

    // Mengosongkan antrian
    public void clear() {
        front = null;
        rear = null;
        size = 0;
        System.out.println("Seluruh antrian berhasil dikosongkan!");
    }

    // (Tambahan) Menampilkan semua daftar antrian untuk mempermudah monitoring
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            Node08 tmp = front;
            System.out.println("=== Daftar Antrian Saat Ini ===");
            int i = 1;
            while (tmp != null) {
                System.out.print(i + ". ");
                tmp.data.print();
                tmp = tmp.next;
                i++;
            }
        }
    }
}
