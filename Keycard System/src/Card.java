
public abstract class Card {
	
	String firstName;
	String lastName;
	int pinCode;
	long cardNr;
	boolean accessCode;
	static long card = 1;
	
	public Card() {
		firstName = "Lille";
		lastName = "Grille";
		pinCode = 2015;
		cardNr = card;
		card++;
		accessCode = false;
	}
	
	String getName() {
		return firstName + " " + lastName;
	}
	
	abstract boolean checkPIN(int pinCode);	
	
	boolean isBlocked() {
		return accessCode;
	}
	
	@Override
	public String toString() {
		return "Card [firstName= " + firstName + " " + lastName + ", PINcode= " + pinCode + ", cardnumber= " + cardNr
				+ ", accesscode= " + accessCode + "]";
	}

}
