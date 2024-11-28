package kr.co.iei.point.controller;

import java.util.ArrayList;
import java.util.Scanner;

import kr.co.iei.point.vo.Gold;
import kr.co.iei.point.vo.Grade;
import kr.co.iei.point.vo.Silver;
import kr.co.iei.point.vo.Vip;

public class PointController {
	Scanner sc;
	ArrayList<Grade> members;
	public PointController() {
		super();
		sc = new Scanner(System.in);
		members = new ArrayList<Grade>();
		members.add(new Gold("gold", "회원1", 1000));
		members.add(new Vip("vip", "회원2", 1000));
		members.add(new Gold("gold", "회원3", 2000));
		members.add(new Silver("silver", "회원4", 1000));
		members.add(new Silver("silver", "회원5", 2000));
	}
	
	public void main() {
		while(true) {
			System.out.println("\n---------- 회원 관리 프로그램v4 ----------\n");
			System.out.println("1. 회원 정보 등록");
			System.out.println("2. 회원 전체 출력");
			System.out.println("3. 회원 1명 출력");
			System.out.println("4. 회원 정보 수정");
			System.out.println("5. 회원 정보 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 >> ");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				insertMember();
				break;
			case 2:
				printAllMember();
				break;
			case 3:
				printOneMember();
				break;
			case 4:
				updateMember();
				break;
			case 5:
				deleteMember();
				break;
			case 0:
				return;
			}
		}
	}//main();
	public void insertMember() {
		System.out.println("\n---------- 회원 정보 등록 ----------\n");
		System.out.print("회원 등급 입력[silver/gold/vip] : ");
		String grade = sc.next();
		System.out.print("회원 이름 입력 : ");
		String name = sc.next();
		System.out.print("회원 포인트 입력 : ");
		int point = sc.nextInt();
		switch(grade) {
		case "silver":
			Silver s = new Silver(grade, name, point);
			Grade gra = (Grade)s;
			members.add(gra);
			break;
		case "gold":
			Grade g = new Gold(grade, name, point);
			members.add(g);
			break;
		case "vip":
			members.add(new Vip(grade, name, point));
			break;
		}		
		System.out.println("회원 등록 완료");
	}//insertMember() 종료
	
	public void printAllMember() {
		System.out.println("\n---------- 전체 회원 출력 ----------\n");
		System.out.println("등급\t이름\t포인트\t보너스");
		System.out.println("---------------------------------------");
		/*
		for(int i=0;i<members.size();i++) {
			Grade g = members.get(i);
			System.out.println(g.getGrade()+"\t"+g.getName()+"\t"+g.getPoint()+"\t"+g.getBonus());
		}
		*/
		for(Grade g : members) {
			System.out.println(g.getGrade()+"\t"+g.getName()+"\t"+g.getPoint()+"\t"+g.getBonus());
		}
	}//printAllMember();
	
	public void printOneMember() {
		System.out.println("\n---------- 회원 1명 출력 ----------\n");
		System.out.print("조회 할 회원 이름 입력 : ");
		String name = sc.next();
		int searchIndex = searchMember(name);
		if(searchIndex == -1) {
			System.out.println("회원 정보를 찾을 수 없습니다.");
		}else {
			Grade g = members.get(searchIndex);
			System.out.println("등급 : "+g.getGrade());
			System.out.println("이름 : "+g.getName());
			System.out.println("포인트 : "+g.getPoint());
			System.out.println("보너스 : "+g.getBonus());
		}
	}//printOneMember();
	
	
	public void updateMember() {
		System.out.println("\n---------- 회원 정보 수정 ----------\n");
		System.out.print("수정 할 회원 이름 입력 : ");
		String name = sc.next();
		int searchIndex = searchMember(name);
		if(searchIndex == -1) {
			System.out.println("회원 정보를 조회할 수 없습니다.");
		}else {
			System.out.print("수정 할 회원 등급 입력[silver/gold/vip] : ");
			String grade = sc.next();
			System.out.print("수정 할 회원 포인트 입력 : ");
			int point = sc.nextInt();
			switch(grade) {
			case "silver":
				members.set(searchIndex, new Silver(grade, name, point));
				break;
			case "gold":
				members.set(searchIndex, new Gold(grade, name, point));
				break;
			case "vip":
				Vip v = new Vip(grade, name, point);
				members.set(searchIndex, v);
				break;
			}
			System.out.println("정보 수정 완료");
		}
	}//updateMember();
	
	public void deleteMember() {
		System.out.println("\n---------- 회원 정보 삭제 ----------\n");
		System.out.print("삭제 할 회원 이름 입력 : ");
		String name = sc.next();
		int searchIndex = searchMember(name);
		if(searchIndex == -1) {
			System.out.println("회원 정보를 조회할 수 없습니다.");
		}else {
			members.remove(searchIndex);
			System.out.println("회원 삭제 완료");
		}
	}//deleteMember();
	
	
	public int searchMember(String name) {
		for(int i=0;i<members.size();i++) {
			//Grade g = members.get(i);
			//String searchName = g.getName();
			//if(name.equals(searchName)) {
			if(members.get(i).getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}//searchMember();
	
	
	
	
}








