import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author FUJIOKA
 */
public class Person {
    private static String birth;

    public Person(String birth) {
        this.birth = birth;
    }

    public static Date ChangeFormat() {
        SimpleDateFormat birthday = new SimpleDateFormat("yyyy/MM/dd");

        Date formatDate = null;
        try {
            formatDate = birthday.parse(birth);
            return formatDate;
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("正しい書式で入力してください。");
        }

        return formatDate;
    }


    public static int CalcAge() {
        Date now = new Date();
        Calendar birthDayCal = Calendar.getInstance();
        birthDayCal.setTime(ChangeFormat());
        Calendar theDayCal = Calendar.getInstance();
        theDayCal.setTime(now);
        int yearDiff = theDayCal.get(Calendar.YEAR) - birthDayCal.get(Calendar.YEAR);
        if (theDayCal.get(Calendar.MONTH) < birthDayCal.get(Calendar.MONTH)) {
            yearDiff--;
        } else if (theDayCal.get(Calendar.DAY_OF_MONTH) < birthDayCal.get(Calendar.DAY_OF_MONTH)) {
            yearDiff--;
        }

        return yearDiff;
    }


}
