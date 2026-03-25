package Ex08;

public class TestException {

	public static void main(String[] args) {
		/*
		int n1 = 7;
		//int n2 = 2;
		int n2 = 0;
		int n = n1 / n2; // 정수 / 정수 -> 정수 3
		System.out.println(n);
		System.out.println("프로그램 종료");
		
		// 예외처리(Exception Handling)
		/// 예외 - 실행 중에 발생하는 오류

		*/
		
		try {
			int n1 = 7;
			int n2 = 0;
			int n = n1 / n2;
			System.out.println( n );
			
		} catch(ArithmeticException e) { // 오류 발생 시 처리방법
			System.out.println("계산 오류:" + e); 
		} catch(Exception e) {
			System.out.println("오류 발생:" + e); 
		} finally { // 오류와 상관없이 무조건 실행
			System.out.println("프로그램 종료");
		}
		
		
	}

}
