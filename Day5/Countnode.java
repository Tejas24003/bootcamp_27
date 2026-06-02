package bootcamp_27.Day5;
import java.util.*;
public class Countnode {
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     LinkedList<Integer> list= new LinkedList<>();
      while(true){
        int x = sc.nextInt();
        if(x==-1)
            break;
        list.add(x);
      }
      System.out.print(list.size());




    }
}
