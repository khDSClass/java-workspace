package kh.java.function;

import java.util.Scanner;

public class Example {
	public void exam1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		System.out.println("========== 결과 ==========");
		int add = num1 + num2;
		int min = num1 - num2;
		int mul = num1 * num2;
		int div1 = num1 / num2;
		int div2 = num1 % num2;
		System.out.println("더하기 결과 : "+add);
		System.out.println("빼기 결과 : "+min);
		System.out.println("곱하기 결과 : "+mul);
		System.out.println("나누기 몫 : "+div1);
		System.out.println("나누기 나머지 : "+div2);
	}
	public void exam11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		System.out.println("========== 결과 ==========");
		System.out.println("더하기 결과 : "+(num1+num2));
		System.out.println("빼기 결과 : "+(num1-num2));
		System.out.printf("곱하기 결과 : %d\n",num1*num2);
		System.out.printf("나누기 몫 : %d\n",num1/num2);
		System.out.printf("나누기 나머지 : %d\n",num1%num2);
	}
	public void exam2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("가로 길이 입력 : ");
		double width = sc.nextDouble();
		System.out.print("세로 길이 입력 : ");
		double height = sc.nextDouble();
		System.out.println("========= 결과 =========");
		System.out.printf("면적 : %.2f\n",width*height);
		System.out.printf("둘레 : %.2f",2*(width+height));
	}
	
	
	
	public void exam3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("영어단어 입력 : ");
		
		
		String word = sc.next();
		char ch1 = word.charAt(0);
		char ch2 = word.charAt(1);
		char ch3 = word.charAt(2);
		System.out.println("첫번째 글자 : "+ch1);
		System.out.println("두번째 글자 : "+ch2);
		System.out.println("세번째 글자 : "+ch3);
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
