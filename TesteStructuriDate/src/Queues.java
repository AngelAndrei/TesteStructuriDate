import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        //structura de date FIFO
        //head tail
        //euqueue offer adauga
        //dequeue poll sterge
        //peek

        Queue<String> queue = new LinkedList<>();
        queue.offer("Karen");
        queue.offer("CHad");
        queue.offer("steve");
        //System.out.println(queue);
        //System.out.println(queue.peek());
        // System.out.println(queue.isEmpty());
        //System.out.println(queue.size());
        queue.poll();
        System.out.println(queue);
        System.out.println(queue.contains("steve"));
    }


}
