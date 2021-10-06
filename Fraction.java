public class Fraction {
	private int numerator, denominator;

	public Fraction(int numerator, int denominator)
	{
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public int getNumerator()
	{
		return numerator;
	}

	public int getDenominator()
	{
		return denominator;
	}

	public double getDecimalValue()
	{
		double decimal = (double)numerator / denominator;
		return decimal;
	}

	public String toString()
	{
		return String.format(" %d %n---%n %d ", numerator, denominator);
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
}
