package day03_operator;

import java.util.Scanner;

public class Quiz02_if_Tver {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int su;
		//1번
		System.out.print("수 입력 : ");
		su = input.nextInt();
		if(su%3 == 0)
			System.out.println(su+"3의 배수입니다");
		if(su%3 != 0) {
			System.out.println(su+" 3의 배수가 아니다");
		}
		
		//2번
		System.out.print("수 입력 : ");
		su = input.nextInt();
		if(su < 0 )							// -su
			System.out.println(su+"절대값 => "+ su * -1);
		if(su >= 0)
			System.out.println(su+"절대값 => " + su );
		
		
		
		int su1,su2,su3;
		//3번
		System.out.print("두 수 입력 : ");
		su1 = input.nextInt();
		su2 = input.nextInt();
		System.out.println("su1 : "+su1+" ,su2 : "+su2);
		if(su1 > su2)
			System.out.println("su1 이 su2보다 크다");
		if(su1 < su2)
			System.out.println("su2 가 su1보다 크다");
		
		
	
		//4번
		System.out.print("세 수 입력 : ");
		su1 = input.nextInt();
		su2 = input.nextInt();
		su3 = input.nextInt();
		System.out.println("su1 : "+su1+" ,su2 : "+su2+" ,su3 : "+su3);
		if(su1 > su2 && su1 > su3)
			System.out.println("su1 이 가장 크다");
		if(su2 > su1 && su2 > su3)
			System.out.println("su2 이 가장 크다");
		if(su3 > su1 && su3 > su2)
			System.out.println("su3 이 가장 크다");
		int max=0;
		if(su1 > su2) {
			max = su1;
		}
		if(su2 > su1) {
			max = su2;
		}
		if(su3 > max) {
			max = su3;
		}
		System.out.println(max);
			
		//5번
		System.out.print("두 수 입력 : ");
		su1 = input.nextInt();
		su2 = input.nextInt();
		System.out.println("su1 : "+su1+" ,su2 : "+su2);
		if(su1 > su2 && su1 % 2 == 0)
			System.out.println("su1 이 크면서 짝수다");
		if(su2 > su1 && su2 % 2 == 0)
			System.out.println("su2 이 크면서 짝수다");
		//6번
		//두수를 입력 받아 합이 짝수이고 3의 배수인 수를 출력하시오
		System.out.print("두 수 입력 : ");
		su1 = input.nextInt();
		su2 = input.nextInt();
		int sum = su1+su2;
		if(sum%6 == 0){//(sum%2 == 0 && sum%3 == 0) {
			System.out.println(sum);
		}
		
		input.close();
	}
}
