public class Color {
	private int red;
	private int green;
	private int blue;

	public Color(int red, int green, int blue) {
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	public int getRed() {
		return red;
	}

	public int getGreen() {
		return green;
	}

	public int getBlue() {
		return blue;
	}

	public String getHtml() {
		String r = "0" + Integer.toHexString(red);
		String g = "0" + Integer.toHexString(green);
		String b = "0" + Integer.toHexString(blue);
		return "#" + r + g + b;
	}

	public String toString() {
		return String.format("[R:%d, G:%d, B:%d]", red, green, blue);
	}

	public Color getGrayColor() {
		int v = (red + green + blue) / 3;
		Color greyscale = new Color(v, v, v);
		return greyscale;
	}

	public void setToColor(int red, int green, int blue) {
		this.red = red;
		this.green = green;
		this.blue = blue;
	}
}
