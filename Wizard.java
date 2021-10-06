public class Wizard {
	private int mana, xp;

	public Wizard() {
		this.mana = 100;
		this.xp = 1;
	}

	public String toString() {
		return String.format("Wizard:%nMana Level: %s%nExperience Level: %s%n", mana, xp);
	}

	public int getXP() {
		return xp;
	}

	public int getMana() {
		return mana;
	}

	public void castMagicMissile() {
		System.out.printf("I cast Magic Missile!!! KABOOM!!!! It does %s damage!!!%n", xp * 2);
		this.mana -= 5;
		this.xp += 1;
	}

	public void castLightningStorm(int targets) {
		System.out.printf("I cast Lightning Storm on %s targets!!! ZAPPPP!!! It does a total of %s damage%n", targets, targets * 5);
		this.mana -= targets * 2;
		this.xp += targets / 3;
	}
}
