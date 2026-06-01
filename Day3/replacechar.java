package bootcamp_27.Day3;

import java.util.Scanner;

public class replacechar {
    
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();      
        String ostr = sc.nextLine();   
       

        String result = str.replace(ostr, "#");

        System.out.println(result);
    }
}
    
