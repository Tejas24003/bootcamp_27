package bootcamp_27.Day7;

import java.util.*;

public class Classshedule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<>();

        while (true) {
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    String section = sc.nextLine();
                    stack.push(section);
                    System.out.println("Adding Section: " + section);
                    break;

                case 2:
                    if (stack.isEmpty())
                        System.out.println("Stack is empty. Cannot pop.");
                    else
                        System.out.println("Removing Section: " + stack.pop());
                    break;

                case 3:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty");
                    } else {
                        System.out.print("Enrolled Sections: ");
                        for (int i = stack.size() - 1; i >= 0; i--)
                            System.out.print(stack.get(i) + " ");
                        System.out.println();
                    }
                    break;

                case 4:
                    System.out.println("Exiting program");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}