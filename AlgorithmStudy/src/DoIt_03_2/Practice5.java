package DoIt_03_2;

import java.util.Scanner;

public class Practice5 {

	//배열 a의 앞쪽 n개 요소에서 key와 같은 요소를 이진검색
	static int Practice5(int[] a, int n, int key) {
		
		int pl = 0;		//검색범위 맨 앞의 idx
		int pr = n-1;	//검색범위 맨 뒤의 idx
		
		do {
			int pc = (pl+pr) / 2; //중앙요소의 idx
			if(a[pc]==key) {
				for(; pc>pl; pc--) //key와 같은 맨 앞의 요소를 찾는다.
					if(a[pc-1]<key)
						break;
				return pc;	//검색 성공
			} else if(a[pc]<key) {
				pl = pc+1;	// 검색범위를 앞쪽 절반으로 좁힘
			} else
				pr = pc-1;	//검색범위를 뒤족 절반으로 좁힘

		} while (pl <= pr);
		
		return -1;		//검색 실패
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num = sc.nextInt();
		int[] x = new int[num];	//요솟수 num
		
		for(int i = 0; i<num; i++) {
			System.out.print("x["+i+"]: ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값: "); //키 값을 입력
		int ky = sc.nextInt();
		int idx = Practice5(x, num, ky); //배열 x에서 키 값이 ky인 요소를 검색
		
		if(idx==-1)
			System.out.println("\n그 값은 요소가 없습니다.");
		else {
			System.out.println("\n"+ky+"은(는) x["+idx+"]에 있습니다.");
		}
	}

}
