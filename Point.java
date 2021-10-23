public class Point {
	private double x, y;

	public Point(double inputX, double inputY) {
		x = inputX;
		y = inputY;
	}

	public String toString() {
		// concat hurts me
		return "(" + x + ", " + y + ")";
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public Point getClosestIntPoint() {
		Point roundedPoint = new Point(Math.round(x), Math.round(y));
		return roundedPoint;
	}

	public Point midPoint(Point a, Point b) {
		Point mid = new Point(((b.getX() + a.getX()) / 2), ((b.getY() + a.getY()) / 2));
		return mid;
	}
}
