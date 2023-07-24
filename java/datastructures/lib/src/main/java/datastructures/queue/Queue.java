package datastructures.queue;

import datastructures.queue.Node;

public class Queue<T>
{
  Node<T> front;
  Node<T> back;

  public Queue() {
    front = null;
    back = null;
  }

 public void enqueue(T valueToEnqueue)
  {
    // TODO: implement me
    Node<T> newNode = new Node<>(valueToEnqueue);

    if (isEmpty()) {
      front = back = newNode;
    } else {
      back.next = newNode;
      back = newNode;
    }
  }

  public T dequeue()
  {
    // TODO: implement me
    if (isEmpty()) {
      throw new RuntimeException("Empty Queue");
    }

    Node<T> dequeuedNode = front;

    front = front.next;
    dequeuedNode.next = null;

    return dequeuedNode.value;
  }



  public T peek()
  {
    // TODO: implement me
    if(isEmpty()) {
      throw new RuntimeException("Empty Queue");
    }
    return front.value;
  }


  public boolean isEmpty()
  {
    // TODO: implement me
    return front == null;
  }
}
