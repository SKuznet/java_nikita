package HW3;
//9.21
import java.util.Arrays;
import java.util.Scanner;

public class SUM234 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите слово");
        String word = in.nextLine();
        if (word.length() < 4) {
            System.out.println("Длина слова должна составлять не менее 5 символов.");
        } else {
            System.out.println("Вы ввели слово " + word);


            System.out.println(Arrays.asList(word.charAt(2) + word.charAt(3) + word.charAt(4)));


        }
    }
}
