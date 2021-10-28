package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        System.out.println(list.getKthNodeFromTheEnd(-1));

//		Map<Integer, String> map = new HashMap<>();
//		map.put(1, "Mosh");
//		map.put(2, "Harsh");
//		map.put(3, "Ajay");
//		map.remove(3);
//		var value = map.get(2);
//		System.out.println(value);
//		map.containsKey(1); // O(1)
//		map.containsValue("Mosh"); // O(n)
//		System.out.println(map);
    }
}
