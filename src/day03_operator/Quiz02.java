package day03_operator;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		
		// ������ Ǯ�̴� Quiz02_if_Tver �����ϱ�
		
		Scanner sc = new Scanner(System.in);
		
		String s;
		int n, n1, n2,
			num, num1, num2,
			a, b, c, d;
		
		System.out.print("1.�����Է� : ");
		n = sc.nextInt();
		s = (n%3==0)?n+"�� 3�� ���":n+"�� 3�� ����� �ƴ�";
		System.out.println(s +"\n");
		//������ Ǯ��
		if(n%3 !=0) {
			System.out.println(n+ "3�� ����� �ƴϴ�");
		}
		
		System.out.print("���밪: ");
		if (n>=0) {
			System.out.println(n);
		}
		if (n<0) {
			System.out.println(-n);
		}
		
		System.out.print("\n2.�� �� �Է� : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		System.out.print("ū ��: ");
		if (n1>=n2) System.out.println(n1);
		if (n1<n2) System.out.println(n2);
		// �������� �μ��� ���� ���� �����Ͻ� n1>n2 n1<n2
		
		System.out.print("\n3.�� �� �Է� : ");
		num = sc.nextInt();
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.print("���� ū ��: ");
		if(num >= num1 && num >=num2) System.out.println(num);
		if(num1 >= num && num1 >=num2) System.out.println(num1);
		if(num2 >= num && num2 >=num1) System.out.println(num2);
		// �߰��� �� �˷��ֽ� Ǯ��
		int max=0;
		if(num>num1) max = num;
		if(num1>num) max = num1;
		if(num2>max) max = num2;
		
		
		
		System.out.print("\n4.�� �� �Է�: ");
		a = sc.nextInt();
		b = sc.nextInt();
		if(a>b && a%2==0) System.out.println(a+"�� ū���̸鼭 ¦��");
		if(a<b && b%2==0) System.out.println(b+"�� ū���̸鼭 ¦��");
		
		System.out.print("\n5.�� �� �Է�: ");
		c = sc.nextInt();
		d = sc.nextInt();
		if((c+d)%2==0 && (c+d)%3==0) System.out.println("�� "+(c+d) + "�� ¦���̸� 3�� ���");
		
		sc.close();
		
		
	}

}
