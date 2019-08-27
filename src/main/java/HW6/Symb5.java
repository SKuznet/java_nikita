package HW6;
//9.74
import java.util.Scanner;

public class Symb5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String word = in.nextLine();
        System.out.println("Введите символ: ");
        String symb = in.nextLine();
//        String symb = Strings.repeat(s,5);
        System.out.println(word.indexOf(symb));
    }
}
