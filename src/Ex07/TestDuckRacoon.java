package Ex07;

interface Duck {
	void swim();
}

interface Racoon {
	void dig();
}

class DuckRacoon implements Duck, Racoon {

	@Override
	public void dig() {
		System.out.println("땅을 판다");
		
	}

	@Override
	public void swim() {
		System.out.println("헤엄 친다");
		
	}
	
}

public class TestDuckRacoon {

	public static void main(String[] args) {

		DuckRacoon  dr = new DuckRacoon();
		System.out.println(dr.toString());
		System.out.println(dr.hashCode());
		System.out.println(dr.getClass());

		// 모든 자바의 class는 Object class를 상속받아서 만들어짐
		Object obj = new Object();
		System.out.println(obj.toString());
		System.out.println(obj.hashCode()); // heap 메모리의 위치
		System.out.println(obj.getClass());
		
	}

}
