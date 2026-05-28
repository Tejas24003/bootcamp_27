import java.util.*;

public class revrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int a[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c / 2; j++) {
                int temp = a[i][j];
                a[i][j] = a[i][c - j - 1];
                a[i][c - j - 1] = temp;
            }
        }

        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
