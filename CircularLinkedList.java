public class CircularLinkedList<T> extends MyLinkedList<T> {

    private static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> head;

    @Override
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            return;
        }
        Node<T> last = head;
        while (last.next != head) {
            last = last.next;
        }
        last.next = newNode;
        newNode.next = head;
    }

    @Override
    public void remove(T data) {
        if (head == null) return;

        Node<T> current = head, prev = null;
        do {
            if (current.data.equals(data)) {
                break;
            }
            prev = current;
            current = current.next;
        } while (current != head);

        if (!current.data.equals(data)) {
            System.out.println("Data tidak ditemukan.");
            return;
        }

        if (current.next == head && prev == null) {
            head = null;
            return;
        }

        if (current == head) {
             while(prev.next != head) {
                prev = prev.next;
            }
            head = current.next;
            prev.next = head;
        } else {
            prev.next = current.next;
        }
    }

    @Override
    public void display() {
        if (head == null) {
            System.out.println("List kosong.");
            return;
        }
        System.out.print("");
        Node<T> current = head;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println("(kembali ke " + head.data + ")");
    }
    
    @Override
    public boolean isEmpty() {
        return head == null;
    }
}

