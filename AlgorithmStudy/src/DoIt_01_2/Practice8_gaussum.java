package DoIt_01_2;

import java.util.Scanner;

public class Practice8_gaussum {
	//가우스의 덧셈을 이용해 1부터 n까지의 정수 합을 구하는 프로그램 작성
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력한 값: ");
		
		int n=sc.nextInt();
		int sum=0;
		
		if(n%2==0)
			sum=(1+n)*(n/2);
		else
			sum=(1+n)*(n/2)+(n/2+1);
		
		System.out.println("1부터 n까지의 합은 "+sum+"입니다.");

	}

}
