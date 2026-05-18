package CM_2;

class NodeAntrian {
    Pembeli08 data;
    NodeAntrian prev, next;

    public NodeAntrian(NodeAntrian prev, Pembeli08 data, NodeAntrian next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}

public class DLLAntrian08 {
    NodeAntrian head, tail;
    int tiketCounter = 1;

    public boolean isEmpty() {
        return head == null;
    }

    public void enqueue(String nama, String noHp) {
        Pembeli08 p = new Pembeli08(tiketCounter++, nama, noHp);
        if (isEmpty()) {
            head = tail = new NodeAntrian(null, p, null);
        } else {
            NodeAntrian newNode = new NodeAntrian(tail, p, null);
            tail.next = newNode;
            tail = newNode;
        }
        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + p.getNoAntrian());
    }

    public Pembeli08 dequeue() {
        if (isEmpty())
            return null;

        Pembeli08 p = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        return p;
    }

    public void print() {
        System.out.println("======================================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("======================================");
        if (isEmpty()) {
            System.out.println("Antrian saat ini kosong.");
            return;
        }
        System.out.printf("%-12s %-15s %-15s\n", "No Antrian", "Nama", "No HP");
        NodeAntrian current = head;
        while (current != null) {
            System.out.printf("%-12d %-15s %-15s\n",
                    current.data.getNoAntrian(),
                    current.data.getNamaPembeli(),
                    current.data.getNoHp());
            current = current.next;
        }
    }
}