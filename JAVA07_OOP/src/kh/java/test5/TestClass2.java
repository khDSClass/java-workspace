package kh.java.test5;



public class TestClass2 extends TestClass1{
	//추상클래스를 상속하면 바로 에러발생 -> 내부의 미완성된 메소드가 존재 -> 오버라이딩 강제화
	
	//상속받은 메소드 중 추상메소드를 반드시 구현해야 해당 클래스로 객체 사용 가능
	@Override
	public void testMethod2() {
		System.out.println("test - 2");
	}

}
