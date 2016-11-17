// This class represents an algorithm for computing the gcd of two
// numbers m and n.  It also includes a counter to specify how many
// times certain operations are executed (to be maintained by the
// client).  The operations are intended to represent the basic
// operations of the algorithm.

public abstract class GCDAlgorithm
{
  protected int counter;
  private String algName;

  public GCDAlgorithm(String name)
  {
    algName = name;
  }

  // The compute() method calls the gcd() method, times how long it
  // takes using System.currentTimeMillis(), and prints out the total
  // time and the number of basic operations.  The method
  // System.currentTimeMillis() returns the number of milliseconds
  // (thousandths of a second) since midnight (GMT) on January 1,
  // 1970.

  public void compute(int m, int n)
  {
    long timeStart, timeEnd;
    int d;

    // Compute the gcd of m and n, measure the amount of time used,
    // and count the number of basic operations.
    counter = 0;
    timeStart = System.currentTimeMillis();
    d = gcd(m, n);
    timeEnd = System.currentTimeMillis();
    System.out.printf("%-20s Answer = %-5d %5d millisec. %5d operations\n",
		      algName+":", d, timeEnd - timeStart, counter);
  }

  // The gcd() method must be overridden to compute the actual gcd,
  // and also to count the basic operations.
  public abstract int gcd(int m, int n);

  // The div() and mod() methods returns m/n and m%n, respectively,
  // and increment the counter.
  public int div (int m, int n)
  {
    counter++;
    return m / n;
  }

  public int mod (int m, int n)
  {
    counter++;
    return m % n;
  }
}
