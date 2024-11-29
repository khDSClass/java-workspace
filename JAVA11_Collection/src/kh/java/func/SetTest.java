package kh.java.func;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SetTest {
	public void test1() {
		HashSet<Integer> set = new HashSet<Integer>();
		System.out.println("set 내부의 데이터 수 : "+set.size());
		//add(param1) : 파라미터로 받은 데이터를 set에 추가하고 그 결과를 되돌려줌
		boolean b1 = set.add(10);
		System.out.println(b1);
		System.out.println("set 내부의 데이터 수 : "+set.size());
		System.out.println(set);
		b1 = set.add(20);
		System.out.println(b1);
		System.out.println(set);
		set.add(30);
		set.add(100);
		set.add(200);
		set.add(1000);
		set.add(50);
		System.out.println(set);
		b1 = set.add(20);
		System.out.println(b1);
		System.out.println(set);
		//remove(param1) : 파라미터로 받은 데이터를 set에서 삭제하고, 그결과를 되돌려줌
		b1 = set.remove(100);
		System.out.println(b1);
		System.out.println(set);
		b1 = set.remove(30);
		System.out.println(b1);
		System.out.println(set);
		//set은 여러데이터를 index관리하지 않음
		// -> 여러 데이터 중 특정 데이터에 접근할 방법이 없음 -> 수정이라는 개념이 없음
		// -> 수정이 필요하면 기존데이터를 삭제 -> 새데이터를 추가
		// -> 특정데이터 하나만 꺼내올 방법이 없음
		// -> 데이터를 꺼내는 방법
		
		//1) 반복자(iterator)를 이용한 방법
		Iterator<Integer> iter = set.iterator();
		//next() : 값 한개를 꺼내옴
		//hasNext() : 꺼내올 값이 남아있으면 true / 없으면 false를 리턴하는 메소드
		while(iter.hasNext()) {
			int num = iter.next();
			System.out.println(num);
		}
		System.out.println("------------------------");
		/*
		int num = iter.next();
		System.out.println(num);
		num = iter.next();
		System.out.println(num);
		num = iter.next();
		System.out.println(num);
		*/
		//2) foreach 사용
		for(int num : set) {
			System.out.println(num);
		}
		
		//3) HashSet을 ArrayList로 변환 : ArrayList객체 생성 시 생성자에 Set을넣으면 ArrayList로 반환
		ArrayList<Integer> list = new ArrayList<Integer>(set);
		System.out.println(set);
		System.out.println(list);
		set.add(2212);
		list.add(2212);
		System.out.println(set);
		System.out.println(list);
	}
	public void test2() {
		HashSet<TestData> set = new HashSet<TestData>();
		TestData td1 = new TestData(10, "hi");
		set.add(td1);
		System.out.println(set);
		TestData td2 = new TestData(20, "bye");
		set.add(td2);
		System.out.println(set);
		TestData td3 = new TestData(10, "hi");
		set.add(td3);
		System.out.println(set);
		TestData td4 = td2;
		set.add(td4);
		System.out.println(set);
	}
	public void lotto() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.println("\n---------- 로또 프로그램 ----------\n");
		HashSet<Integer> userSet = new HashSet<Integer>();
		while(userSet.size() < 6) {
			System.out.print((userSet.size()+1)+"번째 번호 입력 : ");
			int num = sc.nextInt();
			if(1<=num && num<=45) {				
				boolean result = userSet.add(num);
				if(!result) {
					System.out.println("이미 중복된 번호입니다.");
				}
			}else {
				System.out.println("1~45 범위의 숫자를 입력하세요.");
			}
		}
		HashSet<Integer> comSet = new HashSet<Integer>();		
		while(comSet.size()<6) {
			int rNum = r.nextInt(6)+1;
			comSet.add(rNum);
		}
		ArrayList<Integer> userNum = new ArrayList<Integer>(userSet);
		ArrayList<Integer> comNum = new ArrayList<Integer>(comSet);
		Collections.sort(userNum);
		Collections.sort(comNum);
		System.out.println(userNum);
		System.out.println(comNum);
		int totalCount = 0;
		for(int uNum : userSet) {
			boolean result = comSet.add(uNum);
			if(!result) {
				totalCount++;
			}
		}
		System.out.println("맞은 갯수 : "+totalCount);
		/*
		for(int i=0;i<userNum.size();i++) {
			int uNum = userNum.get(i);
			if(comNum.indexOf(uNum) != -1) {
				totalCount++;
			}
		}
		
		for(int uNum : userNum) {
			if(comNum.contains(uNum)) {
				totalCount++;
			}
		}
		*/
	}
}






















