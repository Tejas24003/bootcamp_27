import java.util.Scanner;

public class insert {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a[][] = new int[10][10];
        int row = 3, col = 3;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int r = sc.nextInt();
        int c = sc.nextInt();
        int val = sc.nextInt();

        
    }
}