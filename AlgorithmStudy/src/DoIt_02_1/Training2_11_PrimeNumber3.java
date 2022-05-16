package DoIt_02_1;
//1,000 이하의 소수를 열거(ver 3)
public class Training2_11_PrimeNumber3 {

	public static void main(String[] args) {
		int counter = 0;			//곱셈과 나눗셈의 횟수
		int ptr = 0;				//찾은 소수의 개수
		int[] prime = new int[500]; //소수를 저장하는 배열
		
		prime[ptr++] = 2;			//2는 소수임
		prime[ptr++] = 3;			//3는 소수임
		
		for(int n=5; n<=1000; n+=2) { //대상은 홀수만
			boolean flag = false;
			for(int i=1; prime[i]*prime[i]<=n; i++) {
				counter+=2;
				if(n%prime[i]==0) { //나누어 떨어지면 소수가 아니다
					flag=true;
					break; //더이상 반복하지 않고 종료
				}
			}
			if(!flag) {
				prime[ptr++] = n; //나누어 떨어지지 않으면 소수라고 배열에 저장
				counter++;
			}
		}
		
		for(int i=0; i<ptr; i++) //찾은 ptr개의 소수를 나타낸다.
			System.out.println(prime[i]);
		
		System.out.println("나눗셈을 수행한 횟수: "+counter);

	}

}
