import java.time.LocalDateTime;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.ZoneId;
/**
 * @author FUJIOKA
 */
public class Person {
    private String name;
    private String birth;
    private LocalDateTime formatDate;

    public Person(String name, String birth) {
        this.name = name;
        this.birth = birth;

        LocalDateTime formatDate = LocalDateTime.ofInstant(changeFormat().toInstant(), ZoneId.systemDefault());
        this.formatDate = formatDate;
    }

    public String getName() {
        return name;
    }


    public Date changeFormat() {
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

    public int calcAge() {
        LocalDateTime now = LocalDateTime.now();
        int yearDiff = now.getYear() - formatDate.getYear();
        if (now.getMonthValue() < formatDate.getMonthValue()) {
            yearDiff--;
        } else if (now.getDayOfMonth() < formatDate.getDayOfMonth()) {
            yearDiff--;
        }
        return yearDiff;
    }

}
