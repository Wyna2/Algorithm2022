package programmers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class Lv0Iterator {
	public static void main(String[] args) {
		//Make a collection
		//Set<String> cars = new HashSet<>();
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		System.out.println("while문을 지나기 전 리스트에 들어있는 값: " + list);

		//list 들어있는 값에 + 붙이기
		ListIterator<String> listIterator = list.listIterator();
		while(listIterator.hasNext()) {
			listIterator.set(listIterator.next() + "+");
		}
		System.out.println("while문을 지난 후 수정된 결과: " + list);
		
		//list 들어있는 값을 역순으로 표시
		System.out.print("역순 출력 결과: ");
		while(listIterator.hasPrevious()) {
			System.out.print(listIterator.previous() + " ");
		}
		System.out.println();
		
		
		
		//Get the Iterator
		//Iterator<String> it = cars.iterator();
		
		//Print the first item
		//System.out.println(it.next());
		
		//while
		/*
		 * while(it.hasNext()) { System.out.println(it.next()); }
		 */
		
		
		//while(it.hasNext()) { System.out.println("cars: " + it.next()); }
		 
		
		//for-each
		/*
		 * for(String str : cars) { System.out.println(str); }
		 */
		/*
		 * for(String car : cars) { System.out.println("cars: " + car); }
		 */
	}
}
