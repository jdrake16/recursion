package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;


class FactorialsTest {

  static final long[][] testCases = {
      {0,	1},
      {1,	1},
      {5,	120},
      {10,	3628800},
      {13,	6227020800L}
  };



  @Test
  void computeRecursive() {
    for (long[] testCase : testCases) {
      int val = (int) testCase[0];
      BigInteger expected = BigInteger.valueOf(testCase[1]);
      BigInteger actual = Factorials.computeRecursive(val);
      assertEquals(expected, actual);
    }
    assertThrows(IllegalArgumentException.class, () -> Factorials.computeRecursive(-1));
  }

  @Test
  void computeIterative() {
    for (long[] testCase : testCases) {
      int val = (int) testCase[0];
      BigInteger expected = BigInteger.valueOf(testCase[1]);
      BigInteger actual = Factorials.computeIterative(val);
      assertEquals(expected, actual);
    }
    assertThrows(IllegalArgumentException.class, () -> Factorials.computeRecursive(-1));
  }

}

