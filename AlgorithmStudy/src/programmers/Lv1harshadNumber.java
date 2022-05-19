package programmers;

import java.util.Scanner;

public class Lv1harshadNumber {

	/* 1차풀이..범위가 정해진 수라 수의 범위를 구해 풀어보려 했으나 런타임 오류 발생
	public static boolean Lv1harshadNumber(int x) {
		boolean answer = true;
		int a,b,c,d;
		int s=0;
		if(10<=x&&x<100) {
			a=x/10;
			b=x%10;
			s=(a+b);
		} else if(100<=x&&x<1000) {
			a=x/100;
			b=(x%100)/10;
			c=(x%100)%10;
			s=(a+b+c);
		} else if(1000<=x&&x<10000) {
			a=x/1000;
			b=(x%1000)/100;
			c=(x%1000)%100/10;
			d=(x%1000)%100%10;
			s=(a+b+c+d);
		}
		if(x%s!=0) answer=false;
		return answer;
	}
	*/
	
	//2번째 풀이
	public static boolean Lv1harshadNumber(int x) {
		int su=x;
		int sum=0;
		int[] arr = new int[5];
		for(int i=4; i>=0; i--) {
			arr[i]=su%10;
			su=su/10;
			sum+=arr[i];
		}
		return (x%sum==0?true:false);
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력: ");
		int x = sc.nextInt();
		
		System.out.println(Lv1harshadNumber(x));
	}

}
