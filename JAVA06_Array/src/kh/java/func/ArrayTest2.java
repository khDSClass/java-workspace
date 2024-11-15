package kh.java.func;

public class ArrayTest2 {
	public void test1() {
		int num1 =  100;
		System.out.println("num1 : "+num1);	//100
		int num2 = num1;
		System.out.println("num2 : "+num2);	//100
		
		System.out.println("num1 : "+num1);	//100
		num2 = 200;
		System.out.println("num2 : "+num2); //200
		System.out.println("num1 : "+num1);	//100
		
		int[] arr1 = {1,2,3,4,5};
		System.out.println("arr1 출력");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+"\t");
		}
		System.out.println();
		int[] arr2 = arr1;
		System.out.println("arr2 출력");
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+"\t");
		}
		System.out.println();
		
		arr1[2] = 300;
		System.out.println("arr1 출력");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+"\t");
		}
		System.out.println();
		
		System.out.println("arr2 출력");
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+"\t");
		}
		System.out.println();
		
		arr2[3] = 400;
		System.out.println("arr2 출력");
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+"\t");
		}
		System.out.println();
		System.out.println("arr1 출력");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+"\t");
		}
		System.out.println();
	}
	public void test2() {
		int[] arr1 = {1,2,3,4,5};
		//배열 깊은복사
		//1) 직접 복사하는 방법
		int[] arr2 = new int[arr1.length];//원본배열과 같은 길이 & 같은자료형의 배열을 새로 생성
		for(int i=0;i<arr1.length;i++) {
			arr2[i] = arr1[i];
		}
		System.out.println("arr1 출력");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+"\t");
		}
		System.out.println();
		System.out.println("arr2 출력");
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+"\t");
		}
		System.out.println();
		arr1[2] = 300;
		arr2[3] = 400;
		System.out.println("arr1 출력");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+"\t");
		}
		System.out.println();
		System.out.println("arr2 출력");
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+"\t");
		}
		System.out.println();
	}
}













