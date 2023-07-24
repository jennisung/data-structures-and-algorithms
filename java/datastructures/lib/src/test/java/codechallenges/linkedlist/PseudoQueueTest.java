package codechallenges.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PseudoQueueTest {
  private PseudoQueue<Integer> pseudoQueue;

  @BeforeEach
  public void setUp() {
    pseudoQueue = new PseudoQueue<>();
  }



  @Test
  public void enqueueTesting() {
    pseudoQueue.enqueue(1);
    pseudoQueue.enqueue(2);
    pseudoQueue.enqueue(3);

    assertEquals(Integer.valueOf(1), pseudoQueue.dequeue());
    assertEquals(Integer.valueOf(2), pseudoQueue.dequeue());
    assertEquals(Integer.valueOf(3), pseudoQueue.dequeue());
  }

  @Test
  public void dequeueTesting() {
    pseudoQueue.enqueue(1);
    pseudoQueue.enqueue(2);
    pseudoQueue.enqueue(3);

    assertEquals(Integer.valueOf(1), pseudoQueue.dequeue());
    assertEquals(Integer.valueOf(2), pseudoQueue.dequeue());
    assertEquals(Integer.valueOf(3), pseudoQueue.dequeue());
  }
}
