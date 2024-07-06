package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));

    Calculate calculate_and = new Calculate();
    int expected_and = 5;
    assertEquals(expected_and, calculate_and.sum_and(2, 3));

    Calculate calculate_to = new Calculate();
    int expected_to = 55;
    assertEquals(expected_to, calculate_to.sum_to(1, 10));

    Calculate calculate_odd = new Calculate();
    int expected_odd = 25;
    assertEquals(expected_odd, calculate_odd.sum_odd(1, 10));
  }
}
