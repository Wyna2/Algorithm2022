package DoIt_02_1;

import java.util.Random;
import java.util.Scanner;

//배열 요소의 최댓값(값을 난수로 생성)
public class Training2_5_MaxOfArrayRand {

	static int maxOf(int[] a) {
		int max=a[0]; //a[0]번째를 우선 int max로 지정
		for(int i=1; i<a.length; i++)
		{
			if(a[i]>max) //a[1]~a[n-1] 값 중 a[0]보다 큰 값을 max로 지정
				max=a[i];
		}
		return max;
	}
	
	public static void main(String[] args) {
		
		Random rand = new Random(); //random 클래스형의 변수를 만들기 위해 선언
		Scanner sc = new Scanner(System.in);
		
		System.out.println("**키의 최댓값 구하기**");
		System.out.print("사람 수: ");
		int num = sc.nextInt();
		
		int[] height = new int[num]; //입력한 num값만큼의 길이를 가진 배열 height 생성
		
		System.out.println("키 값은 아래와 같습니다.");
		
		for(int i=0; i<num; i++) //0~(n-1) : 총 n번 반복
		{
			height[i] = 100+rand.nextInt(90);
			//생성한 난수를 90으로 나눈 나머지(0~89)에 100을 더한 값: 100~189
			System.out.println("height["+i+"]: "+height[i]);
		}
		System.out.println("최댓값은 "+maxOf(height)+" 입니다.");
	}
}
