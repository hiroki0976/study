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

        Person person = new Person(birth);

        System.out.println(name + "の年齢は、" + Person.CalcAge() + "歳です。");
    }
}