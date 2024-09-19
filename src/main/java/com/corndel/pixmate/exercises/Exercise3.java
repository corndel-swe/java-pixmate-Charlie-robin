package com.corndel.pixmate.exercises;

public class Exercise3 {
  // https://tech-docs.corndel.com/java/nested-loops.html

  /**
   * Given a grid of numbers (an array of arrays), count how many are larger than 10.
   *
   * @example // returns 4 gridLimit([ [3, 12, 1], [19, 10, 11], [9, 5, 105] ])
   * @param {int[][]} grid - an array of arrays of numbers
   * @returns {int} The count of numbers larger than 10
   */
  public static int gridLimit(int[][] grid) {
    int count = 0;
    for (int[] row : grid) {
      for (int cell : row) {
        if (cell > 10) {
          count++;
        }
      }

    }
    return count;
  }
}
