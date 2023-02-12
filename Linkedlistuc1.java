package Day14;

public class Linkedlistuc1 {
        private class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        private Day14.Linkedlistuc1.Node head;

        public Linkedlistuc1() {
            this.head = null;
        }

        public void add(int data) {
            Day14.Linkedlistuc1.Node newNode = new Day14.Linkedlistuc1.Node(data);
            newNode.next = head;
            head = newNode;
        }

        public void printList() {
            Day14.Linkedlistuc1.Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
        }
        public static void main(String[] args) {
            Day14.Linkedlist linkedList = new Day14.Linkedlist();
            linkedList.add(70);
            linkedList.add(56);
            linkedList.add(30);
            linkedList.printList();
        }
    }
