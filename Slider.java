public class Slider {
	private int setting;

	public Slider() {
		this.setting = 6;
	}

	public void setTo(int setting) {
		this.setting = setting;
	}

	public void turnUp(int amount) {
		this.setting += amount;
	}

	public void turnDown(int amount) {
		this.setting -= amount;
	}

	public int getLevel() {
		return this.setting;
	}

	public String toString() {
		String emptySlider = "|-----------|";
		return emptySlider.substring(0, getLevel()) + "0" + emptySlider.substring(getLevel() + 1);
	}
}
