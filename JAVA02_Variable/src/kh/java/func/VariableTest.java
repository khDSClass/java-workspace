package kh.java.func;

public class VariableTest {
	public void test1() {
		
		//변수 선언 방법 : 자료형 변수이름;
		//1. 논리형(boolean) 변수 선언
		boolean bool;
		//2. 문자형(char) 변수 선언
		char ch;
		
		//bool변수를 선언한 후 값을 대입한적이 없음 -> 변수가 초기화 되지 않음
		//변수는 초기화를해야 사용이 가능
		//초기화 : 변수에 최초로 값을 대입
		//프로그래밍 언어에서 = 기호는 같다가아니라 대입연산자
		//A=B; -> B라는값을 A라는 변수에 대입한다.
		bool = true;//true라는 값을 bool이라는 변수에 대입
		System.out.println(bool);
		
		ch = 'a';
		System.out.println(ch);
		
		//3. 정수형(int) 변수 선언, 변수이름 number1 / 값 100으로 초기화 / 출력
		int number1;
		number1 = 100;
		System.out.println(number1);
		
		//4. 실수형(double) 변수 선언, 변수이름 number2 / 값은 3.14로 초기화 / 출력
		double number2;
		number2 = 3.14;
		System.out.println(number2);
		
		System.out.println(number1 + number2);
		
		System.out.println(number1 + ch);
		
		double number3 = 3.14;
	}
	public void test2() {
		//정수형(byte) 변수 number1 선언하고 값 100을 대입
		byte number1;
		number1 = 100;
		System.out.println(number1);
		//number1 = 200;//byte의 표현범위를 초과한 숫자는 대입불가능
		short number2;
		number2 = 32000;
		System.out.println(number2);
		number2 = 120;
		//number2 = 33000;
		long number3 = 1000;
		number3 = 12345678912l;
		
		float number4 = 3.14f;
		
		final double PI;
		PI = 3.14;
		//pi = 3.15; //상수형 변수는 한번 저장된 값이 변경되지 않음
		
	}
	public void test3() {
		int number1 = 200;
		byte number2 = (byte)number1;
		System.out.println(number2);
		int number3 = 2147483647;
		long number4 = (long)number3 + 1;
		System.out.println(number4);//2147483648
	}
	public void test4() {
		//System.out.println() : 괄호 안의 내용을 출력하고 개행
		//System.out.print() : 괄호 안의 내용을 출력
		System.out.println("안녕하세요 ");
		System.out.println("제 이름은 ");
		System.out.println("이윤수 입니다.");
		
		System.out.print("안녕하세요 ");
		System.out.println();
		System.out.print("제 이름은 ");
		System.out.print("이윤수 입니다.");
		
		System.out.println("만나서 반가워요!");
		/*
		 자바 자료형
		 논리형(boolean), 문자(char), 정수(int,long), 실수(float, double)
		 문자열(String)
		 */
		//변수를 3개 선언(이름(String)/나이(int)/주소(String))
		
		//최종출력
		//안녕하세요 제 이름은 이윤수이고, 나이는 38살 사는곳은 서울입니다.
	}
	public void test5() {
		String name;
		name = "이윤수";
		int age = 38;
		String address = "서울";
		System.out.print("안녕하세요 제 이름은 ");
		System.out.print(name);
		System.out.print("이고, 나이는 ");
		System.out.print(age);
		System.out.print("살 사는곳은 ");
		System.out.print(address);
		System.out.println("입니다.");
		
		System.out.println("안녕하세요 제 이름은 "+name+"이고, 나이는 "+age+"살 사는곳은 "+address+"입니다.");
		
		//System.out.printf();
		System.out.printf("안녕하세요 제 이름은 %s이고, 나이는 %d살 사는곳은 %s입니다.",name,age,address);
	}
	public void test6() {
		int num = 100;
		System.out.println("정수는 : "+num);
		System.out.printf("정수는 : %d",num);
		System.out.println();
		System.out.printf("정수는 : %d",200);
		System.out.println();
		char ch = 'A';
		System.out.printf("문자는 : %c",ch);
		System.out.println();
		String name = "이윤수";
		System.out.printf("문자열은 : %s",name);
		System.out.println();
		double number = 3.141528237;
		System.out.printf("실수는 : %f",number);
		System.out.println();
		System.out.printf("실수는 : %.2f",number);
		System.out.println();
		System.out.printf("%d%c%s%f",num,ch,name,number);
		System.out.println();
		int number2 = 100;
		//오늘 우리반 출석률은 100%입니다.
		System.out.printf("오늘 우리반 출석률은 %d%%입니다.",number2);
		System.out.println();
		System.out.println("오늘 우리반 출석률은 "+number2+"%입니다.");
		//print, println, printf
		//제이름은 "이윤수" 입니다.
		System.out.println("제이름은 \"이윤수\" 입니다.");
		System.out.println("제이름은 \t이윤수 \n 입니다.");
	}
	public void exam1() {
		//정수형 100
		int num1 = 100;
		//정수형 999900000000
		long num2 = 999900000000l;
		//실수형 486.520(float)
		float num3 = 486.520f;
		//실수형 5697.890123
		double num4 = 5697.890123;
		//문자 A
		char ch = 'A';
		//문자열 Hello JAVA
		String str = "Hello JAVA";
		//논리 true
		boolean bool = true;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(ch);
		System.out.println(str);
		System.out.println(bool);
		
		System.out.printf("%d\t%d\t%.3f\t%f\t%c\t%s\t%b",num1,num2,num3,num4,ch,str,bool);
		
	}
	public void exam2() {
		//이름,나이,성별,주소,전화번호,이메일
		String name = "홍두깨";
		int age = 22;
		char gender = '남';
		String addr = "서울";
		String phone = "01012345678";
		String email = "myemail@email.com";
		/*
		String name2 = "고길동";
		int age2 = 50;
		char gender2 = '남';
		String addr2 = "경기도";
		String phone2 = "01098765432";
		String email2 = "mrgogo@email.com";
		*/
		System.out.println("이름\t나이\t성별\t지역\t전화번호\t\t이메일");
		System.out.println("-------------------------------------------------------------------");
		System.out.printf("%s\t%d\t%c\t%s\t%s\t%s",name,age,gender,addr,phone,email);
		System.out.println();
		System.out.println("-------------------------------------------------------------------");
		name = "고길동";
		age = 50;
		gender = '남';
		addr = "경기도";
		phone = "01098765432";
		email = "mrgogo@email.com";
		System.out.printf("%s\t%d\t%c\t%s\t%s\t%s",name,age,gender,addr,phone,email);
		//System.out.printf("%s\t%d\t%c\t%s\t%s\t%s",name2,age2,gender2,addr2,phone2,email2);
		
		//이거보여요
		
	}
}








