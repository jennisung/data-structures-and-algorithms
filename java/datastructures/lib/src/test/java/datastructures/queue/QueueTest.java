package datastructures.queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
  private Queue<Integer> queue;

  @BeforeEach
  public void setUp() {
    queue = new Queue<>();
  }

  @Test public void enqueueIntoQueue() {
    queue.enqueue(1);
    assertFalse(queue.isEmpty());
  }


  @Test public void multipleValuesIntoQueue() {
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);

    assertFalse(queue.isEmpty());
  }

  @Test public void dequeueOutOfExpectedValue() {
    queue.enqueue(1);
    queue.enqueue(2);

    int dequeuedValue = queue.dequeue();

    assertEquals(1, dequeuedValue);
    assertEquals(2, queue.peek());
  }

  @Test public void emptyQueueAfterMultiple() {
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);

    queue.dequeue();
    queue.dequeue();
    queue.dequeue();

    assertTrue(queue.isEmpty());
  }

  @Test public void instantiateEmptyQueue() {
    assertTrue(queue.isEmpty());
  }

  @Test public void emptyQueueRaisesException() {
    assertThrows(RuntimeException.class, () -> queue.peek());
  }
}

