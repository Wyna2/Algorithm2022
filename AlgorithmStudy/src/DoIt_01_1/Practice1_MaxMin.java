package DoIt_01_1;

public class Practice1_MaxMin {

	static int max4(int a, int b, int c, int d) {
		int max=a;
		if(b>a && b>c && b>d) max=b;
		if(c>a && c>b && c>d) max=c;
		if(d>a && d>b && d>c) max=d;
		return max;	
	}
	
	static int min3(int a, int b, int c) {
		int min=a;
		if(b<min) min=b;
		if(c<min) min=c;
		return min;
	}
	
	static int min4(int a, int b, int c, int d) {
		int min=a;
		if(b<a && b<c && b<d) min=b;
		if(c<a && c<b && c<d) min=c;
		if(d<a && d<b && d<c) min=d;
		return min;
	}
	
	public static void main(String[] args) {
		System.out.println(max4(3, 5, 8, 9));
		System.out.println(min3(11, 5, 8));
		System.out.println(min4(18, 15, 13, 11));
	}

}
