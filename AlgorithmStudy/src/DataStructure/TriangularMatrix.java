package DataStructure;

import java.util.Scanner;

public class TriangularMatrix {

	/*
	 아래의 그림과 같은 삼각 행렬(triangular matrix)의 경우,
	 기억 공간을 절약하기 위하여 A[100][100]의 이차원 행렬을 0이 아닌 데이터만
	 일차원 배열 B[5050]에 저장하고자 한다. A[0][0]은 B[0]에 저장하고,
	 0이 아닌 A의 데이터들을 행 우선 순서로 B에 저장할 때,
	 A[41][17]은 B의 어느 위치에 저장되는가?
	 x
	 xx
	 x x
	 x  x
	 x   x
	 x    x     0
	 x     x
	 x non  x
	 x  0    x
	 x        x
	 x         x
	 xxxxxxxxxxxx
	 */
	
	//행 우선 순서로 저장되기 때문에 가로줄 1,2,... 차례대로 값이 채워짐
	//index 0부터 시작하므로 1~41까지의 합 861+17=878
	public static int TriangularMatrix(int n) {
		int sum=0;
		for(int i=n; i>=1; i--)
			sum+=i;
		return sum;
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(TriangularMatrix(n));		
	}

	

}
