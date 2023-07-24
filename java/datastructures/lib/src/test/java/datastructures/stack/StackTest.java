package datastructures.stack;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;


public class StackTest
{
//  @Test void testAMethod()
//  {
//    Stack<Integer> sut = new Stack<>();
//    System.out.println(sut);
//    assertTrue(!sut.isEmpty());
//  }

  private Stack<Integer> stack;

  @BeforeEach public void setUp() {
    stack = new Stack<>();
  }

  @Test public void peekOnEmptyStack() {
    assertThrows(RuntimeException.class, () -> stack.peek());
  }

  @Test public void popOnEmptyStack() {
    assertThrows(RuntimeException.class, () -> stack.pop());
  }

  @Test public void instantiateEmptyStack() {
    assertTrue(stack.isEmpty());
  }

  @Test public void canPeekNextItem() {
    stack.push(10);
    stack.push(20);

    assertEquals(20, stack.peek());
  }

  @Test public void emptyStackAfterMultiplePops() {
    stack.push(10);
    stack.push(20);
    stack.push(30);

    stack.pop();
    stack.pop();
    stack.pop();

    assertTrue(stack.isEmpty());
  }

  @Test public void canPushToStack() {
    stack.push(10);
    assertFalse(stack.isEmpty());
  }

  @Test public void pushMultipleToStack() {
    stack.push(10);
    stack.push(20);
    stack.push(30);

    assertFalse(stack.isEmpty());
  }

  @Test public void popOffStack() {
    stack.push(10);
    stack.push(20);
    int poppedValue = stack.pop();

    assertEquals(20, poppedValue);
    assertEquals(10, stack.peek());
  }

}
