package CM_2;

class NodePesanan {
    Pesanan08 data;
    NodePesanan prev, next;

    public NodePesanan(NodePesanan prev, Pesanan08 data, NodePesanan next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}

public class DLLPesanan08 {
    NodePesanan head, tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void addPesanan(Pesanan08 p) {
        if (isEmpty()) {
            head = tail = new NodePesanan(null, p, null);
        } else {
            NodePesanan newNode = new NodePesanan(tail, p, null);
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void sortNamaPesanan() {
        if (isEmpty() || head.next == null)
            return;

        boolean swapped;
        NodePesanan current;

        do {
            swapped = false;
            current = head;
            while (current.next != null) {

                if (current.data.getNamaPesanan().compareToIgnoreCase(current.next.data.getNamaPesanan()) > 0) {
                    Pesanan08 temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    public void printLaporan() {
        System.out.println("==============================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("==============================================");
        if (isEmpty()) {
            System.out.println("Belum ada pesanan yang masuk.");
            return;
        }

        sortNamaPesanan();

        System.out.printf("%-15s %-20s %-10s\n", "Kode Pesanan", "Nama Pesanan", "Harga");
        NodePesanan current = head;
        while (current != null) {
            System.out.printf("%-15d %-20s %-10d\n", current.data.kodePesanan, current.data.namaPesanan,
                    current.data.harga);
            current = current.next;
        }
    }
}