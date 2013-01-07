package calendar;

public class Months extends Digits {
	
	public static Months months = new Months();
	
	private int month;
	
	public Months() {
		month = 1;
	}
	
	@Override
	public void Increase() {
		if (month == 12)
			month = 1;
		else month++;
	}

	@Override
	public int getDigit() {
		return month;
	}

	@Override
	public String digitToString() {
		if (month < 10)
		return "0" + month;
		else return "" + month;
	}

}
