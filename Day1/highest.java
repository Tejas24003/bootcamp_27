import java.util.Scanner;

class highest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int a[][] = new int[r][c];

        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int row = 0;
        int max = 0;

        for(int i=0;i<r;i++) {

            int sum = 0;

            for(int j=0;j<c;j++) {
                sum = sum + a[i][j];
            }

            if(sum > max) {
                max = sum;
                row = i;
            }
        }

        for(int i=0;i<r;i++) {

            if(i != row) {

                for(int j=0;j<c;j++) {
                    System.out.print(a[i][j] + " ");
                }

                System.out.println();
            }
        }
    }
}