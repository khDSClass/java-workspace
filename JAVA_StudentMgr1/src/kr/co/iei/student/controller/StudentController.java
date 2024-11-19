package kr.co.iei.student.controller;

import java.util.Scanner;

public class StudentController {
	//동명이인없다는 가정하에 학생 10명 정보를 관리하는 프로그램
	//각 학생은 이름(String),나이(int),주소(String) 정보를 가지고 있음
	//각 정보를 10개씩 관리할 배열을 생성
	String[] names;	
	int[] ages;	
	String[] addrs;
	//키보드값을 입력받을 스캐너
	Scanner sc;
	//1) 학생정보를 새로 입력받은 경우 배열에 몇번째에 넣을지 기억하고있는 변수
	//2) 현재 저장된 학생 수
	int index;
	
	public StudentController() {
		names = new String[10];
		ages = new int[10];
		addrs = new String[10];
		sc = new Scanner(System.in);
		index = 0;
	}
	//메인메뉴를 진행하는 메소드
	public void main() {
		while(true) {
			System.out.println("\n---------- 학생 관리 프로그램v1 ----------\n");
			System.out.println("1. 학생 정보 등록");
			System.out.println("2. 학생 정보 출력(전체)");
			System.out.println("3. 학생 정보 출력(이름 입력받아서 일치하는 1명)");
			System.out.println("4. 학생 정보 수정");
			System.out.println("5. 학생 정보 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 >> ");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				insertStudent();
				break;
			case 2:
				printAllStudent();
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 0:
				System.out.println("시스템을 종료합니다.");
				return;
			default:
				System.out.println("잘못입력하셨습니다.");
				break;
			}//switch문 종료
		}//메뉴 반복문
	}//main() 종료
	
	
	//학생 정보를 입력받아서 배열에 저장하는 메소드
	public void insertStudent() {
		System.out.println("\n---------- 학생 정보 등록 ----------\n");
		//등록할 학생 정보를 입력받음
		System.out.print("등록 할 학생 이름 입력 : ");
		String name = sc.next();
		System.out.print("등록 할 학생 나이 입력 : ");
		int age = sc.nextInt();
		System.out.print("등록 할 학생 주소 입력 : ");
		sc.nextLine();
		String addr = sc.nextLine();
		System.out.println("현재 index : "+index);
		//입력받은 정보를 각 배열에 저장
		names[index] = name;
		ages[index] = age;
		addrs[index] = addr;
		//학생 1명 정보를 배열에 저장하고나면 index번호를 1 증가시킴 -> 다음 등록 시 저장인덱스가 현재인덱스+1
		index++;
		System.out.println("정보 등록 완료");
		
	}//insertStudent() 종료

	//현재 저장된 학생정보를 모두 출력하는 메소드
	public void printAllStudent() {
		System.out.println("\n---------- 전체 학생 정보 출력 ----------\n");
		System.out.println("이름\t나이\t주소");
		System.out.println("---------------------------------");
		for(int i=0;i<index;i++) {			
			System.out.println(names[i]+"\t"+ages[i]+"\t"+addrs[i]);
		}
	}//printAllStudent() 종료
}












