package DoIt_02_1;
//1,000 이하의 소수를 열거(ver 2)
public class Training2_10_PrimeNumber2 {

	public static void main(String[] args) {
		int counter = 0;			//나눗셈의 횟수
		int ptr = 0;				//찾은 소수의 개수
		int[] prime = new int[500]; //소수를 저장하는 배열
		
		prime[ptr++] = 2;			//2는 소수임..prime[0]=2
		
		for(int n=3; n<=1000; n+=2) { //대상은 홀수만..n=3, 5, 7...
			int i;
			for(i=1; i<ptr; i++) { //1<1 성립하지x for문 실행하지 않는다!
				counter++;		   //ptr:2 n:5일때 counter:1
				if(n%prime[i]==0) //n%[소수]가 0으로 나누어 떨어지면 소수가 아니다
					break; //더이상 반복하지 않고 종료
			}
			if(ptr==i) //for문 실행하지 않고 if로 넘어온다..1==1 true 이므로 if문 실행!
				prime[ptr++] = n; //나누어 떨어지지 않으면 소수라고 배열에 저장..prime[1]=3; prime[2]=5...
		}
		
		for(int i=0; i<ptr; i++) //찾은 ptr개의 소수를 나타낸다.
			System.out.println(prime[i]);
		
		System.out.println("나눗셈을 수행한 횟수: "+counter);
	}
}
