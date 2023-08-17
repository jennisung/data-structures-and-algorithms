# Code Challenge 27: Quick Sort

## Explanation
In this blogpost I'll be providing a simple explanation of the steps to quicksort the followingarray [8, 4, 23, 42, 16, 15]:

## First step:
Lets say the middle element of this array is 23, which we'll pick to pivot.

## Second step:
Divide into sub-arrays: [8, 4, 16, 15], in which the elements are less than 23. The for those greater than 23, which are [23], [42].

## Third step:
Will be recursively sort the left and right sub-arrays:

### First to sort is the following sub-array [8, 4, 16, 15]:
* We will pivot 4 as it is the middle element. Now, we divide this array into three sub-arrays.
* In the left sub-array, there are no elements less than the pivot element numbered 4 . With no elements less than 4 in the array, it's empty.
* In the middle sub-array, there are elements equal to the pivot number of 4. Since it has only one element equal to the pivot, the middle will be [4].
* In the right sub-array, there are elements greater than the pivot (4). Which is [8, 16, 15], so right will be [8, 16, 15].

## Final step is to combine all sub-arrays: [4, 8, 15, 16], [23], [42]. Which wil combine to [4, 8, 15, 16, 23, 42].

## Thus, the final sorted array is [4, 8, 15, 16, 23, 42].

## Big 0:
In quick sort, the worst case will be O(n^2), but the average case will be O(nlogn).
