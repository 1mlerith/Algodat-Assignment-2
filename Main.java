import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner (System.in);

        MyLinkedList<Integer> singlyList = new SinglyLinkedList<>();
        singlyList.add(10);
        singlyList.add(20);
        singlyList.add(30);
        
        System.out.println("--- Menggunakan Singly Linked List ---");
        singlyList.display();
        System.out.print("Pilih data yang ingin di hapus: ");
        int pilih1 = userInput.nextInt();
        singlyList.remove(pilih1);
        System.out.println("Hasil setelah menghapus " + pilih1 + ": ");
        singlyList.display();
        System.out.println();

        MyLinkedList<String> doublyList = new DoublyLinkedList<>();
        doublyList.add("Java");
        doublyList.add("Python");
        doublyList.add("C++");
        
        System.out.println("--- Menggunakan Doubly Linked List  ---");
        doublyList.display();
        System.out.print("Pilih data yang ingin di hapus: ");
        String pilih2 = userInput.next();
        doublyList.remove(pilih2);
        System.out.println("Hasil setelah menghapus " + pilih2 + ": ");
        doublyList.display();
        System.out.println();

        MyLinkedList<Integer> circularList = new CircularLinkedList<>();
        circularList.add(100);
        circularList.add(200);
        circularList.add(300);

        System.out.println("--- Menggunakan Circular Linked List ---");
        circularList.display();
        System.out.print("Pilih data yang ingin di hapus: ");
        int pilih3 = userInput.nextInt();
        circularList.remove(pilih3);
        System.out.println("Hasil setelah menghapus " + pilih2 + ": ");
        circularList.display();
        System.out.println();
    }
}

