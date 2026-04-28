package Sub11.map;

import java.util.ArrayDeque;
import java.util.Deque;

public class deque {
    static void main() {

        Deque<Integer> deque = new ArrayDeque<>();
        deque.push(1);
        deque.push(2);
        deque.push(3);
        System.out.println(deque);
        deque.add(1);
        deque.add(2);
        deque.add(3);
        System.out.println(deque);
        System.out.println(deque.peek());
        System.out.println(deque.pop());
        System.out.println(deque.pop());
        System.out.println(deque.pop());
        System.out.println(deque);
        System.out.println();

        Deque<Integer> dequeQueue = new ArrayDeque<>();
        dequeQueue.offer(1);
        dequeQueue.offer(2);
        dequeQueue.offer(3);
        dequeQueue.offer(4);
        System.out.println(dequeQueue);
        System.out.println(dequeQueue.peek());
        System.out.println(dequeQueue.poll());
        System.out.println(dequeQueue.poll());
        System.out.println(dequeQueue.poll());
        System.out.println(dequeQueue);



    }
}
