import calendar.Days;


public class Test {
	
	public static void main(String[] args) {
		Days local = Days.days;
		local.Increase();
		System.out.println(local.digitToString());
	}

}
