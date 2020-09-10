package com.company;

public class Main {

    public static void main(String[] args) {
	    Array numbers = new Array(3);
		numbers.insert(1);
	    numbers.insert(2);
		numbers.insert(3);
		numbers.insert(4);
		System.out.println(numbers.indexOf(2));
	    numbers.print();
    }
}
