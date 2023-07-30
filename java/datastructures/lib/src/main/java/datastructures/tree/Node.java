package datastructures.tree;

public class Node<T extends Comparable<? super T>> {
  T value;
  Node<T> leftNode;
  Node<T> rightNode;

  public Node(T value) {
    this.value = value;
    this.leftNode = null;
    this.rightNode = null;
  }

  public T getValue() {
    return value;
  }

  public Node<T> getLeft() {
    return leftNode;
  }

  public void setLeft(Node<T> leftNode) {
    this.leftNode = leftNode;
  }

  public Node<T> getRight() {
    return rightNode;
  }

  public void setRight(Node<T> rightNode) {
    this.rightNode = rightNode;
  }
}

