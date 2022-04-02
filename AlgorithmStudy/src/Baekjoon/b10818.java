package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class b10818 {
	
	//public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//입력받을 숫자 개수
		int num = sc.nextInt();
		
		//입력받을 숫자
		int[] arr = new int[num];
					
		//숫자 입력받기
		for(int i=0; i<num; i++) {			
			arr[i] = sc.nextInt();
		}
			
			
//			System.out.print("이동 전: ");
//			for(int i=0; i<num; i++)
//				System.out.print(arr[i]+" ");

			//오름차순 만들기
			Arrays.sort(arr);
			
//			System.out.println();
//			System.out.print("오름차순: ");
//			for(int i=0; i<num; i++)
//				System.out.print(arr[i]+" ");	
//			System.out.println();
			
			System.out.print(arr[0] + " " + arr[num-1]);

	}
}
