package datastructures.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BinarySearchTreeTest {
  BinarySearchTree<Integer> tree;

  @BeforeEach
  void setUp() {
    tree = new BinarySearchTree<>();
    tree.add(4);
    tree.add(2);
    tree.add(5);
    tree.add(1);
    tree.add(3);
  }

//  @Test
//  void preOrderTraversal() {
//    List<Integer> preOrder = Arrays.asList(4, 2, 1, 3, 5);
//    assertEquals(preOrder, tree.preOrderTraversal());
//  }


  @Test
  void testContains() {
    assertTrue(tree.contains(1));
    assertTrue(tree.contains(2));
    assertTrue(tree.contains(3));
    assertTrue(tree.contains(4));
    assertTrue(tree.contains(5));

    // The tree does not contain value 6
    assertFalse(tree.contains(6));
  }
}

