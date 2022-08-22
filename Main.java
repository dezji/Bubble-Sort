// Name: Deziallia Morris
// Date: April 2, 2022

package com.dezji;

import java.util.ArrayList;
import java.util.List;
import static java.lang.System.out;


public class Main {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			numbers.add((int) (Math.random() * 20) + 1);
		}
		
		out.println("Numbers before sorting: " + numbers);
		bubbleSort(numbers);
		out.println("Numbers after sorting: " + numbers);
		
		
		List<String> names = new ArrayList<>();
		names.add("Rue");
		names.add("Gia");
		names.add("Cassie");
		names.add("Maddy");
		names.add("Nate");
		names.add("Cal");
		names.add("Leslie");
		names.add("Kat");
		names.add("Fezco");
		names.add("Ashtray");
		
		out.println("\nNames before sorting: " + names);
		bubbleSort(names);
		out.println("Names after sorting: " + names);
		
	}
	
	public static <E extends Comparable<E>> void bubbleSort(List<E> list) {
		
		boolean swapOccurred = true;
		
		while (swapOccurred != false) {
			swapOccurred = false;
			
			for (int counter1 = 0; counter1 < list.size() - 1; counter1++) {
				
				if (list.get(counter1).compareTo(list.get(counter1 + 1)) > 0) {
					E temp = list.get(counter1);
					
					swapOccurred = true;
					list.set(counter1, list.get(counter1 + 1));
					list.set(counter1 + 1, temp);
				}
			}
		}
	}
}
