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



//  lab 16 test
  @Test void findMaxValue() {
    BinaryTree<Integer> tree = new BinaryTree<>();
    tree.root = new Node<>(2);
    tree.root.leftNode = new Node<>(7);
    tree.root.rightNode = new Node<>(5);
    tree.root.leftNode.leftNode = new Node<>(2);
    tree.root.leftNode.rightNode = new Node<>(6);
    tree.root.rightNode.rightNode = new Node<>(9);
    tree.root.leftNode.rightNode.leftNode = new Node<>(5);
    tree.root.leftNode.rightNode.rightNode = new Node<>(11);
    tree.root.rightNode.rightNode.rightNode = new Node<>(4);

    // output 11
    Integer expectedMax = 11;
    Integer actualMax = tree.findMaxValue();

    assertEquals(expectedMax, actualMax);
  }

  private void assertEquals(Integer expectedMax, Integer actualMax) {
  }

}
