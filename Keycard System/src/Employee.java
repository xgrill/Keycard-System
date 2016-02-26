import java.util.Calendar;
import java.util.GregorianCalendar;

public class Employee extends Card {
	
	@Override
	boolean checkPIN(int pinCode) {
		int day, month, year;
		int second, minute, hour;
		
		GregorianCalendar date = new GregorianCalendar();
		day = date.get(Calendar.DAY_OF_MONTH);
		second = date.get(Calendar.SECOND);
		minute = date.get(Calendar.MINUTE);
		hour = date.get(Calendar.HOUR);
		
		if(pinCode!= 9999 && !isBlocked() && hour>=7 && hour<=17) {
			return true;
		}
		return false;
	}

}
