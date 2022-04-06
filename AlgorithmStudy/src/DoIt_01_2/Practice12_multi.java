package DoIt_01_2;

public class Practice12_multi {

	public static void main(String[] args) {
		
		System.out.println(" |  1  2  3  4  5  6  7  8  9");
		System.out.print("-+------------------------------");
		for(int i=1; i<=9; i++) {
			System.out.print("\n"+i+"|");
			for(int j=1; j<=9; j++) {
				System.out.printf("%3d", i*j);				
			}
		}
	}
}
