package study;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class testDemo {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<Integer>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.remove(2);
        System.out.println(integers);

        Vector<String> strings = new Vector<String>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.remove(0);
        System.out.println(strings);

        LinkedList<Character> characters = new LinkedList<Character>();
        characters.add('1');
        characters.add('2');
        characters.add('3');
        characters.remove(1);
        System.out.println(characters);

        HashSet<Integer> hashSet = new HashSet<Integer>();
        hashSet.add(1);
        hashSet.add(5);
        hashSet.add(3);
        hashSet.add(2);
        System.out.println(hashSet);

        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(1);
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(2);
        System.out.println(treeSet);

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
        linkedHashSet.add(1);
        linkedHashSet.add(3);
        linkedHashSet.add(5);
        linkedHashSet.add(2);
        linkedHashSet.add(8);
        linkedHashSet.add(6);
        linkedHashSet.add(7);
        System.out.println(linkedHashSet);

        final HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                hashMap.put(1,"s1");
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                hashMap.remove(1);
                hashMap.put(2,"s2");
            }
        });
        thread1.start();
        System.out.println(Thread.currentThread().getName() + hashMap);
        thread2.start();
        System.out.println(Thread.currentThread().getName() + hashMap);

        ConcurrentHashMap<Integer, String> concurrentHashMap = new ConcurrentHashMap<Integer, String>();
    }
}