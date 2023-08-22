package datastructures.tree;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Set;
import java.util.HashSet;

public class TreeIntersectionTest {

  @Test
  public void testTreeIntersectionTest() {
    Node<Integer> firstTreeRoot = new Node<>(1);
    firstTreeRoot.setLeft(new Node<>(2));
    firstTreeRoot.setRight(new Node<>(3));

    Node<Integer> secondTree = new Node<>(3);
    secondTree.setLeft(new Node<>(4));
    secondTree.setRight(new Node<>(5));

    TreeIntersection<Integer> treeIntersection = new TreeIntersection<>();
    Set<Integer> result = treeIntersection.treeIntersection(firstTreeRoot, secondTree);

    Set<Integer> expected = new HashSet<>();
    expected.add(3);

    assertEquals(expected, result);
  }
}
