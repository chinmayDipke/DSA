package Practice;

import java.util.LinkedList;

public class LinkedListPractice {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(5);
        list.add(10);
        list.add(2, 15);
        list.addLast(20);
        System.out.println(list);

        System.out.println("2nd index="+list.get(2));
        System.out.println("0th index="+list.getFirst());
        System.out.println("last index="+list.getLast());

        System.out.println(list);
        Integer v = list.remove(2);
        System.out.println(v);
        System.out.println(list);
        list.add(2,15);
        System.out.println(list);

        System.out.println("Does list have 99: "+list.contains(99));
        System.out.println("Size of list : "+list.size());
        System.out.println("clear the list ");
        list.clear();
        System.out.println("is list empty: "+list.isEmpty());
    }
}
