package DoIt_03_2;

import java.util.Scanner;

public class Practice3 {

	//요솟수가 n인 배열 a에서 key와 일치하는 모든 요소의 인덱스를 idx에 저장
	static int Practice3(int[] a, int n, int key, int[] idx) {
			
		a[n] = key;
		int idxn = 0;
		
		for(int i=0; i<n; i++) {
			if(a[i]==key) {
				idx[idxn] = i; //idx에 일치하는 요솟수의 위치 반환
				idxn++;
			}
		}
		return idxn==0?-1:idxn;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num = sc.nextInt();
		int[] x = new int[num+1];	//요솟수 num+1
		
		for(int i = 0; i<num; i++) {
			System.out.print("x["+i+"]: ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값: "); //키 값을 입력
		int ky = sc.nextInt();
		int key = Practice3(x, num, ky, x); //배열 x에서 키 값이 ky인 요소를 검색
		
		if(key==-1)
			System.out.println("\n그 값은 요소가 없습니다.");
		else {
			System.out.println("\n"+ky+"은(는) ["+key+"]개 있습니다.");
		}
	}

}
