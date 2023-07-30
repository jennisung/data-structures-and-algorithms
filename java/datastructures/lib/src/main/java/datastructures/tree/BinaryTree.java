package datastructures.tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T extends Comparable<? super T>>
{
  Node<T> root;

  public Object[] preOrderTraversal()
  {
    List<T> outputValues = new ArrayList<>();
    preOrder(root, outputValues);
    return outputValues.toArray();
  }

  private void preOrder(Node<T> curr, List<T> outputValues)
  {
    if (curr != null)
    {
      outputValues.add(curr.value);
      preOrder(curr.leftNode, outputValues);
      preOrder(curr.rightNode, outputValues);
    }
  }

  public Object[] inOrderTraversal()
  {
    List<T> outputValues = new ArrayList<>();
    inOrder(root, outputValues);
    return outputValues.toArray();
  }

  private void inOrder(Node<T> curr, List<T> outputValues)
  {
    if (curr != null)
    {
      inOrder(curr.leftNode, outputValues);
      outputValues.add(curr.value);
      inOrder(curr.rightNode, outputValues);
    }
  }

  public Object[] postOrderTraversal()
  {
    List<T> outputValues = new ArrayList<>();
    postOrder(root, outputValues);
    return outputValues.toArray();
  }

  private void postOrder(Node<T> curr, List<T> outputValues)
  {
    if (curr != null)
    {
      postOrder(curr.leftNode, outputValues);
      postOrder(curr.rightNode, outputValues);
      outputValues.add(curr.value);
    }
  }
}
