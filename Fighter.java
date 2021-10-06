public class Fighter {
	private String name;
	private int health;
	private String moveName;
	private double powMultiplier;

	public static final int DEFAULT_HEALTH = 100;
	public static final int DEFAULT_DAMAGE = 12;

	public Fighter(String name) {
		this.name = name;
		this.health = DEFAULT_HEALTH;
		this.moveName = "NO SUPER";
		this.powMultiplier = 1.0;
	}

	public int getHealth() {
		return this.health;
	}

	public String getName() {
		return this.name;
	}

	public void takeDamage(int damage) {
		this.health -= damage;
	}

	public String getSuperMove() {
		return this.moveName;
	}

	public int getSuperMoveDamage() {
		return (int)((double)DEFAULT_DAMAGE * this.powMultiplier);
	}

	public void setSuperMove(String type, double multiplier) {
		this.powMultiplier = multiplier;
		this.moveName = type;
	}
}
