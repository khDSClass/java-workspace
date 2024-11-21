package kr.co.iei.point.controller;

import java.util.Scanner;

import kr.co.iei.point.vo.Gold;
import kr.co.iei.point.vo.SearchResult;
import kr.co.iei.point.vo.Silver;
import kr.co.iei.point.vo.Vip;

public class PointController {
	Silver[] sMembers;
	Gold[] gMembers;
	Vip[] vMembers;
	int sIndex;
	int gIndex;
	int vIndex;
	Scanner sc;
	private String searchGrade;
	public PointController() {
		sMembers = new Silver[20];
		gMembers = new Gold[20];
		vMembers = new Vip[20];
		sIndex = 0;
		gIndex = 0;
		vIndex = 0;
		sc = new Scanner(System.in);
		searchGrade = null;
		
		sMembers[sIndex++] = new Silver("silver", "회원1", 1000);
		sMembers[sIndex++] = new Silver("silver", "회원2", 2000);
		gMembers[gIndex++] = new Gold("gold", "회원3", 1000);
		gMembers[gIndex++] = new Gold("gold", "회원4", 2000);
		vMembers[vIndex++] = new Vip("vip", "회원5", 1000);
		vMembers[vIndex++] = new Vip("vip", "회원6", 2000);
		
	}
	
	public void main() {
		while(true) {
			System.out.println("\n---------- 회원 관리 프로그램v2 ----------\n");
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
				updateMember();
				break;
			case 5:
				deleteMember();
				break;
			case 0:
				System.out.println("시스템을 종료합니다.");
				return;
			default:
				System.out.println("잘못입력하셨습니다.");
				break;
			}
		}
	}//main()종료
	
	public void insertMember() {
		System.out.println("\n---------- 회원 정보 등록 ----------\n");
		System.out.print("회원 등급 입력[silver/gold/vip] : ");
		String grade = sc.next();
		System.out.print("회원 이름 입력 : ");
		String name = sc.next();
		System.out.print("회원 포인트 입력 : ");
		int point = sc.nextInt();
		//입력한 등급에따라서 다른 객체 생성해야 함 -> 보너스가 다르므로
		//입력한 등급이 silver면 Silver객체 생성 해서 Silver배열에 저장
		//입력한 등급이 gold면 Gold객체 생성 해서 Gold배열에 저장
		//입력한 등급이 vip면 Vip객체 생성 해서 Vip배열에 저장
		switch(grade) {
		case "silver":
			Silver s = new Silver(grade, name, point);
			sMembers[sIndex] = s;
			sIndex++;
			break;
		case "gold":
			gMembers[gIndex] = new Gold(grade, name, point);
			gIndex++;
			break;
		case "vip":
			vMembers[vIndex++] = new Vip(grade, name, point);
			break;
		}
		System.out.println("회원 등록 완료");
	}//insertMember()종료
	
	public void printAllMember() {
		System.out.println("\n---------- 전체 회원 정보 출력 ----------\n");
		System.out.println("등급\t이름\t포인트\t보너스");
		System.out.println("-------------------------------------");
		//실버등급 회원 출력 -> sMembers에 있는 회원 출력
		for(int i=0;i<sIndex;i++) {
			Silver s = sMembers[i];
			System.out.println(s.getGrade()+"\t"+s.getName()+"\t"+s.getPoint()+"\t"+s.getBonus());
		}
		//골드등급 회원 출력 -> gMembers에 있는 회원 출력
		for(int i=0;i<gIndex;i++) {
			System.out.println(gMembers[i].getGrade()+"\t"+gMembers[i].getName()
								+"\t"+gMembers[i].getPoint()+"\t"+gMembers[i].getBonus());
		}
		for(int i=0;i<vIndex;i++) {
			Vip v = vMembers[i];
			System.out.println(v.getGrade()+"\t"+v.getName()+"\t"+v.getPoint()+"\t"+v.getBonus());
			
		}
	}//printAllMember() 종료
	
	public void printOneMember() {
		System.out.println("\n---------- 회원 정보 조회 ----------\n");
		System.out.print("조회 할 회원 이름 입력 : ");
		String name = sc.next();
		SearchResult result = searchMember3(name);
		if(result == null) {
			System.out.println("회원 정보를 찾을 수 없습니다.");
		}else {
			String type = result.getType();
			if(type.equals("silver")) {
				int index = result.getIndex();
				Silver s = sMembers[index];
				System.out.println("등급 : "+s.getGrade());
				System.out.println("이름 : "+s.getName());
				System.out.println("포인트 : "+s.getPoint());
				System.out.println("보너스 : "+s.getBonus());
			}else if(result.getType().equals("gold")) {
				Gold g = gMembers[result.getIndex()];
				System.out.println("등급 : "+g.getGrade());
				System.out.println("이름 : "+g.getName());
				System.out.println("포인트 : "+g.getPoint());
				System.out.println("보너스 : "+g.getBonus());
			}else if(result.getType().equals("vip")) {
				System.out.println("등급 : "+vMembers[result.getIndex()].getGrade());
				System.out.println("이름 : "+vMembers[result.getIndex()].getName());
				System.out.println("포인트 : "+vMembers[result.getIndex()].getPoint());
				System.out.println("보너스 : "+vMembers[result.getIndex()].getBonus());
			}
		}
		
		/*
		int searchIndex = searchMember2(name);
		if(searchIndex == -1) {
			System.out.println("회원 정보를 찾을 수 없습니다.");
		}else {
			if(searchGrade.equals("silver")) {
				Silver s = sMembers[searchIndex];
				System.out.println("등급 : "+s.getGrade());
				System.out.println("이름 : "+s.getName());
				System.out.println("포인트 : "+s.getPoint());
				System.out.println("보너스 : "+s.getBonus());
			}else if(searchGrade.equals("gold")) {
				Gold g = gMembers[searchIndex];
				System.out.println("등급 : "+g.getGrade());
				System.out.println("이름 : "+g.getName());
				System.out.println("포인트 : "+g.getPoint());
				System.out.println("보너스 : "+g.getBonus());
			}else if(searchGrade.equals("vip")) {
				System.out.println("등급 : "+vMembers[searchIndex].getGrade());
				System.out.println("이름 : "+vMembers[searchIndex].getName());
				System.out.println("포인트 : "+vMembers[searchIndex].getPoint());
				System.out.println("보너스 : "+vMembers[searchIndex].getBonus());
			}
		}
		
		
		int searchIndex = searchMember1(name);
		if(searchIndex == -1) {
			System.out.println("회원 정보를 찾을 수 없습니다.");
		}else {
			//받은 숫자가 0~9 사이면 sMembers
			//받은 숫자가 10~19 사이면 gMembers
			//받은 숫자가 20~29 사이면 vMembers
			if(0<= searchIndex && searchIndex <=9) {
				Silver s = sMembers[searchIndex];
				System.out.println("등급 : "+s.getGrade());
				System.out.println("이름 : "+s.getName());
				System.out.println("포인트 : "+s.getPoint());
				System.out.println("보너스 : "+s.getBonus());
			}else if(searchIndex/10 == 1) {
				Gold g = gMembers[searchIndex-10];
				System.out.println("등급 : "+g.getGrade());
				System.out.println("이름 : "+g.getName());
				System.out.println("포인트 : "+g.getPoint());
				System.out.println("보너스 : "+g.getBonus());
			}else if(searchIndex/20 == 1) {
				Vip v = vMembers[searchIndex-20];
				System.out.println("등급 : "+v.getGrade());
				System.out.println("이름 : "+v.getName());
				System.out.println("포인트 : "+v.getPoint());
				System.out.println("보너스 : "+v.getBonus());
			}
		}
		*/
	}//printOneMember() 종료
	
	public void updateMember() {
		System.out.println("\n---------- 회원 정보 수정 ----------\n");
		System.out.print("수정 할 회원 이름 입력 : ");
		String name = sc.next();
		SearchResult result = searchMember3(name);
		if(result == null) {
			System.out.println("회원 정보를 조회할 수 없습니다.");
		}else {
			String type = result.getType();
			int index = result.getIndex();
			
			System.out.print("수정 할 등급 입력[silver/gold/vip] : ");
			String grade = sc.next();
			System.out.print("수정 할 포인트 입력 : ");
			int point = sc.nextInt();
			
			//1) setter를 이용한 방법 //-> grade변수의 데이터는 변경할 수 있는데, 객체가 안바뀌므로 보너스가 적용X	
			/*
			switch(type) {
			case "silver":
				Silver s = sMembers[index];
				s.setGrade(grade);
				s.setPoint(point);
				break;
			case "gold":
				Gold g = gMembers[index];
				g.setGrade(grade);
				g.setPoint(point);
				break;
			case "vip":
				Vip v = vMembers[index];
				v.setGrade(grade);
				v.setPoint(point);
				break;
			}
			*/
			//2) 새로운 객체로 교체하는 방법
			switch(type) {
			case "silver":
				for(int i=index;i<sIndex-1;i++) {
					sMembers[i] = sMembers[i+1];
				}
				sMembers[--sIndex] = null;				
				break;
			case "gold":
				for(int i=result.getIndex();i<gIndex-1;i++) {
					gMembers[i] = gMembers[i+1];
				}
				gMembers[--gIndex] = null;				
				break;
			case "vip":
				for(int i=index;i<vIndex-1;i++) {
					vMembers[i] = vMembers[i+1];
				}
				vMembers[--vIndex] = null;				
				break;
			}
			switch(grade) {
			case "silver":
				Silver s = new Silver(grade, name, point);
				sMembers[sIndex] = s;
				sIndex++;
				break;
			case "gold":
				gMembers[gIndex] = new Gold(grade, name, point);
				gIndex++;
				break;
			case "vip":
				vMembers[vIndex++] = new Vip(grade, name, point);
				break;
			}
			System.out.println("정보 수정 완료");
		}
	}//updateMember() 종료
	
	
	public void deleteMember() {
		System.out.println("\n---------- 회원 정보 삭제 ----------\n");
		System.out.print("삭제 할 회원 이름 입력 : ");
		String name = sc.next();
		SearchResult result = searchMember3(name);
		if(result == null) {
			System.out.println("회원 정보를 찾을 수 없습니다.");
		}else {
			String type = result.getType();
			int index = result.getIndex();
			switch(type) {
			case "silver":
				for(int i=index;i<sIndex-1;i++) {
					sMembers[i] = sMembers[i+1];
				}
				sMembers[sIndex-1] = null;
				sIndex--;
				break;
			case "gold":
				for(int i=index;i<gIndex-1;i++) {
					gMembers[i] = gMembers[i+1];
				}
				gIndex--;
				gMembers[gIndex] = null;
				break;
			case "vip":
				for(int i=index;i<vIndex-1;i++) {
					vMembers[i] = vMembers[i+1];
				}
				vMembers[--vIndex] = null;
				break;
			}
			System.out.println("회원 삭제 완료!");
		}
	}//deleteMember() 종료
	
	
	public int searchMember1(String name) {		
		//실버등급 회원에서 이름 조회
		for(int i=0;i<sIndex;i++) {
			Silver s = sMembers[i];
			String searchName = s.getName();
			if(name.equals(searchName)) {
				return i;
			}
		}
		//골드등급 회원에서 이름 조회
		for(int i=0;i<gIndex;i++) {
			String searchName = gMembers[i].getName();
			if(name.equals(searchName)) {
				return i+10;
			}
		}
		//vip등급 회원에서 이름조회
		for(int i=0;i<vIndex;i++) {
			if(name.equals(vMembers[i].getName())) {
				return i+20;
			}
		}
		return -1;
	}//searchMember1() 종료
	
	public int searchMember2(String name) {		
		//실버등급 회원에서 이름 조회
		for(int i=0;i<sIndex;i++) {
			Silver s = sMembers[i];
			String searchName = s.getName();
			if(name.equals(searchName)) {
				searchGrade = "silver";
				return i;
			}
		}
		//골드등급 회원에서 이름 조회
		for(int i=0;i<gIndex;i++) {
			String searchName = gMembers[i].getName();
			if(name.equals(searchName)) {
				searchGrade = "gold";
				return i;
			}
		}
		//vip등급 회원에서 이름조회
		for(int i=0;i<vIndex;i++) {
			if(name.equals(vMembers[i].getName())) {
				searchGrade = "vip";
				return i;
			}
		}
		return -1;
	}//searchMember2() 종료
	
	public SearchResult searchMember3(String name) {	
		
		//검색결과로 되돌려주고싶은 데이터 -> 어느배열인지 구분할 값(String), 해당배열의 인덱스번호(int)
		//되돌려주고싶은 데이터가 여러개인경우 -> 여러개 데이터의 데이터타입이 모두 같으면 -> 배열
		//							-> 여러개 데이터의 데이터타입이 다르면 -> 객체
		//실버등급 회원에서 이름 조회
		for(int i=0;i<sIndex;i++) {
			Silver s = sMembers[i];
			String searchName = s.getName();
			if(name.equals(searchName)) {
				SearchResult result = new SearchResult();
				result.setType("silver");
				result.setIndex(i);
				return result;
			}
		}
		//골드등급 회원에서 이름 조회
		for(int i=0;i<gIndex;i++) {
			String searchName = gMembers[i].getName();
			if(name.equals(searchName)) {
				SearchResult result = new SearchResult();
				result.setType("gold");
				result.setIndex(i);
				return result;
			}
		}
		//vip등급 회원에서 이름조회
		for(int i=0;i<vIndex;i++) {
			if(name.equals(vMembers[i].getName())) {
				SearchResult result = new SearchResult("vip", i);
				return result;
			}
		}
		return null;
	}//searchMember3() 종료
}

















