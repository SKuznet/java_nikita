package HW5;

import java.util.Scanner;
//9.62
public class A100 {
    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите слово: ");
            String word = in.nextLine();
            System.out.println("Введите символ:");
            String a = in.nextLine();
            int c = word.length() - word.replaceAll(a, "").length();
            int result = c * 100 / word.length();
            System.out.println(result + "%");
        }
    }
}
