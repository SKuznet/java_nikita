package HW7;

import java.lang.reflect.Array;
import java.util.Scanner;
//9.84
public class Dsymb {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите предложение:");
        String s = in.nextLine();


        char[] res = new char[s.length()];
        s.getChars(0, s.length(), res, 0);

        Array[] arr = new Array[2];
        for (int i = 0; i < res.length - 1; i++) {
            if (res[i] == res[i += 1]) {
                System.out.print(i - 1);
                System.out.println(i);
                break;
            }


        }
    }
}
        


