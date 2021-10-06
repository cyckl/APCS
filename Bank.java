public class BankAccount {
	private double balance;
	private String accountName;

	private static final double PENALTY_VALUE = 20;

	public BankAccount(String name, double bal) {
		accountName = name;
		balance = bal;
	}

	public double getBalance() {
		return balance;
	}

	public String getAccountName() {
		return accountName;
	}

	public String toString() {
		return "Account Name: "+accountName+"\nBalance: $"+balance+"\n";
	}

	public void setAccountName(String name) {
		accountName = name;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void deductPenalty() {
		balance -= PENALTY_VALUE;
	}

	public void withdraw(double amount) {
		balance -= amount;
	}

	public void addInterest() {
		balance *= 1.008;
	}
}
