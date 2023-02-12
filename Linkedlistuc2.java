package Day14;

public class Linkedlistuc2 {
    private class Node {
        int data;
        Linkedlistuc2.Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Day14.Linkedlistuc2.Node head;

    public Linkedlistuc2() {
        this.head = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        Day14.Linkedlistuc2.Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    public static void main(String[] args) {
        Linkedlistuc2 linkedlistuc2 = new Linkedlistuc2();
        linkedlistuc2.add(70);
        linkedlistuc2.add(30);
        linkedlistuc2.add(56);
        linkedlistuc2.printList();
    }
}