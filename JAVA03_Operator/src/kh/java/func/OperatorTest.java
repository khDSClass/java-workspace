package kh.java.func;

import java.util.Scanner;

public class OperatorTest {
	public void test1() {
		//산술연산자(+,-,*,/,%)
		//대입연산자(=)		a = b; -> b라는 값을 a라는 공간(변수)에 대입
		
		//복합대입 연산자 : 산술연산자와 대입연산자가 합쳐진 형태의 연산자
		// +=, -=, *=, /=, %=
		// 산술연산을 한 결과를 바로 변수에 대입까지 하는 연산자
		int num = 10;
		System.out.println("num : "+num);
		num += 5;			//num = num + 5;
		System.out.println("num : "+num);
		num *= 3;			//num = num * 3;
		System.out.println("num : "+num);
	}
	public void test2() {
		int num = 10;
		//증감연산자(++,--) : 단항 연산자 -> 변수 하나에 사용하는 연산자
		System.out.println("num : "+num);
		num++;//num 변수의 값을 1 증가시킴
		System.out.println("num : "+num);
		++num;//num 변수의 값을 1 증가시킴
		System.out.println("num : "+num);
		num--;//num 변수의 값을 1 감소시킴
		System.out.println("num : "+num);
		--num;//num 변수의 값을 1 감소시킴
		System.out.println("num : "+num);
		//증감연산자가 단독으로사용되면 위치가 앞/뒤 상관없이 결과가 동일
		//변수++ : 후위연산 -> 인접연산이 있으면 인접연산을 먼저 수행하고 증감이 동작
		//++변수 : 전위연산 -> 인접연산이 있어도 증감을 먼저 수행하고 인접연산 수행
		//인접연산이 있으면 앞/뒤에 따라서 차이가 발생
		int num1 = 10;
		int num2 = num1++ + 2;
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
		
		
		int a = 10;
		int b = 10;
		int c = (a++) + (++b) + a;
		//a : 11, b : 11, c : 31 or 32
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("c : "+c);
		
	}
	public void test3() {
		//관계연산자( <, >, <=, >=, ==, != )
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		boolean result1 = num1 < num2;
		System.out.println("num1 < num2 : "+result1);
		boolean result2 = num1 > num2;
		System.out.println("num1 > num2 : "+result2);
		boolean result3 = num1 <= num2;
		System.out.println("num1 <= num2 : "+result3);
		boolean result4 = num1 >= num2;
		System.out.println("num1 >= num2 : "+result4);
		boolean result5 = num1 == num2;
		System.out.println("num1 == num2 : "+result5);
		boolean result6 = num1 != num2;
		System.out.println("num1 != num2 : "+result6);
	}
	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("세번째 정수 입력 : ");
		int num3 = sc.nextInt();
		System.out.print("네번째 정수 입력 : ");
		int num4 = sc.nextInt();
		
		boolean result1 = num1 < num2;
		boolean result2 = num3 < num4;
		System.out.println("result1 : "+result1);
		System.out.println("result2 : "+result2);
		
		//&&연산자 기준으로 양쪽의 논리값이 모두 true면 합쳐서 true / 아니면 false
		boolean and = result1 && result2;
		//||연산자 기준으로 양쪽의 논리값 중 1개라도 true면 합쳐서 true / 둘 다 false인 경우 false
		boolean or = result1 || result2;
		//!연산자는 바로 뒤의 논리값을 반전(true->false , false->true)
		boolean not = !result1;
		
		System.out.println("result1 && result2 : "+and);
		System.out.println("result1 || result2 : "+or);
		System.out.println("!result1 : "+not);
		
	}
	
}









