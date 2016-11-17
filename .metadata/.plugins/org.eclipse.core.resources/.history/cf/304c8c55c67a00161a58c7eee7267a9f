/*
GCD program
Authors: gcd algorithms written by YOUR_NAME_HERE
gcd(), findPrimes() and main() written by David Herscovici

This program computes the greatest common divisor of several different
pairs of numbers as read in from the file numbers.dat.

The first line of the file gives the largest number that appears in
the rest of the file, and each of the following lines gives pairs of
numbers whose gcd is to be computed.  For example, suppose numbers.dat
contains the following data.

10000
98 28
0 30
100 1000
9967 9973

The first line indicates that none of the numbers below is larger than
10,000.  The next line asks for gcd(98, 28), then gcd(0, 30), and so
on.

*/

import java.io.*;
import java.util.Scanner;

public class GCD
{
  private static GCDAlgorithm checkAll, factor, euclid;

  // main() reads the file, sets up the array of primes, and calls the
  // gcd() method for each pair of integers in the file.
  public static void main(String[] args)
  {
    Scanner input = null;
    int max;
    int m, n;

    if (args.length != 1)
    {
      System.out.println("USAGE: java GCD <file>");
      System.exit (-1);
    }

    // Open the file, read in the largest integer, and compute the
    // array of primes
    try
    {
      input = new Scanner(new File(args[0]));
    }
    catch (FileNotFoundException e)
    {
      System.out.println("ERROR: file " + args[0] + " does not exist");
      System.exit(-1);
    }

    checkAll = new CheckAllNumbers();
    max = input.nextInt();
    factor = new FactorNumbers(max);
    euclid = new Euclid();

    // read the rest of the lines and pass each pair of numbers to
    // the gcd() method
    while (input.hasNextInt())
    {
      m = input.nextInt();
      n = input.nextInt();
      callAlgorithms(m, n);
    }
    input.close();
  }

  // callAlgorithms() creates an instance of each GCDAlgorithm and
  // calls the compute() method for m and n within each one.
  public static void callAlgorithms(int m, int n)
  {
    long timeStart, timeEnd;
    int d;

    System.out.println ("Finding gcd(" + m + ", " + n + ")");

    // Compute the gcd of m and n by each of the algorithms, and
    // measure the amount of time used by each method.
    checkAll.compute(m, n);
    factor.compute(m, n);
    euclid.compute(m, n);
    System.out.println();
  }
}
