/**
 * 
 */
package math.examples;

/**
 * 
 */
public class MonthToString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int month = 2;

		String monthString = convertNumericMonthToString(month);
		
		System.out.println(monthString);

	}

	/**
	 * @param month
	 */
	public static String convertNumericMonthToString (int month) throws NumberFormatException {
		String monthString = "";

		switch (month) {
		case 1:
			monthString = "Jan";
			break;
		case 2:
			monthString = "Feb";
			break;
		case 3:
			monthString = "Mar";
			break;
		case 4:
			monthString = "Apr";
			break;
		case 5:
			monthString = "May";
			break;
		case 6:
			monthString = "Jun";
			break;
		case 7:
			monthString = "Jul";
			break;
		case 8:
			monthString = "Aug";
			break;
		case 9:
			monthString = "Sept";
			break;
		case 10:
			monthString = "Oct";
			break;
		case 11:
			monthString = "Nov";
			break;
		case 12:
			monthString = "Dec";
			break;
		default:
			throw new NumberFormatException("Invalid input");
		}
		return monthString;
	}

}
