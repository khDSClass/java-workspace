package kh.java.func;

import java.util.Random;
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
	
	public void motel() {
		Scanner sc = new Scanner(System.in);
		//방을 관리할 배열 -> 방은 총 10개
		//배열 내부의 데이터가 0이면 빈방 / 1이면 손님이 있는 방
		int[] rooms = new int[10];//배열을 할당하면 기본값으로 세팅(정수 -> 0 -> 최초에 모두 빈 방 상태)
		//boolean[] rooms = new boolean[10];//기본값 false(빈방), true 손님있는방, 
		boolean power = true;
		while(power) {
			System.out.println("\n---------- 모텔 관리 프로그램 ----------\n");
			System.out.println("1. 입실");
			System.out.println("2. 퇴실");
			System.out.println("3. 방보기");
			System.out.println("4. 종료");
			System.out.print("선택 >> ");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				//구현순서 2
				System.out.print("몇번방에 입실하시겠습니까?");
				int inRoomNo = sc.nextInt();
				//입실 -> 해당 방의 데이터를 1로 변경
				//입실처리하기전에 해당 방에 손님이 있는지 체크 -> 빈방이면 입실
				if(rooms[inRoomNo-1] == 1) {
					System.out.println(inRoomNo+"번방은 손님이 있습니다.");
				}else {
					rooms[inRoomNo-1] = 1;
					System.out.println(inRoomNo+"번방에 입실했습니다.");
				}
				break;
			case 2:
				//구현순서 3
				System.out.print("몇번방에서 퇴실하시겠습니까?");
				int outRoomNo = sc.nextInt();
				//퇴실 -> 해당 방의 데이터를 0으로 변경
				//퇴실처리하기전에 해당 방에 손님이 있는지 체크 -> 손님이 있으면 퇴실
				if(rooms[outRoomNo - 1] == 1) {
					rooms[outRoomNo - 1] = 0;
					System.out.println(outRoomNo+"번방에서 퇴실했습니다.");
				}else {
					System.out.println(outRoomNo+"번방은 빈방입니다.");
				}
				break;
			case 3:
				//구현순서 1
				for(int i=0;i<rooms.length;i++) {
					if(rooms[i] == 0) {					
						System.out.println((i+1)+"번방은 빈방입니다.");
					}else {					
						System.out.println((i+1)+"번방에는 손님이 있습니다.");
					}
				}
				break;
			case 4:
				power = false;
				break;
			}
		}
	}
	
	public void motel2() {
		Scanner sc = new Scanner(System.in);
		//방을 관리할 배열 -> 방은 총 10개
		//배열 내부의 데이터가 false이면 빈방 / true이면 손님이 있는 방
		boolean[] rooms = new boolean[10];//배열을 할당하면 기본값으로 세팅(논리형 -> false -> 최초에 모두 빈 방 상태)
		boolean power = true;
		while(power) {
			System.out.println("\n---------- 모텔 관리 프로그램 ----------\n");
			System.out.println("1. 입실");
			System.out.println("2. 퇴실");
			System.out.println("3. 방보기");
			System.out.println("4. 종료");
			System.out.print("선택 >> ");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				//구현순서 2
				System.out.print("몇번방에 입실하시겠습니까?");
				int inRoomNo = sc.nextInt();
				//입실 -> 해당 방의 데이터를 true로 변경
				//입실처리하기전에 해당 방에 손님이 있는지 체크 -> 빈방이면 입실
				if(rooms[inRoomNo-1]) {
					System.out.println(inRoomNo+"번방은 손님이 있습니다.");
				}else {
					rooms[inRoomNo-1] = true;
					System.out.println(inRoomNo+"번방에 입실했습니다.");
				}
				break;
			case 2:
				//구현순서 3
				System.out.print("몇번방에서 퇴실하시겠습니까?");
				int outRoomNo = sc.nextInt();
				//퇴실 -> 해당 방의 데이터를 false으로 변경
				//퇴실처리하기전에 해당 방에 손님이 있는지 체크 -> 손님이 있으면 퇴실
				if(rooms[outRoomNo - 1]) {
					rooms[outRoomNo - 1] = false;
					System.out.println(outRoomNo+"번방에서 퇴실했습니다.");
				}else {
					System.out.println(outRoomNo+"번방은 빈방입니다.");
				}
				break;
			case 3:
				//구현순서 1
				for(int i=0;i<rooms.length;i++) {
					if(!rooms[i]) {					
						System.out.println((i+1)+"번방은 빈방입니다.");
					}else {					
						System.out.println((i+1)+"번방에는 손님이 있습니다.");
					}
				}
				break;
			case 4:
				power = false;
				break;
			}
		}
	}
	
	public void exam4() {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];		
		for(int i=0;i<arr.length;i++) {
			System.out.print((i+1)+"번째 숫자 입력 : ");			
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<arr.length-1;i++) {			
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j] < arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		
		/*
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i] > arr[i+1]) {
				int tmp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = tmp;
			}
		}
		for(int i=0;i<arr.length-2;i++) {
			if(arr[i] > arr[i+1]) {
				int tmp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = tmp;
			}
		}
		for(int i=0;i<arr.length-3;i++) {
			if(arr[i] > arr[i+1]) {
				int tmp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = tmp;
			}
		}
		for(int i=0;i<arr.length-4;i++) {
			if(arr[i] > arr[i+1]) {
				int tmp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = tmp;
			}
		}
		*/
		//배열의 0번째칸이랑 배열의 1번째 칸의 데이터를 비교해서 0번째칸이 더 크면
		/*
		if(arr[0] > arr[1]) {
			int tmp = arr[0];
			arr[0] = arr[1];
			arr[1] = tmp;
		}
		
		if(arr[1] > arr[2]) {
			int tmp = arr[1];
			arr[1] = arr[2];
			arr[2] = tmp;
		}
		
		if(arr[2] > arr[3]) {
			int tmp = arr[2];
			arr[2] = arr[3];
			arr[3] = tmp;
		}
		
		if(arr[3] > arr[4]) {
			int tmp = arr[3];
			arr[3] = arr[4];
			arr[4] = tmp;
		}
		*/
		//출력
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
	}
	public void lotto() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("========== 로또 프로그램 ==========");
		int[] userNum = new int[6];
		//사용자 번호를 입력받기
		for(int i=0;i<userNum.length;i++) {
			System.out.print((i+1)+"번째 번호 입력 : ");
			int num = sc.nextInt();
			//로또번호는 입력값에 제약
			//1) 입력한 숫자가 1~45의 숫자여야 함
			//2) 입력한 숫자가 중복되면 안됨
			//위 두 조건을 만족하면 배열에 데이터를 삽입
			//두 조건은 순서가 존재(정상범위 숫자여야 중복가능성이 생기므로)
			if(1 <= num && num <= 45) {
				//1) 제약사항 통과
				//2) 제약검사
				boolean check = true;
				for(int j=0;j<i;j++) {
					if(num == userNum[j]) {
						check = false;
						System.out.println("이미 중복된 숫자입니다.");
						i--;
						break;//중복숫자를 찾으면 그 이후 검사는 의미가 없으므로 중복체크 반복문을 종료
					}
				}
				if(check) {
					userNum[i] = num;
				}
				
			}else {
				//1) 제약사항에 위배
				System.out.println("1~45 범위의 숫자를 입력하세요.");
				i--;
			}
			
		}
		int[] comNum = new int[6];
		//컴퓨터 번호
		for(int i=0;i<comNum.length;i++) {
			int num = r.nextInt(45)+1;
			boolean check = true;
			for(int j=0;j<i;j++) {
				if(num == comNum[j]) {
					check = false;
					i--;
					break;
				}
			}
			if(check) {
				comNum[i] = num;
			}
		}
		//사람 숫자 정렬
		bubbleSort(userNum);
		/*
		for(int i=0;i<userNum.length-1;i++) {			
			for(int j=0;j<userNum.length-1-i;j++) {
				if(userNum[j] > userNum[j+1]) {
					int tmp = userNum[j];
					userNum[j] = userNum[j+1];
					userNum[j+1] = tmp;
				}
			}
		}
		*/
		//컴퓨터 번호 정렬
		bubbleSort(comNum);
		/*
		for(int i=0;i<comNum.length-1;i++) {			
			for(int j=0;j<comNum.length-1-i;j++) {
				if(comNum[j] > comNum[j+1]) {
					int tmp = comNum[j];
					comNum[j] = comNum[j+1];
					comNum[j+1] = tmp;
				}
			}
		}
		*/
		//최종출력
		System.out.println("최종 결과");
		System.out.print("사용자 번호 : ");
		for(int i=0;i<userNum.length;i++) {
			System.out.print(userNum[i]+" ");
		}
		System.out.println();
		System.out.print("당첨 번호 : ");
		for(int i=0;i<comNum.length;i++) {
			System.out.print(comNum[i]+" ");
		}
		System.out.println();
		//맞은 번호 수 체크
		int count = 0;
		for(int i=0;i<userNum.length;i++) {
			for(int j=0;j<comNum.length;j++) {
				if(userNum[i] == comNum[j]) {
					count++;
					break;
				}
			}
		}
		System.out.println("맞은 갯수 : "+count);
		switch(count) {
		case 6:
			System.out.println("1등!");
			break;
		case 5:
			System.out.println("2등!!");
			break;
		case 4:
			System.out.println("3등!!!!!!");
			break;
		default:
			System.out.println("꽝!!!!!!!!!!!!!!!!!!!!!!");
			break;
		}
	}
	
	public void bubbleSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {			
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
	}
	
}




















