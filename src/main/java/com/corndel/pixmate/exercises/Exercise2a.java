package com.corndel.pixmate.exercises;

import java.util.Arrays;

/**
 * @see <a href="https://tech-docs.corndel.com/java/loop-control-flow.html">Loop Control Flow in Java</a>
 */
public class Exercise2a {

  /**
   * Calculates the sum of numbers in an array that are either even or greater than 10,
   * but skips numbers that are both.
   * <p>
   * For example, if the input array is [1, 4, 12, 15, 20, 5, 8, 10], the method returns 37.
   * </p>
   *
   * @param numbers an array of numbers to be processed
   * @return the sum of numbers that meet the criteria
   */
  public static int sumSelective(int[] numbers) {
    return Arrays.stream(numbers).reduce(0, (acc, cur) -> {
      if (!(cur > 10 && cur % 2 == 0) && (cur > 10 || cur % 2 == 0)) {
        return acc + cur;
      } else {
        return acc;
      }
    });
  }
}