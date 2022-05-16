package DoIt_02_1;
//1,000 이하의 소수를 열거(ver 1)
public class Training2_9_PrimeNumber1 {

	public static void main(String[] args) {
		int counter = 0; //나눗셈의 횟수
		
		for(int n=2; n<=1000; n++) {
			int i;
			for(i=2; i<n; i++) { //2~(n-1)까지 정수
				counter++;
				if(n%i==0) //2~(n-1)까지 정수로 나누어 떨어지면 소수가 아니다
					break; //더이상 반복하지 않고 종료
			}
			if(n==i)
				System.out.println(n);	
		}
		System.out.println("나눗셈을 수행한 횟수: "+counter);
	}
}
