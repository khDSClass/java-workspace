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
	public void exam4() {
		Scanner sc = new Scanner(System.in);
		int adultPrice = 30000;
		int kidPrice = 10000;
		System.out.println("========== 놀이공원 프로그램 ==========");
		System.out.print("입장하실 총 인원은 몇명입니까? : ");
		int totalCount = sc.nextInt();
		System.out.print("어른은 몇명입니까?(1인당 "+adultPrice+"원) : ");
		int adult = sc.nextInt();
		System.out.print("아이는 몇명입니까?(1인당 "+kidPrice+"원) : ");
		int kids = sc.nextInt();
		if(totalCount == adult + kids) {
			int totalPrice = adult*adultPrice + kids*kidPrice;
			System.out.println("지불하실 총 금액은 "+totalPrice+"원 입니다.");
		}else {
			System.out.println("인원수가 맞지 않습니다.");
		}
	}
	
	public void exam5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("========== 퀴즈 프로그램 ==========");
		int count = 0;
		System.out.println("첫번째 퀴즈");
		System.out.print("사과는 영어로 무엇일까요(1.apple, 2.스티브 잡스) : ");
		int an1 = sc.nextInt();
		if(an1 == 1) {
			count++;
			System.out.println("정답!");
		}else {
			System.out.println("땡!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		}
		
		System.out.println("두번째 퀴즈");
		System.out.print("바나나는 길어 길으면 기차 기차는 (1.비싸, 2.빨라) : ");
		int an2 = sc.nextInt();
		if(an2 == 2) {
			count++;
			System.out.println("정답!");
		}else {
			System.out.println("땡!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		}
		System.out.println("총 "+count+"문제 맞추셨습니다.");
		//정답을 2개 다 맞춘경우 (1번에 1입력/2번에 2입력)
		//정답을 1개만 맞춘경우	(1번에 1입력/2번에 1입력 , 1번에 2입력 / 2번에 2입력)
		//정답을 못맞춘 경우		(1번에 2입력/2번에 1입력)
		/*
		if(an1 == 1 && an2 == 2) {
			System.out.println("총 2문제 맞추셨습니다.");
		}
		if((an1 == 1 && an2 == 1) || (an1 == 2 && an2 == 2)) {
			System.out.println("총 1문제 맞추셨습니다.");
		}
		if(an1 == 2 && an2 == 2) {
			System.out.println("총 1문제 맞추셨습니다.");
		}
		if(an1 == 2 && an2 == 1) {
			System.out.println("총 0문제 맞추셨습니다.");
		}
		
		if(an1 == 1) {
			if(an2 == 1) {
				System.out.println("총 1문제 맞췄습니다.");
			}else {
				System.out.println("총 2문제 맞췄습니다.");
			}
		}else {
			if(an2 == 1) {
				System.out.println("총 0문제 맞췄습니다.");
			}else {
				System.out.println("총 1문제 맞췄습니다.");
			}
		}
		*/
	}
	
	public void exam6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("========== 심리테스트 ==========");
		System.out.print("당신은 술을 좋아하십니까(1.yes, 2.no)? : ");
		int an1 = sc.nextInt();
		if(an1 == 1) {			
			//yes라고 답한 경우
			System.out.print("당신은 담배를 피웁니까(1.yes, 2.no)? : ");
			int an2 = sc.nextInt();
			if(an2 == 1) {
				System.out.println("담배는 건강에 좋지 않습니다.");
			}else {
				System.out.println("술은 간에 좋지 않습니다.");
			}
		}else {
			//no라고 답한 경우
			System.out.print("당신은 이성친구가 있습니까?(1.yes, 2.no) : ");
			int an2 = sc.nextInt();
			if(an2 == 1) {
				System.out.println("올..ㅋ");
			}else {
				System.out.println("힘내요 ㅜㅜ");
			}
		}
		
	}
	
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num > 1000) {
			System.out.println("1000보다 큰 수 입니다.");
		}else if(num > 100) {
			System.out.println("100보다 큰 수 입니다.");
		}else if(num > 10) {
			System.out.println("10보다 큰 수 입니다.");
		}else {
			//위의 if, else if 조건에 모두 해당되지 않으면(모든 조건식 연산결과가 false가 나오면)
			System.out.println("10 이하의 수 입니다.");
		}
		
		
		/*
		if(num == 1) {
			System.out.println("1을 입력하셨군요");
		}
		if(num == 2) {
			System.out.println("2를 입력하셨네요");
		}
		if(num == 3) {
			System.out.println("3입니다!");
		}
		if(num < 1 || num > 3) {
			System.out.println("1~3 사이 정수를 입력하세요.");
		}
		
		if(num == 1) {
			System.out.println("1을 입력하셨군요");
		}else if(num == 2) {
			System.out.println("2를 입력하셨네요");
		}else if(num == 3) {
			System.out.println("3입니다!");
		}else {
			System.out.println("1~3 사이 정수를 입력하세요.");
		}
		*/
	}
}













