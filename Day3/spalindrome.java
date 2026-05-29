package bootcamp_27.Day3;
import java.util.*;
public class spalindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int left=0;
        int right=str.length()-1;
        int flag=1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                flag=0;
                break;
            }
            left++;
            right--;

        }
        if(flag==1){
            System.out.print("palindrome");
        }
        else{
            System.out.print("Not Palindrome");
        }


    }
    
}
