package bootcamp_27.Day3;
 import java.util.*;
public class longestpalindrome {
    
   



    static String expand(String s, int left, int right) {

        while(left >= 0 && right < s.length() &&
              s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return s.substring(left + 1, right);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String ans = "";

        for(int i = 0; i < str.length(); i++) {

            String odd = expand(str, i, i);
            String even = expand(str, i, i + 1);

            if(odd.length() > ans.length()) {
                ans = odd;
            }

            if(even.length() > ans.length()) {
                ans = even;
            }
        }

        System.out.println(ans);
    }
}

