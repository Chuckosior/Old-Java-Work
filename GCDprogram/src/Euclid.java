// This class computes the gcd of m and n by using the Euclidean
// algorithm.
//
// gcd() method written by Chris Kosior

public class Euclid extends GCDAlgorithm
{
	public Euclid()
	{
		super("Euclidean Algorithm");
	}


	public int gcd(int m, int n)
	{
		while(n != 0) {
			int temp = n;
					n = mod(m,n);
					m = temp;
		}
		return m;
	}
}

