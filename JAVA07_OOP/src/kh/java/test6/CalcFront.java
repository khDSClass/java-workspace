package kh.java.test6;

import java.util.Scanner;

public class CalcFront {
	public void view() {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		for(int i=0;i<arr.length;i++) {
			System.out.print("정수 입력 : ");
			arr[i] = sc.nextInt();
		}
		Calc calc = new CalcBack();
		//CalcBack calc = new CalcBack();
		int result = calc.sum(arr);
		System.out.println("결과 : "+result);
	}
}





