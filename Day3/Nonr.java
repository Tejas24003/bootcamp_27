package bootcamp_27.Day3;
import java.util.*;

public class Nonr {
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    
    for(int i=0;i<str.length();i++){
        boolean f=false;
        for(int j=0;j<str.length();j++){
            if(i!=j && str.charAt(i)==str.charAt(j)){
                f=true;
                break;
            }
        }
        if(!f){
            System.out.print(str.charAt(i));
            break;
        }
    }
    


  }    
}
