package DoIt_03_2;

import java.util.Scanner;

//선형 검색
public class Training3_1_SeqSearch {

	//요솟수가 n인 배열 a에서 key와 같은 요소를 선형 검색한다.
	static int Training3_1_SeqSearch(int[] a, int n, int key) {
		int i = 0;
		
		while(true) {
			if(i==n)
				return -1; //검색 실패시 -1를 반환
			if (a[i]==key)
				return i;  //검색 성공시 인덱스를 반환
			i++;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num = sc.nextInt();
		int[] x = new int[num];	//요솟수가 num인 배열
		
		for(int i = 0; i<num; i++) {
			System.out.print("x["+i+"]: ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값: "); //키 값을 입력
		int ky = sc.nextInt();
		int idx = Training3_1_SeqSearch(x, num, ky); //배열 x에서 키 값이 ky인 요소를 검색
		
		if(idx==-1)
			System.out.println("그 값은 요소가 없습니다.");
		else
			System.out.println(ky+"은(는) x["+idx+"]에 있습니다.");

	}

}
