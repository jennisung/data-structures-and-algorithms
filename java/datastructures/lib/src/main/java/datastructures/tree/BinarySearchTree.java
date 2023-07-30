package datastructures.tree;

public class BinarySearchTree<T extends Comparable<? super T>> extends BinaryTree<T> {
  public void add(T value) {
    if (getRoot() == null) {
      setRoot(new Node(value));
    } else {
      addHelper(getRoot(), value);
    }
  }

  private void setRoot(Node<T> node) {
    this.root = node;
  }

  private Node<T> getRoot() {
    return root;
  }

  private Node<T> root;

  private void addHelper(Node<T> current, T value) {
    if (value.compareTo(current.getValue()) < 0) {
      if (current.getLeft() == null) {
        current.setLeft(new Node(value));
      } else {
        addHelper(current.getLeft(), value);
      }
    } else if (value.compareTo(current.getValue()) > 0) {
      if (current.getRight() == null) {
        current.setRight(new Node(value));
      } else {
        addHelper(current.getRight(), value);
      }
    }
  }

  public boolean contains(T value) {
    return containsHelper(getRoot(), value);
  }

  private boolean containsHelper(Node<T> current, T value) {
    if (current == null) {
      return false;
    } else if (value.compareTo(current.getValue()) == 0) {
      return true;
    } else if (value.compareTo(current.getValue()) < 0) {
      return containsHelper(current.getLeft(), value);
    } else {
      return containsHelper(current.getRight(), value);
    }
  }
}
