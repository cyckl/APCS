import java.text.DecimalFormat;

public class Coins {
	private int quarters, dimes, nickels, pennies;
	public static final double QUARTER_VALUE = 0.25;
	public static final double DIME_VALUE = 0.10;
	public static final double NICKEL_VALUE = 0.05;
	public static final double PENNY_VALUE = 0.01;

	public Coins(int quarters, int dimes, int nickels, int pennies) {
		this.quarters = quarters;
		this.dimes = dimes;
		this.nickels = nickels;
		this.pennies = pennies;
	}

	public double getTotal() {
		double quarterValue = this.quarters * QUARTER_VALUE;
		double dimeValue = this.dimes * DIME_VALUE;
		double nickelValue = this.nickels * NICKEL_VALUE;
		double pennyValue = this.pennies * PENNY_VALUE;
		double total = quarterValue + dimeValue + nickelValue + pennyValue;
		return total;
	}

	public String toString() {
		return String.format("Quarters: %s%nDimes: %s%nNickels: %s%nPennies: %s%nTotal: %s%n", this.quarters, this.dimes, this.nickels, this.pennies, cashFormat());
	}

	public int getNumQuarters() {
		return this.quarters;
	}

	public int getNumDimes() {
		return this.dimes;
	}

	public int getNumNickels() {
		return this.nickels;
	}

	public int getNumPennies() {
		return this.pennies;
	}

	public String cashFormat() {
		DecimalFormat cash = new DecimalFormat();
		// I really need to look into setting these init values in constructor fields
		cash.setMaximumFractionDigits(2);
		cash.setMinimumFractionDigits(2);
		cash.setPositivePrefix("$");
		return cash.format(this.getTotal());
	}

	public void addQuarters(int quarters) {
		this.quarters += quarters;
	}

	public void addDimes(int dimes) {
		this.dimes += dimes;
	}

	public void addNickels(int nickels) {
		this.nickels += nickels;
	}

	public void addPennies(int pennies) {
		this.pennies += pennies;
	}

	public void addMoreCoins(Coins c) {
		this.quarters += c.getNumQuarters();
		this.dimes += c.getNumDimes();
		this.nickels += c.getNumNickels();
		this.pennies += c.getNumPennies();
	}
}
