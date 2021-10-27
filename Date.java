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

	public boolean equals(Date other) {
		return (this.getMonth() == other.getMonth()) && (this.getDay() == other.getDay()) && (this.getYear() == other.getYear());
	}

	public boolean isALeapYear() {
		return (this.getYear() % 400 == 0) || !(this.getYear() % 100 == 0) && (this.getYear() % 4 == 0);
	}

	public int numDaysInMonth() {
		int days;
		switch (this.getMonth()) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				days = 31;
				break;
			case 4: case 6: case 9: case 11:
				days = 30;
				break;
			case 2:
				if (this.isALeapYear())
					days = 29;
				else
					days = 28;
				break;
			default:
				days = 0;
				break;
		}
		return days;
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

	public void incrementDay() {
		this.day++;

		if (this.day > numDaysInMonth()) {
			this.month++;
			this.day = 1;
		}

		if (this.month > 12) {
			this.month = 1;
			this.day = 1;
			this.year++;
		}
	}
}
