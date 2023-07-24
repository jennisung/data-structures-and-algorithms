package datastructures.stack;

import datastructures.stack.Node;

public class Stack<T>
{
  Node<T> top;

  public void push(T valueToPush)
  {
    // TODO: implement me
    Node<T> newNode = new Node<>(valueToPush);
    newNode.next = top;
    top = newNode;
  }

  public T pop()
  {
    // TODO: implement me
    if (isEmpty()) {
      throw new RuntimeException("Empty Stack.");
    }

    Node<T> poppedNode = top;
    top = top.next;
    poppedNode.next = null;
    return poppedNode.value;

  }



  public T peek()
  {
    // TODO: implement me
    if(isEmpty()) {
      throw new RuntimeException("Empty Stack");
    }
    return top.value;
  }




  public boolean isEmpty()
  {
    // TODO: implement me
    return top == null;
  }
}
