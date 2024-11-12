package kh.java.func;

import java.util.Scanner;

public class ForTest {
	public void test1() {
		//"안녕하세요"문자열을 3번 출력
		//반복문을 이용해서 처리
		/*
		 초기값 : 반복 횟수를 처리하기위한 변수 선언 및 초기화
		 조건식 : 반복문의 수행 여부를 결정하는 조건식(최종적으로 논리데이터(true/false))
		 증감문 : 초기값에서 사용하는 변수를 조작해서 조건식을 이용해서 횟수를 조절하기 위한 증가/감소 구문
		 for(초기값 설정 ; 조건식 ; 조건처리를 위한 증감식){
		 
		 }
		 */
		for(int i=1;i<=3;i++) {
			System.out.println("안녕하세요");
		}
		
		//"안녕"을 5번 출력
		for(int i=5;i>0;i--) {
			System.out.println("안녕");
		}
		
		//"쉬는시간"을 4번출력
		for(int i=0;i<4;i++) {
			System.out.println("쉬는시간");
		}
		for(int i=0;i<5;i++) {
			System.out.println(i+1+"_테스트");
		}
	}
	public void exam1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇번 출력하시겠습니까?");
		int count = sc.nextInt();
		for(int i=0;i<count;i++) {
			System.out.println("안녕하세요");
		}
	}
	public void exam2() {
		int dan = 2;
		System.out.println(dan+"단 입니다.");
		for(int i=0;i<9;i++) {
			System.out.printf("%d * %d = %d\n",dan,i+1,dan*(i+1));
		}
		/*
		System.out.printf("%d * %d = %d\n",dan,1,dan*1);
		System.out.printf("%d * %d = %d\n",dan,2,dan*2);
		System.out.printf("%d * %d = %d\n",dan,3,dan*3);
		System.out.printf("%d * %d = %d\n",dan,4,dan*4);
		System.out.printf("%d * %d = %d\n",dan,5,dan*5);
		System.out.printf("%d * %d = %d\n",dan,6,dan*6);
		System.out.printf("%d * %d = %d\n",dan,7,dan*7);
		System.out.printf("%d * %d = %d\n",dan,8,dan*8);
		System.out.printf("%d * %d = %d\n",dan,9,dan*9);
		*/
		//...
	}
	public void exam3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇단을 출력하시겠습니까?");
		int dan = sc.nextInt();
		System.out.println(dan+"단 입니다.");
		for(int i=0;i<9;i++) {
			System.out.printf("%d * %d = %d\n",dan,i+1,dan*(i+1));
		}
	}
	public void exam4() {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i=0;i<5;i++) {
			System.out.print(i+"_정수 값을 입력하세요 : ");
			//int num = sc.nextInt();
			//sum += num;
			//sum = sum + num;
			sum += sc.nextInt();
		}
		System.out.println("입력한 5개 정수의 합은 : "+sum);
	}
	public void exam5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		int sum = 0;
		for(int i=num1;i<num2+1;i++) {
			sum += i;
		}
		System.out.printf("%d ~ %d의 정수의 합 : %d",num1,num2,sum);
	}
	
	public void exam6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i=0;i<=num;i++) {
			sum += i;
			i++;
		}
		/*
		for(int i=0;i<=num;i=i+2) {				
			sum += i;
		}
		
		for(int i=1;i<=num;i++) {	
			if(i%2 == 0) {	
				System.out.println("i값 누적");
				sum += i;
			}
		}
		*/
		System.out.println("짝수들의 합은 : "+sum);
	}
}










