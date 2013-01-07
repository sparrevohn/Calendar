import calendar.Days;
import calendar.Months;

public class Test {
	
	public static void main(String[] args) {
		Days local1 = Days.days;
		Months local2 = Months.months;
		System.out.println(local1.digitToString());
		local1.Increase();
		System.out.println(local1.digitToString());
		local2.Increase();
		System.out.println(local2.digitToString());
		System.out.println(local1.digitToString());
		local1.Increase();
		System.out.println(local1.digitToString());
		local1.Increase();
		System.out.println(local1.digitToString());
		local1.Increase();
		System.out.println(local1.digitToString());
		local1.Increase();
		System.out.println(local1.digitToString());
	}
}
