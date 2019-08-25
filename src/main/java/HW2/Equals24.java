package HW2;

import java.util.Scanner;

public class Equals24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите слово:");
        String word = in.nextLine();
        if (word.length() < 4){
            System.out.println("Длина слова должна составлять не менее 5 символов.");
        }else
        System.out.println("Вы ввели слово " + word);


        System.out.println((word.charAt(2)) == word.charAt(4));
    }
}
