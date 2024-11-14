package kh.java.func;

import java.util.Scanner;

public class ArrayTest {
	public void test1() {
		//1,2,3,4,5 라는 5개의 데이터를 각각 저장하고 출력
		//1) 변수를 이용해서 처리
		int num0 = 1;
		int num1 = 2;
		int num2 = 3;
		int num3 = 4;
		int num4 = 5;
		System.out.println("변수를 이용한 값 출력");
		System.out.println(num0);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		//2) 배열을 이용해서 처리
		//배열 선언 방법
		//자료형[] 변수이름 = new 자료형[배열길이];
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		System.out.println("배열을 이용한 값 출력");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println("for문을 이용한 값 출력");		
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]);
		}		
	}
	
	public void test2() {
		//길이가 5인 정수배열을 선언해서 순서대로 1,2,3,4,5 저장 한 후 출력
		int[] arr1;
		arr1 = new int[5];//배열에 길이를 지정하는 행위 -> 할당
		//배열은 할당하면 기본값으로 데이터가 초기화 되어 있음
		//기본값 : 정수(0), 실수(0.0), 문자(' '), 논리형(false), 참조형(null -> 주소값이 비어있어)
		for(int i=0;i<5;i++) {
			System.out.println(i + " : " + arr1[i]);
		}
		for(int i=0;i<5;i++) {
			arr1[i] = i+1;
		}
		/*
		arr1[0] = 1;		
		arr1[1] = 2;
		arr1[2] = 3;		
		arr1[3] = 4;
		arr1[4] = 5;
		*/
		System.out.println("----------------------------------------------");
		for(int i=0;i<5;i++) {
			System.out.println(i + " : " + arr1[i]);
		}
		System.out.println("----------------------------------------------");
		//길이가 5인 정수배열을 선언해서 순서대로 1,2,3,4,5 저장 한 후 출력
		int[] arr2 = {1,2,3,4,5};//배열 선언하면서 바로 값을 대입
		for(int i=0;i<5;i++) {
			System.out.println(i + " : " + arr2[i]);
		}
		System.out.println("----------------------------------------------");
		String[] arr3 = new String[3];
		arr3[0] = "hello";
		arr3[1] = "hi";
		arr3[2] = "bye";
		for(int i=0;i<3;i++) {
			System.out.println(i + " : " + arr3[i]);
		}
	}
	
	public void exam1() {
		String[] arr1 = new String[5];
		arr1[0] = "딸기";
		arr1[1] = "복숭아";
		arr1[2] = "키위";
		arr1[3] = "사과";
		arr1[4] = "바나나";
		String[] arr2 = {"딸기","복숭아","키위","사과","바나나"};
		
		System.out.println("1-1.");
		System.out.println(arr1[4]);
		System.out.println(arr2[4]);
		System.out.println("1-2.");
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);
		
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println(arr2[3]);
		System.out.println(arr2[4]);
		System.out.println("1-3.");
		for(int i=0;i<5;i++) {
			System.out.println(arr2[i]);
		}
	}
	public void exam2() {
		int[] arr = new int[100];
		/*
		 arr[0] = 1;
		 arr[1] = 2;
		 arr[2] = 3;
		 ...
		 arr[99] = 100;
		
		
		 arr[1] = 2;
		 arr[2] = 3;
		 arr[3] = 4;
		 ...
		 arr[100] = 101;
		 
		for(int i=1;i<=100;i++) {
			arr[i-1] = i;
		}
		 */
		
		for(int i=0;i<100;i++) {
			arr[i] = i+1;			
		}
		
		for(int i=0;i<100;i++) {
			System.out.println(i+"_"+arr[i]);
		}		
	}
	public void exam3() {
		int[] arr1 = new int[4];
		String[] arr2 = {"국어","영어","수학"};
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.print(arr2[i]+" 점수 입력 : ");
			arr1[i] = sc.nextInt();
		}
		/*
		System.out.print(arr2[0]+" 점수 입력 : ");
		arr1[0] = sc.nextInt();
		
		System.out.print(arr2[1]+" 점수 입력 : ");
		arr1[1] = sc.nextInt();
		
		System.out.print(arr2[2]+" 점수 입력 : ");
		arr1[2] = sc.nextInt();
		*/
		arr1[3] = arr1[0]+arr1[1]+arr1[2];
		System.out.println("국어 점수 : "+arr1[0]);
		System.out.println("영어 점수 : "+arr1[1]);
		System.out.println("수학 점수 : "+arr1[2]);
		System.out.println("합계 : "+arr1[3]);
		System.out.printf("평균 : %.2f",arr1[3]/(double)3);
	}
}




















