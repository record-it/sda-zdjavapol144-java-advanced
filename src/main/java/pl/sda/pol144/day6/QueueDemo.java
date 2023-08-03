package pl.sda.pol144.day6;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.offer("Adam");
        q.offer("Ewa");
        q.offer("Karol");
        final String first = q.poll();
        System.out.println(first);
        System.out.println(q);

        Deque<String> d = new ArrayDeque();
        d.addFirst("Adam");
        d.addFirst("Ewa");
        d.addFirst("Karol");
        System.out.println(d);
        d.addAll(q);
        System.out.println(d);
        for(var name: d){
            System.out.println(name);
        }

        System.out.println("Przegląd kolejki od końca");
        for(var iterator = d.descendingIterator(); iterator.hasNext(); ){
            final String name = iterator.next();
            System.out.println(name);
        }

        d.removeFirstOccurrence("Ewa");
        System.out.println(d);
    }
}
