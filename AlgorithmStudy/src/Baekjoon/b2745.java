package Baekjoon;
/*
����: B���� �� N�� �־�����. �� ���� 10�������� �ٲ� ����ϴ� ���α׷��� �ۼ��Ѵ�.
	 10������ �Ѿ�� ������ ���ڷ� ǥ���� �� ���� �̰��� ��� ���ĺ� �빮�ڸ� ����Ѵ�.
�Է�: ù° �ٿ� N�� B�� �־�����.(2<=B<=36)
	 B���� �� N�� 10�������� �ٲٸ�, �׻� 10�ﺸ�� �۰ų� ����.
���: ù° �ٿ� B���� �� N�� 10�������� ����Ѵ�.
*/
import java.util.Scanner;

public class b2745 {
	
	//public class Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int b;		//����
		String n;	//b���� �� n
		int dno;	//��ȯ ���� �ڸ���
		
		
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
				
		
		/*char[] cno = new char[32]; //��ȯ �� �� �ڸ��� ���ڸ� �־�δ� ���� �迭
		
		System.out.println("n �Է�");
		n=sc.nextLine();
		System.out.println("b �Է�");
		b=sc.nextInt();
		
		if(b>=2 || b<=36) {
			dno = cardConvR(b, n, cno);
			
			for(int i=dno-1; i>=0; i--) //���ڸ����� ���ʷ� ��Ÿ��
				System.out.print(cno[i]);
			}
		}*/
