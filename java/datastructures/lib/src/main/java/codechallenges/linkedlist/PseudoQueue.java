package codechallenges.linkedlist;

import datastructures.stack.Stack;

public class PseudoQueue<T> {
  private Stack<T> firstStack;
  private Stack<T> secondStack;

  public PseudoQueue() {
    firstStack = new Stack<>();
    secondStack = new Stack<>();
  }


  public void enqueue(T value) {
    while (!secondStack.isEmpty()) {
      firstStack.push(secondStack.pop());
    }

    firstStack.push(value);
  }

  public T dequeue() {
    if (secondStack.isEmpty()) {
      while (!firstStack.isEmpty()) {
        secondStack.push(firstStack.pop());
      }
    }

    return secondStack.pop();
  }
}
