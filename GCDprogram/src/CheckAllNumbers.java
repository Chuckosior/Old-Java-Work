// This class computes the gcd of m and n by checking all numbers from
// the minimum of m and n down to 1 until it finds a common divisor.
//
// gcd() method written by YOUR NAME HERE

public class CheckAllNumbers extends GCDAlgorithm
{
  public CheckAllNumbers()
  {
    super("Check all numbers");
  }


  public int gcd(int m, int n)
  {
   int r = Math.min(m, n);
   while(mod(m,r)!=0||mod(n,r)!=0){
	   r--;
   }
   return r;
  }
}
