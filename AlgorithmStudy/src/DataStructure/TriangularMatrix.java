package DataStructure;

import java.util.Scanner;

public class TriangularMatrix {

	/*
	 �Ʒ��� �׸��� ���� �ﰢ ���(triangular matrix)�� ���,
	 ��� ������ �����ϱ� ���Ͽ� A[100][100]�� ������ ����� 0�� �ƴ� �����͸�
	 ������ �迭 B[5050]�� �����ϰ��� �Ѵ�. A[0][0]�� B[0]�� �����ϰ�,
	 0�� �ƴ� A�� �����͵��� �� �켱 ������ B�� ������ ��,
	 A[41][17]�� B�� ��� ��ġ�� ����Ǵ°�?
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
	
	//�� �켱 ������ ����Ǳ� ������ ������ 1,2,... ���ʴ�� ���� ä����
	//index 0���� �����ϹǷ� 1~41������ �� 861+17=878
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
