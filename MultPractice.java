public class MultPractice {
	private int multiplicand;
	private int multiplier;

	public MultPractice(int multiplicand, int multiplier) {
		this.multiplicand = multiplicand;
		this.multiplier = multiplier;
	}

	public String getProblem() {
		return String.format("%s TIMES %s", multiplicand, multiplier);
	}

	public void nextProblem() {
		this.multiplier++;
	}
}
