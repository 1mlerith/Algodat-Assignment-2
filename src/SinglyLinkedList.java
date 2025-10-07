public class SinglyLinkedList extends MyLinkedList {

    private static class Node {
        Object data;
        Node next;

        public Node(Object data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head; 

    @Override
    public void add(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    @Override
    public void remove(Object data) {
        if (head == null) return;

        if (head.data.equals(data)) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && !current.next.data.equals(data)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    @Override
    public void display() {
        Node current = head;
        System.out.print("Isi Garasi: [ ");
        while (current != null) {
            if (current.data instanceof Kendaraan) {
                System.out.print(((Kendaraan) current.data).getMerk());
            } else {
                System.out.print(current.data);
            }
            
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println(" ]");
    }
    
    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    @Override
    public Object get(int index) {
        Node current = head;
        int count = 0;
        while (current != null) {
            if (count == index) {
                return current.data;
            }
            count++;
            current = current.next;
        }
        return null; 
    }
}
