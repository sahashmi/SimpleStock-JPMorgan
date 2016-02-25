import java.util.Date;
import java.util.Calendar;

/**
 * DateUtil class
 * 
 * @author (Adeel Hashmi) 
 * @version (1.0)
 */
public class DateUtil
{    
    public static Date minusXMinutesToDate(int minutes) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.MINUTE, -minutes);
        return calendar.getTime();
    }
    
    public static boolean isDateInXMinutesRange(Date date, int minutes) {
        Calendar previous = Calendar.getInstance();
        previous.setTime(date);
        Calendar now = Calendar.getInstance();
        now.setTime(new Date());
        long diff = now.getTimeInMillis() - previous.getTimeInMillis();
        return diff < (minutes * 60 * 1000);
    }
}
