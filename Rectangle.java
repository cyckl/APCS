public class Rectangle {
	private int h, w, x, y;

	public Rectangle(int dx, int dy, int width, int height) {
		x = dx;
		y = dy;
		w = width;
		h = height;
	}

	public Rectangle(Point corner, int width, int height) {
		x = (int)corner.getX();
		y = (int)corner.getY();
		w = width;
		h = height;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getWidth() {
		return w;
	}

	public int getHeight() {
		return h;
	}

	public String toString() {
		return String.format("[x: %d, y: %d, w: %d, h: %d]", x, y, w, h);
	}

	public double getArea() {
		double area = (double)w * h;
		return area;
	}

	public Point getCenter() {
		Point center = new Point(x + (double)w/2, y + (double)h/2);
		return center;
	}
}
