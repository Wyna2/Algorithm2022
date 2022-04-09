package DoIt_01_2;

import java.util.Scanner;

//왼쪽 아래가 직각인 이등변 삼각형 출력
public class Training1_8_TriangleLB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형 출력");
		
		do { //이등변 삼각형 단수를 입력한다.
			System.out.print("몇 단 삼각형 입니까? ");
			n = sc.nextInt();
		} while (n<=0); //n이 0보다 같거나 작으면 do 반복함
		
		for(int i=0; i<=n; i++) {
			for(int j=1; j<i; j++)
				System.out.print('*');
			System.out.println();
		}
	}
}
