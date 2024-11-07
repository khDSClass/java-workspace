package kh.java.func;
import java.util.Scanner;

public class ScanTest {
	public void test1() {
		Scanner sc = new Scanner(System.in);		
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();//사용자가 콘솔에 숫자를 입력하기를 기다림, 입력하고 엔터치면 입력한값을 정수타입으로 가져옴
		System.out.println("입력한 정수 값은 : "+num);
		//실수입력을 하고싶으면?
		System.out.print("실수를 입력하세요 : ");
		double num2 = sc.nextDouble();
		System.out.println("입력한 실수 값은 : "+num2);
		//논리형,문자,문자열
		System.out.print("문자열 입력 : ");
		String str = sc.next();//사용자가 콘솔에 문자열을 입력하기를 기다리다가 
								//입력하면 입력받은 문자열을 가져옴(단, 띄어쓰기 불가능)
		System.out.println("입력한 문자열은 : "+str);
		
		System.out.print("띄어쓰기를 포함한 문자열 입력 : ");
		sc.nextLine();//버퍼에 남은 엔터처리용
		String str2 = sc.nextLine();
		System.out.println("입력한 문자열은 : "+str2);
	}
	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		//이름(문자열->String) / 나이(정수->int) / 주소(문자열->String) 입력받기
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();//문자열을 입력받으려면 sc.next(),sc.nextLine() 둘 중 띄어쓰기없는 next()		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();		
		System.out.print("주소를 입력하세요 : ");
		sc.nextLine();
		String address = sc.nextLine();
		//문자 입력받는 방법
		//성별입력(남/여 -> char)
		//Scanner에 문자를 직접 입력받는 방법은 없음 -> 문자열을 입력받고 입력받은 문자열에서 문자 추출
		System.out.print("성별입력(남/여) : ");
		String genderString = sc.next();
		char gender = genderString.charAt(0);//문자열.charAt(n) : 문자열 중 n번째 글자를 문자로 추출
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("주소 : "+address);
		System.out.println("성별 : "+gender);
	}
	public void exam1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();		
		System.out.print("주소 입력 : ");
		sc.nextLine();
		String address = sc.nextLine();
		System.out.print("키 입력 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게 입력 : ");
		double weight = sc.nextDouble();
		System.out.print("성별 입력 : ");
		String genderString = sc.next();
		char gender = genderString.charAt(0);
		//키는 정수로변환, 몸무게는 첫째자리까지만 출력
		System.out.println("이름 : " +name);
		System.out.print("나이 : "+age);
		System.out.println();
		System.out.printf("주소 : %s\n",address);
		int intHeight = (int)height;
		System.out.println("키 : "+intHeight);
		System.out.printf("몸무게 : %.1f",weight);
		System.out.println("\n성별 : "+gender);
	}
	public void exam2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 입력 : ");
		int kor = sc.nextInt();
		System.out.print("수학점수 입력 : ");
		int math = sc.nextInt();
		System.out.print("영어점수 입력 : ");
		int eng = sc.nextInt();
		
		int sum = kor+math+eng;
		
		double avg = sum/3.0;
		
		System.out.printf("당신 성적의 총 합은 %d점이고 평균은 %.2f 입니다!",sum,avg);
	}
}











