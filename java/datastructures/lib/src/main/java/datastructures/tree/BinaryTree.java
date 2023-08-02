package datastructures.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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


//  lab16 Find the Maximum Value in a Binary Tree

  public T findMaxValue() {
    if (root == null) {
      return null;
    }

    T maxValue = root.value;
    Queue<Node<T>> queue = new LinkedList<>();
    queue.offer(root);

    while (!queue.isEmpty()) {
      Node<T> curr = queue.poll();

      if (curr.value.compareTo(maxValue) > 0) {
        maxValue = curr.value;
      }

      if (curr.leftNode != null) {
        queue.offer(curr.leftNode);
      }
      if (curr.rightNode != null) {
        queue.offer(curr.rightNode);
      }
    }

    return maxValue;
  }


  //Code Challenge: Class 17
  public List<T> breadthFirstTraversal() {
    List<T> outputValues = new ArrayList<>();
    if (root == null) {
      return outputValues;
    }

    Queue<Node<T>> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
      Node<T> curr = queue.poll();
      outputValues.add(curr.value);

      if (curr.leftNode != null) {
        queue.add(curr.leftNode);
      }

      if (curr.rightNode != null) {
        queue.add(curr.rightNode);
      }
    }

    return outputValues;
  }





// lab 18 fizz-buzz
public void fizzBuzzTree() {
  root = applyDivisibilityRules(root);
}


  private Node<T> applyDivisibilityRules(Node<T> node) {
    if (node == null) {
      return null;
    }

    T value = node.value;


    if (value instanceof Integer) {
      int intOfNode = (Integer) value;
      if (intOfNode % 3 == 0 && intOfNode % 5 == 0) {
        node.value = (T) "FizzBuzz";
      } else if (intOfNode % 3 == 0) {
        node.value = (T) "Fizz";
      } else if (intOfNode % 5 == 0) {
        node.value = (T) "Buzz";
      } else {
        node.value = (T) String.valueOf(intOfNode);
      }
    }

    node.leftNode = applyDivisibilityRules(node.leftNode);
    node.rightNode = applyDivisibilityRules(node.rightNode);


    return node;
  }

}














