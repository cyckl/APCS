public class Date {
	public int month;
	public int day;
	public int year;

	public Date(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public int getYear() {
		return year;
	}

	public String toString() {
		return String.format("%d/%d/%d", month, day, year);
	}

	public Date getTomorrow() {
		Date tomorrow = new Date(month, day++, year);
		return tomorrow;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setYear(int year) {
		this.year = year;
	}
}
