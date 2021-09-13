public class WeekdayCalculator {

	/**
	 * The weekday shall be shown depending on the input
	 * 
	 * @param day the day (0 < day <= 31)
	 * @param month the month (0 < month <= 12)
	 * @param yes shown in four digits (e.g. 2009)
	 */
	public void calcWeekday(int day, int month, int year) {
        //assign values to the parameters
        int d = day;
        int m = month;
        int yea = year;

        // if january or february the month are assigned to month 13/14 and the year need to be reduced by one year
        if(m <= 2){
            m += 12;
            year -= 1;
        }

        // the variable y shows the last two digits and c the first two digits
        int y = yea%100;
        int c = yea/100;

        // formula for calculation of the weekdays
        int w = (d+(26*(m+1))/10+(5*y)/4+c/4+5*c-1)%7;
        switch(w){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }
    }
}   
