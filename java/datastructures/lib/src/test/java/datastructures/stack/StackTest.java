package datastructures.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StackTest
{
  @Test void testAMethod()
  {
    Stack<Integer> sut = new Stack<>();
    System.out.println(sut);
    assertTrue(!sut.isEmpty());
  }
}
