package Baekjoon;
/*
문제: N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
입력: 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다.
	  둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다.
	  모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
출력: 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
*/
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
