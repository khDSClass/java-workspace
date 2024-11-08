package kh.java.func;

import java.util.Scanner;

public class IfTest {
	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 10을 입력하세요 : ");
		int num = sc.nextInt();
		/*
		 if(논리형데이터){
		 	논리형데이터가 true 실행될 코드 작성(false면 실행X)
		 	논리형데이터가 true 실행될 코드 작성(false면 실행X)
		 	논리형데이터가 true 실행될 코드 작성(false면 실행X)
		 	논리형데이터가 true 실행될 코드 작성(false면 실행X)
		 }
		 */
		if(num == 10) {			
			System.out.println("참 잘했어요!");
		}
		System.out.println("끝!");
	}
	
	public void exam1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("========== 숫자 구별 프로그램 ==========");
		System.out.print("임의의 정수를 입력하세요 : ");
		int num = sc.nextInt();
		if(num > 0) {
			System.out.printf("당신이 입력한 수 %d은(는) 양수입니다.",num);
		}
		
		if(num == 0) {
			System.out.printf("당신이 입력한 수 %d은(는) 0입니다.",num);
		}
		
		if(num < 0) {
			System.out.printf("당신이 입력한 수 %d은(는) 음수입니다.",num);
		}
	}
	
	public void exam2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("========== 두 수 비교 프로그램 =========");
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		if(num1 < num2) {
			System.out.printf("%d < %d\n두번째 수가 더 큽니다.",num1,num2);
		}
		if(num1 == num2) {
			System.out.printf("%d = %d\n두 수가 같습니다.",num1,num2);
		}
		if(num1 > num2) {
			System.out.printf("%d > %d\n첫번째 수가 더 큽니다.",num1,num2);
		}
	}
	
	public void exam3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("연산자를 입력하세요(+,-,*,/) : ");
		String str = sc.next();
		char oper = str.charAt(0);
		System.out.print("첫번째 숫자 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자 입력 : ");
		int num2 = sc.nextInt();
		
		if(oper == '+') {
			int sum = num1 + num2;
			System.out.printf("%d%c%d=%d",num1,oper,num2,sum);
		}
		if(oper == '-') {
			int minus = num1 - num2;
			System.out.printf("%d%c%d=%d",num1,oper,num2,minus);
		}
		if(oper == '*') {
			int multi = num1 * num2;
			System.out.printf("%d%c%d=%d",num1,oper,num2,multi);
		}
		if(oper == '/') {
			double div = (double)num1/num2;
			System.out.printf("%d%c%d=%f",num1,oper,num2,div);
		}
	}
	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		//입력받은 숫자가 홀수/짝수인지를 출력
		//홀수 : 2로 나눴을 때 나머지가 1인 수
		//짝수 : 2로 나눴을 때 나머지가 1 아닌 수
		if(num%2 == 1) {
			System.out.println("홀수!");
		}else {
			System.out.println("짝수!");
		}
	}
}













