package DoIt_02_1;
//�Է¹��� 10������ 2����~36������ ��� ��ȯ�Ͽ� ��Ÿ����.
public class Training2_8A_CardConvRev {
	
	//������ x�� r������ ��ȯ�Ͽ� �迭 d�� �Ʒ��ڸ����� �־�ΰ� �ڸ����� ��ȯ�Ѵ�.
	static int cardConvR(int x, int r, char[] d) {
		int digits = 0; //��ȯ ���� �ڸ���
		
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x%r); //r�� ���� �������� ����
			x/=r;
		} while (x != 0);
		
		return digits;
	}
	
	public static void main(String[] args) {
		
		
	}

}
