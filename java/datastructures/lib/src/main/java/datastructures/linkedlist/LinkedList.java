package datastructures.linkedlist;

import java.util.Map;
import java.util.HashMap;
import java.util.NoSuchElementException;


public class LinkedList {
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


  public void append(int value) {
      Node newNode = new Node(value);

      if (head == null) {
        head = newNode;
      } else {

        Node current = head;

        while (current.next != null) {
          current = current.next;
        }

        current.next = newNode;
      }

    }



  public void insertBefore(int prevValue, int newValue) {
    Node newNode = new Node(newValue);
    if (head != null) {

      if (head.value == prevValue) {
        newNode.next = head;
        head = newNode;


        return;
      }

      Node current = head;
      while (current.next != null) {
        if (current.next.value == prevValue) {
          newNode.next = current.next;
          current.next = newNode;

          return;
        }
        current = current.next;

      } }
    }



  public void insertAfter(int prevValue, int newValue) {
    Node newNode = new Node(newValue);

    if (head != null) {
      Node current = head;


      while (current != null) {
        if (current.value == prevValue) {
          newNode.next = current.next;
          current.next = newNode;
          return;
        }
        current = current.next;
      }
    }}


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


  public int kthFromEnd(int k) {
    if (this.head == null) {
      throw new NoSuchElementException("Null");
    }

    if (k < 0) {
      throw new IllegalArgumentException("Error: k must be a non-negative integer.");
    }

    Map<Integer, Integer> nodeValueMap = new HashMap<>();
    Node curr = this.head;
    int index = 0;

    while (curr != null) {
      nodeValueMap.put(index, curr.value);
      index++;
      curr = curr.next;
    }

    if (k >= index) {
      throw new IllegalArgumentException("Error: k must be less than the size of the linked list");
    }

    int newIndex = index - k - 1;

    return nodeValueMap.get(newIndex);
  }

}
