public class DoubleLinkedList {
    static class Node {
        int data;
        Node prev;
        Node next;
        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    Node head = null;
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {

        DoubleLinkedList list = new DoubleLinkedList();
        list.insertAtBeginning(30);
        list.insertAtBeginning(20);
        list.insertAtBeginning(10);

        list.display();
    }
}