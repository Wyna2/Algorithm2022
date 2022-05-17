package DoIt_02_1;
//1,000 이하의 소수를 열거(ver 3)
public class Training2_11_PrimeNumber3 {

	public static void main(String[] args) {
		int counter = 0;			//곱셈과 나눗셈의 횟수
		int ptr = 0;				//찾은 소수의 개수
		int[] prime = new int[500]; //소수를 저장하는 배열..길이가 500인 int형 prime 배열 생성
		
		prime[ptr++] = 2;			//2는 소수임 prime[0] = 2
		prime[ptr++] = 3;			//3는 소수임 prime[1] = 3
		
		//prime[2]
		for(int n=5; n<=1000; n+=2) { //대상은 홀수만(5+=2)
			boolean flag = false; //flag 기본값을 false로 둔다
			for(int i=1; prime[i]*prime[i]<=n; i++) { //prime[i]의 제곱이 n보다 작거나 같을때까지 for문 반복
				counter+=2; //0, 2, 4 ..
				if(n%prime[i]==0) { //나누어 떨어지면 소수가 아니다
					flag=true; //소수가 아닐 경우 flag값을 true로 바꿔줌
					break; //더이상 반복하지 않고 종료
				}
			}
			if(!flag) { //flag=false..위 if가 실행되지 않았을 경우(n이 소수인 경우)
				prime[ptr++] = n; //나누어 떨어지지 않으면 소수라고 배열에 저장 prime[2]=5
				counter++; //횟수 1 증가
			}
		}
		
		for(int i=0; i<ptr; i++) //찾은 ptr개의 소수를 나타낸다.
			System.out.println(prime[i]);
		
		System.out.println("나눗셈을 수행한 횟수: "+counter);

	}

}
