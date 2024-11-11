package kh.java.func;

import java.util.Scanner;

public class SwitchTest {
	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~3 사이의 정수를 입력하세요 : ");
		int num = sc.nextInt();
		/*
		 switch(변수 or 계산식){
		 case 리터럴값 : 
		 case 리터럴값 :
		 case 리터럴값 : 
		 }
		 */
		switch(num) {
		case 2 :
			System.out.println("2를 입력하셨네요");
			break;
		case 1 :
			System.out.println("1을 입력하셨군요");
			break;		
		case 3 :
			System.out.println("3!!!!!!!!!!!");
			break;
		default :
			System.out.println("1~3사이 숫자를 입력하세요.");
			break;
		}
		/*
		if(num == 1) {
			System.out.println("1을 입력하셨군요");
		}else if(num == 2) {
			System.out.println("2를 입력하셨네요");
		}else if(num == 3) {
			System.out.println("3!!!!!!!!!!");
		}else {
			System.out.println("1~3사이 숫자를 입력하세요.");
		}
		*/
	}
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력하세요 : ");
		String str = sc.next();
		char ch = str.charAt(0);
		switch(ch) {
		case 97 :
			System.out.println("aaaaaaaaaaaaa");
			break;
		case 'b' :
			System.out.println("bbbbbbbbbbbbb");
			break;
		case 'c' :
			System.out.println("ccccccccccccc");
			break;
		default :
			System.out.println("a/b/c 중 입력하세요");
			break;
		}
	}
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.next();
		switch(str) {
		case "aa" :
			System.out.println("aaaaaaaaaaaa");
			break;
		case "bb":
			System.out.println("bbbbbbbbbbbbbb");
			break;
		case "cc":
			System.out.println("cccccccccccccc");
			break;
		default :
			System.out.println("aa/bb/cc 중 입력하세요.");
			break;
		}
	}
	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("11111");
		case 2:
			System.out.println("22222");
			break;
		case 3:
			System.out.println("33333");
		default :
			System.out.println("1/2/3 중 입력하세요");
		}
	}
}

















