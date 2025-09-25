public class DoublyLinkedList<T> extends MyLinkedList<T> {

    private static class DNode<T> {
        T data;
        DNode<T> prev;
        DNode<T> next;

        public DNode(T data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private DNode<T> head; // Node pertama

    @Override
    public void add(T data) {
        DNode<T> newNode = new DNode<>(data);
        if (head == null) {
            head = newNode;
            return;
        }
        DNode<T> last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        newNode.prev = last;
    }

    @Override
    public void remove(T data) {
        if (head == null) return;

        DNode<T> current = head;
        while (current != null && !current.data.equals(data)) {
            current = current.next;
        }

        if (current == null) return;

        if (current.prev != null) {
            current.prev.next = current.next;
        } else {
            head = current.next;
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        }
    }

    @Override
    public void display() {
        DNode<T> current = head;
        System.out.print("null <- ");
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }
}

