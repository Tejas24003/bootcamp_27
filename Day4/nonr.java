
package bootcamp_27.Day4;

import java.util.*;

public class nonr {

    public static char rep(String s) {

        for (int i = 0; i < s.length(); i++) {
            boolean flag = false;

            for (int j = 0; j < s.length(); j++) {

                if (i != j && s.charAt(i) == s.charAt(j)) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                return s.charAt(i);
            }
        }

        return '#';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(rep(str));
    }
}
