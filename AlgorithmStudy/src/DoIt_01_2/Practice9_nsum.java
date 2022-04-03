package DoIt_01_2;

import java.util.Scanner;

public class Practice9_nsum {
	//정수 a,b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 메서드 작성
	static int sumof(int a,int b) {
		
		int suma=0;
		int sumb=0;
		int sum=0;
		if(a>b) {
			for(int i=1; i<=a; i++) suma+=i;
			for(int j=1; j<b; j++) sumb+=j;
			sum=suma-sumb;
		} else if (a<b) {
			for(int i=1; i<=b; i++) sumb+=i;
			for(int j=1; j<a; j++) suma+=j;
			sum=sumb-suma;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 값 입력");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int result=sumof(a, b);
		System.out.println("두 정수 사이의 합은 "+result+"입니다.");
	}

}
