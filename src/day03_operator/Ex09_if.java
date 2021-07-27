package day03_operator;

import java.util.Scanner;

public class Ex09_if {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("수 입력");
		num = input.nextInt();
		if(num > 10) { //중괄호가 없으면 첫번째 세미콜론까지를 한 문장으로보고 그 문장을 종속문장이라고 생각
			System.out.println("1종속 문장 실행");
			System.out.println("2종속 문장 실행");
			System.out.println("3종속 문장 실행");
			System.out.println("4종속 문장 실행");
			System.out.println("5종속 문장 실행");
		}
		System.out.println("다음 문장들 실행");
		
		
		
		input.close();
	}

}
