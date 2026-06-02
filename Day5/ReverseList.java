package bootcamp_27.Day5;
import java.util.*;

public class ReverseList {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        LinkedList list =new LinkedList<>();
        for(int i=0;i<n;i++){
             list.add(sc.nextInt());
        }
        System.out.print(list +"\n");
        Collections.reverse(list);
        System.out.print("New list");
        System.out.print(list);



    }



}
