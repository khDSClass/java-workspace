package kh.java.func;

import java.util.Scanner;

public class LoopTest {
	public void test1() {
		// for로 무한반복
		for (;;) {
			System.out.println("무한히 반복 될 실행코드");
		}
	}

	public void test2() {
		// while로 무한반복
		while (true) {
			System.out.println("무한반복 코드");
		}
	}

	public void test3() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("정수를 입력하세요 : ");
			int num = sc.nextInt();
			if (num == 1) {
				break;// 즉시 반복문을 빠져나감 break;이후 코드는 수행하지 않음
				// System.out.println("break");//break이후에는 코드 작성이 불가능(-> 도달할 수 없는 코드)
			} else if (num == 2) {
				continue;// 즉시 다음 반복회차로 이동(while은 조건검사, for 증감식)
				// System.out.println("continue");//continue이후에 코드 작성 불가능(-> 도달할 수 없는 코드)
			} else {
				System.out.println("입력한 숫자는 : " + num);
			}
			System.out.println("반복문 마지막에 있는 구문");

		}
		System.out.println("반복문 끝나면 나오는 구문");
	}

	public void test4() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.print(i + "_정수입력 : ");
			int num = sc.nextInt();
			if (num == 1) {
				break;
			} else if (num == 2) {
				continue;
			} else {
				System.out.println("입력한 숫자는 : " + num);
			}
			System.out.println("반복문 마지막 구문");
		}
		System.out.println("반복문 외부 구문");
	}

	public void test5() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("---------- 카카오톡 ----------");
			System.out.println("1. 친구목록");
			System.out.println("2. 채팅");
			System.out.println("3. 오픈채팅");
			System.out.println("4. 쇼핑");
			System.out.println("5. 종료");
			System.out.print("선택 > ");
			int select = sc.nextInt();
			if (select == 1) {
				System.out.println("여기는 내 친구목록이 나올 예정");
			} else if (select == 2) {
				System.out.println("여기는 내 대화목록이 나올 예정");
			} else if (select == 3) {
				System.out.println("여기는 내가 참여한 오픈채팅 목록이 나올 예정");
			} else if (select == 4) {
				System.out.println("여기는 쇼핑목록이 나올 예정");
			} else if (select == 5) {
				System.out.println("시스템을 종료합니다.");
				break;
			}
		}

	}

	public void test6() {
		Scanner sc = new Scanner(System.in);
		boolean power = true;
		while (power) {
			System.out.println("---------- 카카오톡 ----------");
			System.out.println("1. 친구목록");
			System.out.println("2. 채팅");
			System.out.println("3. 오픈채팅");
			System.out.println("4. 쇼핑");
			System.out.println("5. 종료");
			System.out.print("선택 > ");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				System.out.println("여기서 친구 목록 나올 예정");
				break;
			case 2:
				System.out.println("여기는 채팅 목록 나올 예정");
				break;
			case 3:
				System.out.println("여기는 참여한 오픈채팅 목록 나올 예정");
				break;
			case 4:
				System.out.println("여기는 쇼핑목록");
				break;
			case 5:
				power = false;
				break;// break가 반복문 종료가아닌 switch-case 종료하는 break임
			}// switch
		} // while
	}// 메소드

	public void test7() {
		// 중첩for문
		for (int i = 0; i < 3; i++) {
			System.out.println(i + "_반복문 1");

			for (int j = 0; j < 5; j++) {
				System.out.println(j + "_반복문 2");
			}
		}
	}

	public void test8() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("i : " + i + " / j : " + j);
			}
		}
	}
	
	public void test9() {
		/*
		System.out.printf("%d * %d = %d\t",2,1,2*1);
		System.out.printf("%d * %d = %d\t",2,2,2*2);
		System.out.printf("%d * %d = %d\t",2,3,2*3);
		//...
		System.out.printf("%d * %d = %d\t",2,9,2*9);
		*/
		for(int i=2;i<10;i++) {
			
			for(int j=1;j<10;j++) {
				System.out.printf("%d * %d = %d\t",i,j,i*j);	
			}
			System.out.println();
		}
		/*
		for(int i=1;i<10;i++) {
			System.out.printf("%d * %d = %d\t",3,i,3*i);	
		}
		System.out.println();
		for(int i=1;i<10;i++) {
			System.out.printf("%d * %d = %d\t",4,i,4*i);	
		}
		System.out.println();
		//...
		for(int i=1;i<10;i++) {
			System.out.printf("%d * %d = %d\t",9,i,9*i);	
		}
		System.out.println();
		*/
	}
	public void test10() {
		for(int i=1;i<10;i++) {
			for(int j=2;j<10;j++) {
				System.out.printf("%d * %d = %d\t",j,i,j*i);
			}
			System.out.println();
		}
	}
	
	public void star1() {
		for(int i=0;i<5;i++) {
			System.out.print("*");
		}
	}
	public void star2() {
		for(int i=0;i<5;i++) {
			System.out.println("*");
		}
	}
	public void star3() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}	
	}
	public void star4() {
		for(int i=1;i<6;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		/*
		for(int j=0;j<5;j++) {
			System.out.print(1);
		}
		System.out.println();
		for(int j=0;j<5;j++) {
			System.out.print(2);
		}
		System.out.println();
		for(int j=0;j<5;j++) {
			System.out.print(3);
		}
		System.out.println();
		for(int j=0;j<5;j++) {
			System.out.print(4);
		}
		System.out.println();
		for(int j=0;j<5;j++) {
			System.out.print(5);
		}
		System.out.println();
		*/
	}
	
}


















