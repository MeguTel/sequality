package org.example;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public int sum_and(int x, int y) {
    double z = x + y;
    System.out.println("Sum of " + x + " and " + y + " is " + (int) z + ". Average is " + z / 2);
    return x + y;
  }

  public int sum_to(int x, int y) {
    int cnt = 0;
    double z = 0;
    for (int i = x; i <= y; i++) {
      z = z + i;
      cnt++;
    }
    System.out.println("Sum of " + x + " to " + y + " is " + (int) z + ". Average is " + z / cnt);
    return (int) z;
  }

  public int sum_odd(int x, int y) {
    int n = 0, m = 0;
    for (int i = x; i <= y; i++) {
      if (i % 2 != 0) {
        n = n + i;
      } else {
        m = m + i;
      }
    }
    System.out.println("Sum of odd of " + x + " to " + y + " is " + n + ". Sum of even is " + m);
    return n;
  }
}
