import java.util.Scanner;

/**
 * Created by hiroki on 2017/04/23.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("名前を入力してください：");
        String name = scan.next();
        System.out.print("誕生日を入力してください：");
        String birth = scan.next();

        Person person = new Person(name, birth);

        System.out.println(person.getName() + "の年齢は、" + person.calcAge() + "歳です。");
    }
}