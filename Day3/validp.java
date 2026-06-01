package bootcamp_27.Day3;
 import java.util.*;
public class validp {
   


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Stack<Character> st = new Stack<>();

        for(char ch : str.toCharArray()) {

            if(ch=='(' || ch=='{' || ch=='[')
                st.push(ch);

            else {
                if(st.isEmpty()) {
                    System.out.println(false);
                    return;
                }

                char top = st.pop();

                if((ch==')' && top!='(') ||
                   (ch=='}' && top!='{') ||
                   (ch==']' && top!='[')) {
                    System.out.println(false);
                    return;
                }
            }
        }

        System.out.println(st.isEmpty());
    }
}

