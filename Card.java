public class Card {
	private String value;
	private String suit;

	public Card(String value, String suit) {
		this.value = value;
		this.suit = suit;
	}

	public String getValue() {
		String valueName;

		switch(value) {
			case "2":
				valueName = "Two";
				break;
			case "3":
				valueName = "Three";
				break;
			case "4":
				valueName = "Four";
				break;
			case "5":
				valueName = "Five";
				break;
			case "6":
				valueName = "Six";
				break;
			case "7":
				valueName = "Seven";
				break;
			case "8":
				valueName = "Eight";
				break;
			case "9":
				valueName = "Nine";
				break;
			case "T":
				valueName = "Ten";
				break;
			case "J":
				valueName = "Jack";
				break;
			case "Q":
				valueName = "Queen";
				break;
			case "K":
				valueName = "King";
				break;
			case "A":
				valueName = "Ace";
				break;
			default:
				valueName = "Undefined";
				break;
		}

		return valueName;
	}

	public String getSuit() {
		String suitName;

		switch(suit) {
			case "C":
				suitName = "Clubs";
				break;
			case "D":
				suitName = "Diamonds";
				break;
			case "H":
				suitName = "Hearts";
				break;
			case "S":
				suitName = "Spades";
				break;
			default:
				suitName = "Undefined";
				break;
		}

		return suitName;
	}

	public String toString() {
		return String.format("%s of %s", getValue(), getSuit());
	}

	public int getRank() {
		int rank;

		switch(value) {
			case "2": case "3": case "4": case "5": case "6": case "7": case "8": case "9":
				rank = Integer.parseInt(value);
				break;
			case "T":
				rank = 10;
				break;
			case "J":
				rank = 11;
				break;
			case "Q":
				rank = 12;
				break;
			case "K":
				rank = 13;
				break;
			case "A":
				rank = 14;
				break;
			default:
				rank = 0;
				break;
		}

		return rank;
	}

	public String getColor() {
		String color;

		switch(suit) {
			case "S": case "C":
				color = "black";
				break;
			case "H": case "D":
				color = "red";
				break;
			default:
				color = "undefined";
				break;
		}

		return color;
	}

	public boolean isAFaceCard() {
		boolean face = false;

		switch(value) {
			case "J": case "Q": case "K":
				face = true;
				break;
			default:
				break;
		}

		return face;
	}

	public boolean isSameSuit(Card other) {
		return this.getSuit().equals(other.getSuit());
	}

	public boolean isSameColor(Card other) {
		return this.getColor().equals(other.getColor());
	}

	public boolean equals(Card other) {
		return this.getSuit().equals(other.getSuit()) && this.getValue().equals(other.getValue());
	}
}