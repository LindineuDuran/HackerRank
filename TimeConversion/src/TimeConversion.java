import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion
{
	/*
	 * Complete the timeConversion function below.
	 */
	static String timeConversion(String s)
	{
		s.toLowerCase();
		StringBuilder stringBuilder = new StringBuilder(s);
		stringBuilder.insert(s.length() - 2, ' ');
		
		DateFormat f1 = new SimpleDateFormat("hh:mm:ss a"); // 11:00 pm
		Date d = null;
		try
		{
			d = f1.parse(stringBuilder.toString());
		}
		catch (ParseException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DateFormat f2 = new SimpleDateFormat("HH:mm:ss");
		String x = f2.format(d); // "23:00"

		return x;
	}

	public static void main(String[] args)
	{
		String s = "07:05:45PM";
		String result = timeConversion(s);
		System.out.println(result);
	}
}
