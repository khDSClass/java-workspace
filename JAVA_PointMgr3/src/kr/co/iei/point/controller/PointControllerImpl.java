package kr.co.iei.point.controller;

import java.util.Scanner;

import kr.co.iei.point.vo.Gold;
import kr.co.iei.point.vo.Grade;
import kr.co.iei.point.vo.Silver;
import kr.co.iei.point.vo.Vip;
import kr.co.iei.point.vo.Vvip;

public class PointControllerImpl implements PointController {

	Grade[] members;
	int index;
	Scanner sc;
	
	public PointControllerImpl() {
		super();
		members = new Grade[30];
		index = 0;
		sc = new Scanner(System.in);
		members[index++] = new Silver("silver", "회원1", 1000);
		members[index++] = new Vip("vip", "회원2", 3000);
		members[index++] = new Vip("vip", "회원3",2000);
		members[index++] = new Gold("gold","회원4",2500);
		members[index++] = new Silver("silver", "회원5", 500);
	}

	@Override
	public void main() {
		while(true) {
			System.out.println("\n---------- 회원 관리 프로그램v3 ----------\n");
			System.out.println("1. 회원 정보 등록");
			System.out.println("2. 전체 회원 출력");
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
				break;
			case 5:
				break;
			case 0:
				System.out.println("시스템을 종료합니다.");
				return;
			default:
				System.out.println("잘못입력하셨습니다.");
				break;
			}
		}
		
	}

	@Override
	public void insertMember() {
		System.out.println("\n---------- 회원 정보 등록 ----------\n");
		System.out.print("등록 할 회원 등급 입력[silver/gold/vip/vvip] : ");
		String grade = sc.next();
		System.out.print("등록 할 회원 이름 입력 : ");
		String name = sc.next();
		System.out.print("등록 할 회원 포인트 입력 : ");
		int point = sc.nextInt();
		
		switch(grade) {
		case "silver":
			Silver s = new Silver();
			s.setGrade(grade);
			s.setName(name);
			s.setPoint(point);
			Grade gra = (Grade)s;//업캐스팅(자료형을 상위자료형 형태로 저장 -> 다형성)
			members[index] = gra;
			index++;
			break;
		case "gold":
			Gold g = new Gold(grade, name, point);
			Grade gra1 = g;//업캐스팅(업캐스팅은 강제형변환을 하지 않아도 상속조건만 맞으면 자동 형변환 가능)
			members[index] = gra1;
			index++;
			break;
		case "vip":
			Vip v = new Vip(grade, name, point);
			members[index] = v;
			index++;
			break;
		case "vvip":
			members[index++] = new Vvip(grade, name, point);
			break;
		}
		System.out.println("회원 정보 등록 완료!!");
	}

	@Override
	public void printAllMember() {
		System.out.println("\n---------- 전체 회원 정보 출력 ----------\n");
		System.out.println("등급\t이름\t포인트\t보너스");
		System.out.println("---------------------------------");
		for(int i=0;i<index;i++) {
			Grade g = members[i];
			//다운캐스팅을 해야하는 경우 : 자식객체에만 있는 기능을 사용 할 때			
			System.out.println(g.getGrade()+"\t"+g.getName()+"\t"+g.getPoint()+"\t"+g.getBonus());
		}
		
	}

	@Override
	public void printOneMember() {
		System.out.println("\n---------- 회원 정보 출력 ----------\n");
		System.out.print("조회 할 회원 이름 입력 : ");
		String name = sc.next();
		int searchIndex = searchMember(name);
		if(searchIndex == -1) {
			System.out.println("회원 정보를 찾을 수 없습니다.");
		}else {
			Grade g = members[searchIndex];
			System.out.println("등급 : "+g.getGrade());
			System.out.println("이름 : "+g.getName());
			System.out.println("포인트 : "+g.getPoint());
			System.out.println("보너스 : "+g.getBonus());
		}
		
	}

	@Override
	public void updateMember() {
		System.out.println("\n---------- 회원 정보 수정 ----------\n");
		System.out.print("수정 할 회원 이름 입력 : ");
		String name = sc.next();
		int searchIndex = searchMember(name);
		if(searchIndex == -1) {
			System.out.println("회원 정보를 찾을 수 없습니다.");
		}else {
			System.out.print("수정할 회원 등급 입력[silver/gold/vip/vvip] : ");
			String grade = sc.next();
			System.out.print("수정할 회원 포인트 입력 : ");
			int point = sc.nextInt();
			switch(grade) {
			case "silver":
				Silver s = new Silver(grade, name, point);
				Grade g = (Grade)s;
				members[searchIndex] = g;
				break;
			case "gold":
				members[searchIndex] = new Gold(grade, name, point);
				break;
			case "vip":
				members[searchIndex] = new Vip(grade, name, point);
				break;
			case "vvip":
				members[searchIndex] = new Vvip(grade, name, point);
				break;
			}
			System.out.println("정보 수정 완료");
			
		}
	}

	@Override
	public void deleteMember() {
		System.out.println("\n---------- 회원 정보 삭제 ----------\n");
		System.out.print("삭제 할 회원 이름 입력 : ");
		String name = sc.next();
		int searchIndex = searchMember(name);
		if(searchIndex == -1) {
			System.out.println("회원 정보를 찾을 수 없습니다.");
		}else {
			for(int i=searchIndex;i<index-1;i++) {
				members[i] = members[i+1];
			}
			members[--index] = null;
			System.out.println("삭제완료");
		}
		
	}

	@Override
	public int searchMember(String name) {
		for(int i=0;i<index;i++) {
			Grade g = members[i];
			String searchName = g.getName();
			if(name.equals(searchName)) {
				return i;
			}
		}
		return -1;
	}
	
	
}






