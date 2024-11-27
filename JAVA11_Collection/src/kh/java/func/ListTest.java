package kh.java.func;

import java.util.ArrayList;
import java.util.Scanner;

public class ListTest {
	public void test1() {
		//길이가 3인 문자열 배열
		String[] arr = new String[3];//배열은 객체를 생성할 때 길이를 지정해주어야함
		//문자열을 관리한 리스트생성 제네릭으로 자료형을 지정
		ArrayList<String> list = new ArrayList<String>();//리스트는 객체를 생성할 때 길이를 지정하지 않음
		
		System.out.println("배열의 길이 : "+arr.length);
		//배열에 값 대입
		arr[0] = "hi";
		arr[1] = "hello";
		arr[2] = "안녕";
		//arr[3] = "추가";	//지정된 길이를 초과해서 데이터를 저장 할 수 없음
		System.out.println("배열의 길이 : "+arr.length);
		
		//List의 size()메소드는 현재 리스트의 길이를 리턴
		System.out.println("리스트 길이 : "+list.size());
		//리스트에 데이터를 추가할때 add()메소드로 추가
		list.add("hi");
		System.out.println("리스트 길이 : "+list.size());
		list.add("hello");
		System.out.println("리스트 길이 : "+list.size());
		list.add("안녕");
		System.out.println("리스트 길이 : "+list.size());
		list.add("추가");		//리스트는 처음에 길이를 지정하지 않고, 추가할때마다 길이가 늘어나는 형태
		System.out.println("리스트 길이 : "+list.size());
		
		//배열에서 데이터를 가져오는 방법 : 배열이름[인덱스번호]
		System.out.println(arr[1]);
		//리스트에서 데이터를 가져오는 방법 : 리스트이름.get(인덱스번호)
		System.out.println(list.get(2));
		
		//배열 전체 출력
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		//리스트 전체 출력
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+"\t");
		}
		System.out.println();
		
	}
	public void test2() {
		Scanner sc = new Scanner(System.in);
		//정수를 저장하는 리스트 생성 -> 정수는 기본자료형
		//List는 관리할 데이터의 타입을 제네릭으로 결정 -> 제네릭은 기본자료형을 사용할 수 없음
		//정수도 객체로 관리해야 제네릭적용가능 -> Wrapper클래스 (int -> Integer)
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(true) {
			System.out.print("리스트에 추가 할 숫자 입력 : ");
			int num = sc.nextInt();
			list.add(num);
			System.out.print("한번 더 입력하시겠습니까[y/n] ? ");
			String select = sc.next();
			if(select.toLowerCase().equals("n")) {
				break;
			}
		}
		//입력받은 수 전체 출력
		/*
		for(int i=0;i<list.size();i++) {
			Integer num = list.get(i);
			System.out.println(num);
		}
		*/
		//foreach : 컬렉션을 전체 순회하는 반복문
		//사용하는경우
		//1. 컬렉션 값을 처음부터 끝까지 전부 돌아봐야 할 때
		//2. i값이 데이터를 꺼내오는 목적외에는 사용되지 않을때
		for(Integer num : list) {
			System.out.println(num);
		}
	}
	

}






















