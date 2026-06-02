package bootcamp_27.Day5;
import java.util.*;
public class Remove {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
         int n=sc.nextInt();
         LinkedList list =new LinkedList<>();
         for(int i=0;i<n;i++){
            list.add(sc.nextInt());
         }
         int index=sc.nextInt();
         list.remove(index);
         System.out.println(list);







    }
}
