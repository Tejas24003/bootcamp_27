

package bootcamp_27.Day9;
import java.util.*;


public class Oddeven {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int size =sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int even=0;
        int odd=0;
        for(int i=0;i<size;i++){
            if(arr[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("even no.s in an array="+even);
        System.out.println("odd no.s in an array="+odd);
        sc.close();
    }
}
