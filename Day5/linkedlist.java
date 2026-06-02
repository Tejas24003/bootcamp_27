package bootcamp_27.Day5;
 import java.util.*;
 class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

    
   



public class linkedlist {

    static ListNode insertEnd(ListNode head, int val) {
        ListNode node = new ListNode(val);

        if (head == null)
            return node;

        ListNode temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = node;
        return head;
    }

    static void display(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        ListNode head = null;

        System.out.println("Enter values:");

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            head = insertEnd(head, val);
        }

        System.out.print("Linked List: ");
        display(head);
    }
}
