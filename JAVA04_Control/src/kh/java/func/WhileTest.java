package kh.java.func;

import java.util.Scanner;

public class WhileTest {
	public void test1() {
		//"안녕하세요" 5번 반복해서 출력
		/*
		while(조건식) {
			조건식이 true면 실행되는 코드
		}
		*/
		int i=0;
		while(i<5) {
			System.out.println("안녕하세요");
			i++;
		}
		/*
		for(int i=0;i<5;i++) {
			System.out.println("안녕하세요");
		}
		*/
	}
	
	public void exam1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇단을 출력하시겠습니까?");
		int dan = sc.nextInt();
		System.out.println(dan+"단 입니다.");
		int i = 0;
		while(i<9) {
			System.out.println(dan+" * "+(i+1)+" = "+(dan*(i+1)));
			i++;
		}
	}
	public void exam2() {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int sum = 0;
		while(i<5) {
			System.out.print("정수값을 입력하시오 : ");
			int num = sc.nextInt();
			sum += num;
			i++;
		}
		System.out.println("입력한 5개의 정수의 합 : "+sum);
	}
	public void exam3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수 입력 : ");
		int num2 = sc.nextInt();
		int sum = 0;
		int i = num1;
		while(i < num2+1) {
			sum += i;
			i++;
		}
		System.out.printf("%d ~ %d의 정수의 합 : %d",num1,num2,sum);
	}
	public void exam4() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = scanner.nextInt();
		int sum = 0;
		int i=1;
		while(i<num+1) {
			if(i%2 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println("짝수들의 합은 : "+sum);	
	}
	
	
}





















