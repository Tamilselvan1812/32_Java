package collectiondemo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
         
	public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(10);                       // add
        queue.offer(20);
        queue.offer(30);

        System.out.println(queue.poll());     // remove front → 10
        System.out.println(queue.peek());     // front element → 20
        System.out.println(queue.isEmpty());  // false
    }
}
