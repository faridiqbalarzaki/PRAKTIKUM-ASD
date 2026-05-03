public class StackSurat08 {
    int size;
    int top;
    Surat08[] stack;

    public StackSurat08(int size) {
        this.size = size;
        stack = new Surat08[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    // Menambah surat ke tumpukan teratas
    public void push(Surat08 srt) {
        if (!isFull()) {
            top++;
            stack[top] = srt;
        } else {
            System.out.println("Tumpukan surat penuh!");
        }
    }

    // Mengambil dan memproses surat teratas
    public Surat08 pop() {
        if (!isEmpty()) {
            Surat08 srt = stack[top];
            top--;
            return srt;
        } else {
            System.out.println("Tumpukan surat kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }

    // Melihat surat teratas tanpa memproses
    public Surat08 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Tumpukan surat kosong!");
            return null;
        }
    }

    // Method tambahan untuk mencari surat berdasarkan nama (Fitur Menu 4)
    public void cariSurat(String nama) {
        boolean ketemu = false;
        if (!isEmpty()) {
            // Pencarian LIFO dari atas ke bawah
            for (int i = top; i >= 0; i--) {
                // ignoreCase biar input huruf besar/kecil nggak masalah
                if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                    System.out.println("--- Surat Ditemukan ---");
                    System.out.println("ID Surat   : " + stack[i].idSurat);
                    System.out.println("Nama       : " + stack[i].namaMahasiswa);
                    System.out.println("Kelas      : " + stack[i].kelas);
                    System.out.println("Jenis Izin : " + stack[i].jenisIzin);
                    System.out.println("Durasi     : " + stack[i].durasi + " hari");
                    ketemu = true;
                    break;
                }
            }
        }
        if (!ketemu) {
            System.out.println("Surat atas nama " + nama + " tidak ditemukan di tumpukan.");
        }
    }
}