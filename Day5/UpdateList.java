package bootcamp_27.Day5;
import java.util.*;

public class UpdateList {
public static void main(String[] args){

Scanner sc=new Scanner (System.in);
int n=sc.nextInt();
LinkedList<Integer> list= new LinkedList<>();
for(int i=0;i<n;i++){
    list.add(sc.nextInt());
}
int index =sc.nextInt();
int val =sc.nextInt();

 list.set(index, val);

System.out.print("New list");
System.out.println();
for(int i=0;i<n;i++){
 System.out.print(list.get(i)+" ");



}


}
    



}
