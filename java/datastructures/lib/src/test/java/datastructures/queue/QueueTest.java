package datastructures.queue;

import datastructures.stack.Stack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class QueueTest
{
  @Test void testAMethod()
  {
    Queue<Integer> sut = new Queue<>();
    System.out.println(sut);
    assertTrue(!sut.isEmpty());
  }
}
