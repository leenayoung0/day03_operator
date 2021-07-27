package day03_operator;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, n3, b;
		
		System.out.print("숫자 입력: ");
		n1 = sc.nextInt();
		String s= (n1 % 3 == 0)?"3의 배수":"3의 배수가 아니다";
		System.out.println(s);
		
		System.out.print("두 숫자 입력: ");
		n2 = sc.nextInt();
		n3= sc.nextInt();
		b=(n2 > n3)?n2:n3;
		System.out.println(b);
	}

}
