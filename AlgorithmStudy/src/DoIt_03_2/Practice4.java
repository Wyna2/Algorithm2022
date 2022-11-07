package DoIt_03_2;

import java.util.Scanner;

public class Practice4 {

	//요솟수가 n인 배열 a에서 key와 같은 요소를 보초법으로 선형 검색합니다.
	static int Practice4(int[] a, int n, int key) {
			
		a[n] = key;		//보초를 추가
		
		for(int i=0; i<n; i++) {
			if(a[i]==key) return i;
		}
		return -1;
		
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
		int idx = Practice4(x, num, ky); //배열 x에서 키 값이 ky인 요소를 검색
		
		if(idx==-1)
			System.out.println("\n그 값은 요소가 없습니다.");
		else {
			int pst = 0;
			int plt = num;
			int mid = (pst+plt)/2;
			
			System.out.print("\n  | ");
			for(int i=0; i<num; i++) {
				System.out.print(" "+i+" ");
			}
			System.out.print("\n--+");
			for(int i=0; i<num; i++) {
				System.out.print("---");
			}
			for(int i=0; i<=idx; i++) {
				System.out.print("\n  |  <-");

				for(int s=0; s<=plt; s++) {
					if(s==mid)
						System.out.print(" * ");
					else if(s==plt)
						System.out.print("->");
					else
						System.out.print("  ");
				}
								
				System.out.print("\n"+mid+" | ");
				for(int j=0; j<num; j++) {
					System.out.print(" "+x[j]+" ");
				}
				
				plt = mid;
				mid = plt/2;
			}
			
			System.out.println("\n"+ky+"은(는) x["+idx+"]에 있습니다.");
		}
	}

}
