package DoIt_02_1;

import java.util.Scanner;

public class Training2_4_MaxOfArray {
		
	static int maxOf(int[] a) {
	//배열 a의 최댓값을 구해 maxOf() int max값을 반환함
		int max=a[0]; //배열 a의 첫번째 값을 우선 max로 지정
		for(int i=1; i<a.length; i++)
		{
			if(a[i]>max) //for문 진행할 동안 a[0]=max보다 큰값이 있을 경우
				max=a[i]; //그 값을 max로 지정
		}
		return max; //int max를 리턴함
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수: ");
		int num=Integer.parseInt(sc.nextLine()); //사람 수 입력
		
		int[] height = new int[num]; //길이가 입력값 num인 배열 생성
		
		for(int i=0; i<num; i++) //배열 0~(n-1)까지 구하기
		{
			System.out.print("height["+i+"]: "); //배열 height[0]~height[n-1]
			height[i] = Integer.parseInt(sc.nextLine()); 
		}
		
		System.out.println("최댓값은 "+maxOf(height)+" 입니다.");
	}
}
