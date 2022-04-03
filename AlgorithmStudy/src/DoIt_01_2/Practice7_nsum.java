package DoIt_01_2;

public class Practice7_nsum {
	//n이 7이면 1~n의 합이 28이 출력되는 프로그램 작성
	public static void main(String[] args) {
		
		System.out.println("1부터 7까지의 합을 구합니다.");
		int n = 7;
		int sum=0; //합
		
		for(int i=0; i<=n; i++)
			sum+=i; //sum에 i를 더한다.
		
		System.out.println("1부터 "+n+"까지의 합은 "+sum+"입니다.");

	}

}
