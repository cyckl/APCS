public class Name {
	private String first,last;

	public Name(String first, String last) {
		this.first = first;
		this.last = last;
	}

	public String getFirst() {
		return first;
	}

	public String getLast() {
		return last;
	}

	public String getInitials() {
		String firstInit = first.substring(0,1);
		String lastInit = last.substring(0,1);
		return firstInit+"."+lastInit+".";
	}

	public String toString() {
		return first + " " + last;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public void setLast(String l) {
		this.last = last;
	}
}
