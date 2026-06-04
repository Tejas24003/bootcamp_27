package bootcamp_27.Day7;

import java.util.*;

public class Helpdesk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue<Integer> queue = new LinkedList<>();

        while (true) {
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    int ticket = sc.nextInt();
                    queue.offer(ticket);
                    System.out.println("Ticket Added: " + ticket);
                    break;

                case 2:
                    if (queue.isEmpty())
                        System.out.println("Queue is empty");
                    else
                        System.out.println("Processed Ticket: " + queue.poll());
                    break;

                case 3:
                    if (queue.isEmpty())
                        System.out.println("Queue is empty");
                    else
                        System.out.println(queue);
                    break;

                case 4:
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}