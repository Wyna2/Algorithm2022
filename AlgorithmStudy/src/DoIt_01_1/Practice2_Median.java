package DoIt_01_1;

public class Practice2_Median {

	//�� ���� ��� ���� 13������ ��� ���տ� ���� �߾Ӱ� ���ϱ�
	static int med(int a, int b, int c) {
		if(a>=b)
			if(b>=c)
				return b; //a>=b>=c
			else if(c<a)
				return c; //b<c<a
			else
				return a; //b<a<c
		else if(a>c) 
			return a; //c<a<b
		else if(b>c)
			return c; //a<c<b	
		else
			return b; //a<b<c
	}
	
	//�Ʒ� �޼��尡 �ǽ����� med3 �޼��庸�� ȿ���� �������� ����
	static int med3(int a, int b, int c) {
		if((b>=a && c<=a)||(b<=a&&c>=a))
			return a;
		else if((a>b&&c<b)||(a<b&&c>b))
			return b;
		return c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
