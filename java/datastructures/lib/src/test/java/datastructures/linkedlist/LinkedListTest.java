package datastructures.linkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

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


}
