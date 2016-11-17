
public class Fraction {
	private int numerator;
	private int denominator;

	//full fraction constructor
	public Fraction(int numerator, int denominator) {
		this.numerator=numerator;
		this.denominator=denominator;
	}

	//add
	public Fraction add(Fraction f) {
		int a = numerator;
		int b = denominator;
		int c = f.getNumerator();
		int d = f.getDenominator();
		int adNum = (a*d)+(b*c);
		int adDen = (b*d);
		int g = GCD(adNum,adDen);
		Fraction frac = new Fraction(adNum/g,adDen/g);
		return frac;
	}

	//subtract
	public Fraction subtract(Fraction f) {
		int a = numerator;
		int b = denominator;
		int c = f.getNumerator();
		int d = f.getDenominator();
		int subDen = (b*d);
		int subNum = (a*d-b*c);
		int g = GCD(subNum,subDen);
		Fraction frac = new Fraction(subNum/g, subDen/g);
		return frac;
	}

	//multiply
	public Fraction multiply(Fraction f) {
		int a = numerator;
		int b = denominator;
		int c = f.getNumerator();
		int d = f.getDenominator();
		int multNum = a*c;
		int multDen = b*d;
		int g = GCD(multNum, multDen);
		Fraction frac = new Fraction(multNum/g,multDen/g);
		return frac;
	}

	//divide
	public Fraction divide(Fraction f) {
		int a = numerator;
		int b = denominator;
		int c = f.getNumerator();
		int d = f.getDenominator();
		int divNum = a*d;
		int divDen = b*c;
		System.out.println(divNum +"  "+ divDen);
		int g = GCD(divNum, divDen);
		System.out.println("gcd" + g);
		Fraction frac = new Fraction(divNum/g,divDen/g);
		System.out.println(frac);
		return frac;
	}

	//getNumerator 
	public int getNumerator() {
		return numerator;
	}

	//getDenominator
	public int getDenominator() {
		return denominator;
	}

	//toString
	public String toString() {
		return getNumerator()+"/"+getDenominator();
	}

	//GCD
	public int GCD(int a, int b) {
		if(b == 0) return a;
		else return (GCD(b,a%b));
	}
	
	//main method
	public static void main(String[] args) {
		Fraction f1 = new Fraction(3,4);
		System.out.println(f1); // Should print 3/4
		Fraction f2 = new Fraction(1,2);
		System.out.println(f2); // Should print 1/2
		System.out.println(f1.getNumerator()); // Should print 3
		System.out.println(f2.getDenominator()); // Should print 2
		System.out.println(f1.add(f2)); // Should print 5/4
		System.out.println(f1.subtract(f2)); // Should print 1/4
		System.out.println(f1.multiply(f2)); // Should print 3/8
		System.out.println(f1.divide(f2)); // Should print 3/2
	}
}
