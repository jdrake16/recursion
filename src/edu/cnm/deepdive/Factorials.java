package edu.cnm.deepdive;

import java.math.BigInteger;

public class Factorials {

  /**
   *
   * @param val
   * @return the computed value of n!
   * @throws IllegalArgumentException when n < 0.
   */
  public static BigInteger computeRecursive(int val) throws IllegalArgumentException {
    BigInteger result;
    if (val < 0) {
      throw new IllegalArgumentException();
    }
    if (val == 0) {
      result = BigInteger.valueOf(val);
    } else {
      result = BigInteger.valueOf(val).multiply(computeRecursive(val - 1));
    }
    return result;
  }

}
