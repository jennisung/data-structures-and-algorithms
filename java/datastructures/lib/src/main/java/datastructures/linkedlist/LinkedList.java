package datastructures.linkedlist;

public class LinkedList
{
    private Node head;

    private static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public void insert(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public boolean includes(int value) {
        Node current = head;
        while (current != null) {
            if (current.value == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder stringRepresentation = new StringBuilder();
        Node currentNode = head;

        while (currentNode != null) {
            stringRepresentation.append("{ ").append(currentNode.value).append(" } -> ");
            currentNode = currentNode.next;
        }

        stringRepresentation.append("null");
        return stringRepresentation.toString();
    }

}
