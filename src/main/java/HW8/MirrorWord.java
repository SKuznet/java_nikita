package HW8;

import java.util.Scanner;
//9.78
public class MirrorWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String word = in.nextLine();
        char [] w = word.toCharArray();
        System.out.println(w);
        boolean e;
        for (int i = 0, j = w.length-1; i<w.length/2; i++, j-- ){
            if (w[i] == w[j]) {
                System.out.print(j);
                System.out.println("Перевертыш");
            }else System.out.println("Не перевертыш");
        }

    }
}
