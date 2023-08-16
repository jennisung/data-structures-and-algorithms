package datastructures.mergesort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortTest {

  @Test
  public void testMergeSort() {
    int[] arr = {8, 4, 23, 42, 16, 15};
    int[] expected = {4, 8, 15, 16, 23, 42};
    MergeSort.mergeSort(arr, 0, arr.length - 1);
    assertArrayEquals(expected, arr);
  }
}
