package Sub11.map;

import java.util.ArrayDeque;

public class Queue {
    static void main() {
        java.util.Queue<String> queue = new ArrayDeque<>();
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        System.out.println(queue);
        System.out.println("다음 꺼낼 요소 확인 : "+queue.peek());
        System.out.println("queue.poll() : "+queue.poll());
        System.out.println("==============");
        System.out.println(queue);
        System.out.println("다음 꺼낼 요소 확인 : "+queue.peek());
        System.out.println("queue.poll() : "+queue.poll());
        System.out.println("==============");
        System.out.println(queue);
        System.out.println("다음 꺼낼 요소 확인 : "+queue.peek());
        System.out.println("queue.poll() : "+queue.poll());
        System.out.println("==============");


    }
}
