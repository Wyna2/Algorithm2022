package DoIt_01_2;

import java.util.Scanner;

public class Practice14_square {

	public static void main(String[] args) {
		System.out.println("사각형을 출력합니다.");
		System.out.print("단수: ");
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println();
			for(int j=0;j<n;j++)
				System.out.print("*");
		}
	}
}
