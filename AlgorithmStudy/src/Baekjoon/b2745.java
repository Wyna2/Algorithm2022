package Baekjoon;
/*
문제: B진법 수 N이 주어진다. 이 수를 10진법으로 바꿔 출력하는 프로그램을 작성한다.
	 10진법을 넘어가는 진법은 숫자로 표시할 수 없어 이같은 경우 알파벳 대문자를 사용한다.
입력: 첫째 줄에 N과 B가 주어진다.(2<=B<=36)
	 B진법 수 N을 10진법으로 바꾸면, 항상 10억보다 작거나 같다.
출력: 첫째 줄에 B진법 수 N을 10진법으로 출력한다.
*/
import java.util.Scanner;

public class b2745 {
	
	//public class Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int b;		//진법
		String n;	//b진법 수 n
		int dno;	//변환 후의 자릿수
		
		
		String s = sc.next();
		int N = sc.nextInt();
		int tmp = 1;
		int ans = 0;
		
		for (int i = s.length()-1; i >= 0; i--) {
			char c = s.charAt(i);
			
			if('A'<= c && c <= 'Z') {
				ans += (c-'A'+10)*tmp;
			}else {
				ans += (c-'0')*tmp;
			}
			tmp *= N;
		}
		
		System.out.println(ans);
	}
}
				
		
		/*char[] cno = new char[32]; //변환 후 각 자리의 숫자를 넣어두는 문자 배열
		
		System.out.println("n 입력");
		n=sc.nextLine();
		System.out.println("b 입력");
		b=sc.nextInt();
		
		if(b>=2 || b<=36) {
			dno = cardConvR(b, n, cno);
			
			for(int i=dno-1; i>=0; i--) //윗자리부터 차례로 나타냄
				System.out.print(cno[i]);
			}
		}*/
