package HomeWork.HW4;
//9.43
import java.util.Scanner;

public class s1s2Word {
    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите слово: ");
            String word1 = in.nextLine();

            for (int i = 0; i < word1.length(); i += 2) {
                String res1 = String.valueOf(word1.charAt(i));
                System.out.print(res1);

            }
            System.out.println();

        }
    }
}
