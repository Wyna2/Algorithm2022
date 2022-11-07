package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class Lv0ArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> integer1 = new ArrayList<Integer>();						 	//타입 지정
		ArrayList<Integer> integer2 = new ArrayList<>();								//타입 생략 가능
		ArrayList<Integer> integer3 = new ArrayList<>(10);								//초기 용량(Capacity) 설정
		ArrayList<Integer> integer4 = new ArrayList<>(integer1);						//다른 Collection값으로 초기화
		ArrayList<Integer> integer5 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));	//Arrays.asList()
		
		/*
		ArrayList<String> colors = new ArrayList<>();
		//add() method
		colors.add("Black");
		colors.add("White");
		colors.add(0, "Green");
		colors.add("Red");
		System.out.println(colors);
		
		//set() method
		colors.set(0, "Blud");
		System.out.println(colors);
		*/
		
		/*
		ArrayList<String> colors = new ArrayList<>(Arrays.asList("Black", "White", "Green", "Red"));
		String removeColor = colors.remove(0);
		System.out.println("Remove color is " + removeColor);
		
		colors.remove("White");
		System.out.println(colors);
		
		colors.clear();
		System.out.println(colors);
		*/
		
		/*
		ArrayList<String> colors = new ArrayList<>(Arrays.asList("Black", "White", "Green", "Red"));
		//for-each loop
		for(String color: colors)
			System.out.print(color + " ");
		System.out.println();
		
		//for loop
		for(int i=0; i<colors.size(); i++)
			System.out.print(colors.get(i) + " ");
		System.out.println();
		
		//using iterator
		Iterator<String> iterator = colors.iterator();
		while(iterator.hasNext())
			System.out.print(iterator.next() + " ");
		System.out.println();
		
		//using ListIterator
		ListIterator<String> listIterator = colors.listIterator(colors.size());
		while(listIterator.hasPrevious())
			System.out.print(listIterator.previous() + " ");
		System.out.println();
		*/

		ArrayList<String> colors = new ArrayList<>(Arrays.asList("Black", "White", "Green", "Red"));
		boolean conatains = colors.contains("Black");
		System.out.println(conatains);
		
		int index = colors.indexOf("Blue");
		System.out.println(index);
		
		index = colors.indexOf("Red");
		System.out.println(index);
	}

}
