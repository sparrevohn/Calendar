package calendar;

public class Days extends Digits {
	
	public static Days days = new Days();
	
	private int day;
	
	public Days() {
		day = 1;
	}
	
	@Override
	public void Increase() {
		switch (Months.months.getDigit()) {
		case 2 : if (day == 28)
					day = 1;
				 else day++;
		case 4 : if (day == 30)
					day = 1;
				 else day++;
		case 6 : if (day == 30)
				    day = 1;
		 		 else day++;
		case 9 : if (day == 30)
					day = 1;
		 		 else day++;
		case 11 : if (day == 30)
					day = 1;
		 		 else day++;
		default : if (day == 31)
					day = 1;
				 else day++;
		}
		
	}
	
	@Override
	public void setDigit(int x) {
		day = x;
	} 
	
	@Override
	public int getDigit() {
		return day;
	}

	@Override
	public String digitToString() {
		if (day < 10)
			return "0" + day;
		else return "" + day; 
	}

	
}
