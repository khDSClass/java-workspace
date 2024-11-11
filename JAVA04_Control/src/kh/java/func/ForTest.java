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
}










