package datastructures.insertsort.insertsort;

public class InsertSort {
  public static int[] insert(int[] sorted, int value) {
    int i = 0;


    int[] afterSorted = new int[sorted.length + 1];
    while (i < sorted.length && value > sorted[i]) {
      afterSorted[i] = sorted[i];
      i++;
    }
    afterSorted[i] = value;
    while (i < sorted.length) {
      afterSorted[i + 1] = sorted[i];
      i++;
    }
    return afterSorted;
  }

  public static int[] insertionSort(int[] input) {
    int[] sorted = new int[1];
    sorted[0] = input[0];

    for (int i = 1; i < input.length; i++) {
      sorted = insert(sorted, input[i]);
    }
    return sorted;
  }
}

