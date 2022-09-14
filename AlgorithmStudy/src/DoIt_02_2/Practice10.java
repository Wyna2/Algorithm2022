package DoIt_02_2;

import java.util.Scanner;

//��ü�˻� �����Ϳ� Ŭ���� �迭���� ��� Ű�� �÷��� ������ ����
public class Practice10 {

	static final int VMAX = 21; //�÷� ����(0.0~2.0 0.1������ 21�� ����)
	
	static class PhyscData {
		String name;	//String �̸� ���� ����
		int height;		//int Ű ���� ����
		double vision;	//double �÷� ���� ����
		
		//������
		public PhyscData(String name, int height, double vision) {
			this.name = name; //name ���� name�� ����
			this.height = height;
			this.vision = vision;
		}
	}
	
	//Ű�� ��հ��� ����
	static double aveHeight(PhyscData[] dat) {
		double sum = 0; //���������� sum ����
		for(int i=0; i<dat.length; i++)
			sum+=dat[i].height; //dat�� ���̸�ŭ height �������� ���� sum�� �־���
		return sum/dat.length; //������ ���� ���� ������ ������ ��հ� ��ȯ
	}
	
	
	//�÷� ������ ����
	static void disVision(PhyscData[] dat, int[] dist) {
		int i=0;
		dist[i]=0; //dist[0]=0;
		for(i=0;i<dat.length;i++) //dat �迭�� ���̸�ŭ �ݺ��� ����
			if(dat[i].vision>=0.0 && dat[i].vision<=VMAX/10.0) //�÷��� 0 �̻��̸鼭 VMAX(21)/10.0 2.1������ ���
				dist[(int)(dat[i].vision*10)]++; //�÷¿� �ش��ϴ� ����� ������� �ش� �÷� ������ dist[ (int)�÷�*10 ]++ ���� 1�� �����Ѵ� 
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PhyscData[] x = { //�����ڿ� ���� �־��ش�
				new PhyscData("������", 162, 0.3),
				new PhyscData("������", 173, 0.7),
				new PhyscData("������", 175, 2.0),
				new PhyscData("ȫ����", 171, 1.5),
				new PhyscData("�̼���", 168, 0.4),
				new PhyscData("�迵��", 174, 1.2),
				new PhyscData("�ڿ��", 169, 0.8),
				new PhyscData("�ڿ��", 169, 0.8),
				new PhyscData("�ڿ��", 169, 0.8)
		};
		int[] vdist = new int[VMAX]; //�÷� ������� �迭 ���� ����
		
		//���
		System.out.println("**��ü�˻� ����Ʈ**");
		System.out.println("�̸�       Ű   �÷�");
		for(int i=0;i<x.length;i++)
			System.err.printf("%-8s%3d%5.1f\n",x[i].name,x[i].height,x[i].vision);
		
		System.out.printf("\n���Ű: %5.1fcm\n", aveHeight(x));
		disVision(x, vdist); //�÷º����� ����
		
		System.out.println("\n�÷� ����");
		for(int i=0;i<VMAX;i++) {
			//System.out.printf("%3.1f~:%2d\n", i/10.0, vdist[i]);
			String star="";
			if(vdist[i]>0) {
				for(int j=0;j<vdist[i];j++)
					star+="*";
			}
			System.out.printf("%3.1f~: %s\n", i/10.0, star);
		}
	}
}
