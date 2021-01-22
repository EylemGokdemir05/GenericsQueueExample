package org.kodluyoruz;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        BlockingQueue<Integer> myQueue=new BlockingQueue<>();
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);

        System.out.println(myQueue.peek());

        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
    }
}
