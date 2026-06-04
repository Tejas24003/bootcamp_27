package bootcamp_27.Day7;

import java.util.*;

public class Addqueue{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();

        int sum = 0;

        for (int i = 0; i < n; i++) {
            int ticket = sc.nextInt();
            queue.offer(ticket);
            sum += ticket;
        }

        System.out.println(sum);
    }
}