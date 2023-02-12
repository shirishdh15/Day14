package Day14;

public class Linkedlist {
        private class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        private Node head;

        public Linkedlist() {
            this.head = null;
        }

        public void add(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
        }
        public static void main(String[] args) {
            Linkedlist linkedList = new Linkedlist();
            linkedList.add(56);
            linkedList.add(30);
            linkedList.add(70);
            linkedList.printList();
        }
    }