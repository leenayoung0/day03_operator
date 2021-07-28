package day03_operator;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		
		// 선생님 풀이는 Quiz02_if_Tver 참고하기
		
		Scanner sc = new Scanner(System.in);
		
		String s;
		int n, n1, n2,
			num, num1, num2,
			a, b, c, d;
		
		System.out.print("1.숫자입력 : ");
		n = sc.nextInt();
		s = (n%3==0)?n+"은 3의 배수":n+"은 3의 배수가 아님";
		System.out.println(s +"\n");
		//선생님 풀이
		if(n%3 !=0) {
			System.out.println(n+ "3의 배수가 아니다");
		}
		
		System.out.print("절대값: ");
		if (n>=0) {
			System.out.println(n);
		}
		if (n<0) {
			System.out.println(-n);
		}
		
		System.out.print("\n2.두 수 입력 : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		System.out.print("큰 수: ");
		if (n1>=n2) System.out.println(n1);
		if (n1<n2) System.out.println(n2);
		// 선생님은 두수가 같은 경우는 제외하심 n1>n2 n1<n2
		
		System.out.print("\n3.세 수 입력 : ");
		num = sc.nextInt();
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.print("가장 큰 수: ");
		if(num >= num1 && num >=num2) System.out.println(num);
		if(num1 >= num && num1 >=num2) System.out.println(num1);
		if(num2 >= num && num2 >=num1) System.out.println(num2);
		// 추가로 더 알려주신 풀이
		int max=0;
		if(num>num1) max = num;
		if(num1>num) max = num1;
		if(num2>max) max = num2;
		
		
		
		System.out.print("\n4.두 수 입력: ");
		a = sc.nextInt();
		b = sc.nextInt();
		if(a>b && a%2==0) System.out.println(a+"은 큰수이면서 짝수");
		if(a<b && b%2==0) System.out.println(b+"은 큰수이면서 짝수");
		
		System.out.print("\n5.두 수 입력: ");
		c = sc.nextInt();
		d = sc.nextInt();
		if((c+d)%2==0 && (c+d)%3==0) System.out.println("합 "+(c+d) + "은 짝수이며 3의 배수");
		
		sc.close();
		
		
	}

}
