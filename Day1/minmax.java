import java.util.*;
public class minmax {
    int min(int arr[],int n){
        int min = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    int max(int arr[],int n){
        int max = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        minmax obj = new minmax();
        int min = obj.min(arr, n);
        int max = obj.max(arr, n);
        System.out.println("Min ele "+min);
        System.out.println("Max ele "+max);
    }
}
