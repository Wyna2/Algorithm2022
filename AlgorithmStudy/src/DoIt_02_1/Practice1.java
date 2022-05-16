package DoIt_02_1;

import java.util.Random;
//키100~189, 사람수 1~20사이일때 키와 사람 수 난수로 생성하도록 프로그램 만들기
public class Practice1 {

	static int maxHeightSu(int[] h) {
		
		int max = h[0];
		
		for(int i=0; i<h.length; i++)
		{
			if(h[i]>max)
				max=h[i];
		}
		return max;
	}
	
	public static void main(String[] args) {
		Random rd = new Random();
		
		System.out.println("**키,사람수 난수로 최댓값 구하기**");
		int su = rd.nextInt(20)+1;
		int[] height = new int[su]; //입력한 su값 만큼 길이를 가진 height 생성
		
		System.out.println("사람 수 : "+su);
		System.out.println("[ 값 출력]");
		
		for(int i=0; i<su; i++)
		{
			height[i] = 100+rd.nextInt(90);
			System.out.println("height["+i+"]: "+height[i]);
		}

		System.out.println("최댓키는 "+maxHeightSu(height)+"cm 입니다.");			
	}

}
