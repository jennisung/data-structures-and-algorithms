package datastructures.linkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.*;


public class LinkedListTest
{
  @Test public void emptyLinkedList() {
    LinkedList linkedList = new LinkedList();
    assertEquals("null", linkedList.toString());
  }


  @Test void insertLinkedList() {
    LinkedList linkedList = new LinkedList();
    linkedList.insert(5);
    linkedList.insert(10);
    assertEquals("{ 10 } -> { 5 } -> null", linkedList.toString());
  }


//  @Test void headNodeTest() {
//    LinkedList linkedList = new LinkedList();
//    linkedList.insert(5);
//    linkedList.insert(10);
//    Node headNode = linkedList.head;
//    assertNotNull(headNode);
//    assertEquals(10, headNode.value);
//  }


  @Test void insertMultipleNodes() {
    LinkedList linkedList = new LinkedList();
    linkedList.insert(5);
    linkedList.insert(10);
    linkedList.insert(15);
    assertEquals("{ 15 } -> { 10 } -> { 5 } -> null", linkedList.toString());
  }


  @Test void includingValue() {
    LinkedList linkedList = new LinkedList();
    linkedList.insert(5);
    linkedList.insert(10);
    linkedList.insert(15);
    assertTrue(linkedList.includes(10));
  }


  @Test void nonExistingValue() {
    LinkedList linkedList = new LinkedList();
    linkedList.insert(5);
    linkedList.insert(10);
    linkedList.insert(15);
    assertFalse(linkedList.includes(20));
  }


  @Test void allValues() {
    LinkedList linkedList = new LinkedList();
    linkedList.insert(5);
    linkedList.insert(10);
    linkedList.insert(15);
    assertEquals("{ 15 } -> { 10 } -> { 5 } -> null", linkedList.toString());
  }


//  Where k is greater than the length of the linked list
  @Test void KGreaterThanLength() {
    LinkedList linkedList = new LinkedList();
    linkedList.insert(1);
    linkedList.insert(2);
    linkedList.insert(3);
    linkedList.insert(4);

    assertThrows(IllegalArgumentException.class, () -> linkedList.kthFromEnd(5));
  }

//  Where k and the length of the list are the same
@Test void KSameToLength() {
  LinkedList linkedList = new LinkedList();
  linkedList.insert(1);
  linkedList.insert(2);
  linkedList.insert(3);
  linkedList.insert(4);

  assertThrows(IllegalArgumentException.class, () -> linkedList.kthFromEnd(4));
}

//  Where k is not a positive integer
@Test void testKNotPositiveInteger() {
  LinkedList linkedList = new LinkedList();
  linkedList.insert(1);
  linkedList.insert(2);
  linkedList.insert(3);
  linkedList.insert(4);

  assertThrows(IllegalArgumentException.class, () -> linkedList.kthFromEnd(-1));
}

//  Where the linked list is of a size 1
@Test void linkedListSizeOne() {
  LinkedList linkedList = new LinkedList();
  linkedList.insert(10);

  int result = linkedList.kthFromEnd(0);

  assertEquals(10, result);
}

//  “Happy Path” where k is not at the end, but somewhere in the middle of the linked list

  @Test void happyPath() {
    LinkedList linkedList = new LinkedList();
    linkedList.insert(1);
    linkedList.insert(2);
    linkedList.insert(3);
    linkedList.insert(4);

    int result = linkedList.kthFromEnd(2);

    assertEquals(3, result);
  }

}
