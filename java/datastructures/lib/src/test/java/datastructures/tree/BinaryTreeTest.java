package datastructures.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BinaryTreeTest {
  BinaryTree<Integer> tree;

  @BeforeEach
  void setUp() {
    tree = new BinaryTree<>();
    tree.root = new Node<>(4);
    tree.root.leftNode = new Node<>(2);
    tree.root.rightNode = new Node<>(5);
  }

  @Test
  void preOrderTraversal() {
    List<Integer> preOrder = Arrays.asList(4, 2, 5);
    assertArrayEquals(preOrder.toArray(), tree.preOrderTraversal());
  }

  @Test
  void inOrderTraversal() {
    List<Integer> inOrder = Arrays.asList(2, 4, 5);
    assertArrayEquals(inOrder.toArray(), tree.inOrderTraversal());
  }

  @Test
  void postOrderTraversal() {
    List<Integer> postOrder = Arrays.asList(2, 5, 4);
    assertArrayEquals(postOrder.toArray(), tree.postOrderTraversal());
  }
}
