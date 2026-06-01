package bootcamp_27.Day3;
import java.util.*;
public class dupchar {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
       for(int i = 0; i < str.length(); i++) {
    int freq = 0;

    for(int j = 0; j < str.length(); j++) {
        if(str.charAt(i) == str.charAt(j)) {
            freq++;
        }
    }

    if(freq > 1) {
        System.out.print(str.charAt(i) + " ");
    }
}
    }
}
