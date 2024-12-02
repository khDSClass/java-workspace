package kh.java.func;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharStream {
	public void primaryStream() {
		Scanner sc = new Scanner(System.in);
		System.out.print("저장 할 파일명 입력 : ");
		String filename = sc.nextLine();
		//0. 반환할 객체 미리 선언
		FileWriter fw = null;		
		try {
			fw = new FileWriter(filename);//1. 파일생성하고 스트림 연결
			System.out.println("종료는 exit를 입력하세요.");
			while(true) {
				System.out.print("입력 : ");
				String str = sc.nextLine()+"\r\n";
				if(str.equals("exit\r\n")) {
					break;
				}
				//2. 출력메소드 사용
				//문자스트림은 1문자단위로 전송 -> 문자열을 전송하면 내부에서 처리
				fw.write(str);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				//3. 자원반환
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void subStream() {
		Scanner sc = new Scanner(System.in);
		System.out.print("저장 할 파일명 입력 : ");
		String filename = sc.nextLine();
		
		//0. 반환할 객체 선언(보조스트림을 사용하면 자원반환 시 보조스트림만 반환하면 자동으로 주스트림 반환 완료)
		BufferedWriter bw = null;		
		try {
			FileWriter fw = new FileWriter(filename);//1. 주스트림 생성
			bw = new BufferedWriter(fw);//보조스트림생성(보조스트림은 주스트림을 이용해서 생성 -> 주스트림에 기능을 추가)
			System.out.println("종료는 exit를 입력하세요.");
			while(true) {
				System.out.print("입력 : ");
				String str = sc.nextLine();
				if(str.equals("exit")) {
					break;
				}
				bw.write(str);//2. 출력메소드
				bw.newLine();//보조스트림에만 있는 개행처리 메소드
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				//3. 자원반환(보조스트림을 close하면 주스트림도 함께 close가 됨)
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}


















