package bootcamp_27.Day7;
import java.util.*;
public class Revstring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] words = str.split(" ");

        for (String word : words) {
            Stack<Character> stack = new Stack<>();

            for (char ch : word.toCharArray())
                stack.push(ch);

            while (!stack.isEmpty())
                System.out.print(stack.pop());

            System.out.print(" ");
        }
    }
}    

