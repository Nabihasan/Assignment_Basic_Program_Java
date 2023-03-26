import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ReverseElementInQueue{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of element.");
        int n = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        System.out.println("enter the number...");
        // add elements to the queue
        for (int i = 0; i < n; i++) {
            queue.add(sc.nextInt());
        }
        System.out.println("enter the number to reverse....");
        int k = sc.nextInt();
        reverseKElements(queue, k);

        // print the updated queue
        while (!queue.isEmpty()) {
            System.out.print(queue.remove() + " ");
        }
    }

    public static void reverseKElements(Queue<Integer> queue, int k) {
        if (queue.isEmpty() || k < 0 || k > queue.size()) {
            return;
        }

        // create a stack to store the first k elements
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < k; i++) {
            stack.push(queue.remove());
        }

        // add the reversed elements back to the queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        // add the remaining elements to the queue
        for (int i = 0; i < queue.size() - k; i++) {
            queue.add(queue.remove());
        }
    }
}

