package bootcamp_27.Day3;
import java.util.*;

public class rvowels {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String m=s.replaceAll("[aeiouAEIOU]", "");
        System.out.print(m);

    }
    
}
