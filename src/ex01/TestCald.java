package ex01;

public class TestCald {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n1 = 7;
			int n2 = 2;
			int result;
			result = add(7, 2);
			System.out.println(result);
			
			result = add(n1, n2, 5);
			System.out.println(result);
	}
	
	// 객체 지향 프로그램의 overloading이라고 한다
	// 함수의 signature가 다르면 여러 개 만들 수 있다
	private static int add(int v1, int v2, int v3) {
		// TODO Auto-generated method stub
		return v1 + v2 + v3;
	}

	private static int add(int v1, int v2) {
		// TODO Auto-generated method stub
		return v1 + v2;
	}

}
