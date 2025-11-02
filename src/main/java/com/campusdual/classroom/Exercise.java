package com.campusdual.classroom;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise {
    public static Queue<String> createQueue() {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Smith");
        queue.offer("Montessori");
        queue.offer("Peralta");
        queue.offer("House");

        return queue;

    }
    public static void printAndEmptyQueue(Queue<String> queue) {
        System.out.println("Elemento en la cima de la cola: " + queue.peek());


        while (!queue.isEmpty()) {
            String element = queue.poll();
            System.out.println("Eliminando elemento: " + element);
        }

        System.out.println("La cola está vacía.");
    }

    public static void main(String[] args) {
        Queue<String> myQueue = createQueue();
        printAndEmptyQueue(myQueue);
    }

}
