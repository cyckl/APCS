public class StringFocuser {
	private String txt;
	private int index;

	public StringFocuser(String input, int index) {
		this.txt = input;
		this.index = index;
	}

	// Accessors
	public String toString() {
		return String.format("[%s,%s]", txt, index);
	}

	public int getFocusIndex() {
		return index;
	}

	public String focusLetter() {
		return txt.substring(index, index + 1);
	}

	public String beforeFocus() {
		return txt.substring(0, index);
	}

	// Modifiers
	public void reset() {
		this.txt = txt.toLowerCase();
	}

	public void setFocus(int index) {
		this.index = index;
	}

	public void capFocus() {
		this.txt = txt.substring(0, index) + txt.substring(index, index + 1).toUpperCase() + txt.substring(index + 1);
	}

	public void capBeforeFocus() {
		this.txt = txt.substring(0, index).toUpperCase() + txt.substring(index);
	}
}