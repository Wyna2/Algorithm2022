package programmers;

public class Lv0Repeat {

	public static void main(String[] args) {
		//String �� StringBuilder ȣ��
		String str = "Hello";
		StringBuilder sb = new StringBuilder();
		
		//�ݺ����� ����Ͽ� ���ڿ� �ݺ�
		for(int i=0; i<3; i++) {
			sb.append(str);
		}
		
		//��� ��� -> for��
		System.out.println("for��: "+sb);
		//��� ��� -> repeat��
		System.out.println("repeat��: "+str.repeat(3));

	}

}
