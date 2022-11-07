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
		System.out.println("while���� ������ �� ����Ʈ�� ����ִ� ��: " + list);

		//list ����ִ� ���� + ���̱�
		ListIterator<String> listIterator = list.listIterator();
		while(listIterator.hasNext()) {
			listIterator.set(listIterator.next() + "+");
		}
		System.out.println("while���� ���� �� ������ ���: " + list);
		
		//list ����ִ� ���� �������� ǥ��
		System.out.print("���� ��� ���: ");
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
