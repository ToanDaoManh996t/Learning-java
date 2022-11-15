package org.o7planning.tutorial.javacollection.helloworld;

import java.util.LinkedList;

public class HelloLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("F");
        list.add("B");
        list.add("D");
        list.add("E");
        list.add("C");
        list.addLast("Z");
        list.addFirst("A");
        list.add(1, "A2");
        System.out.println(list);
        list.remove("F");
        list.remove(2);
        System.out.println(list);
        list.removeLast();
        list.removeFirst();
        System.out.println(list);
        Object val = list.get(2);
        list.set(2, val + " Changed");
        System.out.println(list);
    }
}
