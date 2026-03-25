package ex05;

abstract class Pet {// 한개이상의 abstract 메소드가 있다면 abstract class
	String name;
	void 	eat() {
		System.out.println(name + "(이)가 먹는다");
	}
	abstract void sound(); // 함수의 {}가 없으면 abstract 필수
}

class Dog extends Pet{ // Dog = Dog + Pet
	
	// 코딩이 없는 함수를 상속받으면 반드시 자식이 코딩을 구현해야 한다 - 재정의(override)
	 // Add Unimplemented method
	@Override // 재정의
	void sound() {
		System.out.println(name + "(이)가 멍멍");
		
	}
	

}

class Cat extends Pet{
	@Override
	void sound() {
		System.out.println(name + "(이)가 야옹");
		
	}
	

	
}

public class TextAnimal {
	// Pet pet    = new Pet();  // 오류 :abstract 가 있으면 new 불가능
	public static void main(String[] args) {
		
		Dog dog1  =  new Dog();
		work(dog1, "츄");
//		dog1.name = "츄";
//		dog1.eat();
//		dog1.sound();
		
		
		
		Cat cat1  = new Cat();
		work(cat1, "네로");
//		cat1.name = "네로";
//		cat1.eat();
//		cat1.sound();
		
	
	}
	
	// 방법 2
	// work 한 개로 통일
	// 부모 클래스는 자식 클래스를 담을 수 있다 
	// Pet pet = new Pet(); Dog dog1 = pet; // 오류 
	// 자식 클래스는 부모 클래스를 담을 수 없다 Pet pet = dog1; Pet pet = cat1;
	private static void work(Pet pet, String name) {
		pet.name = name;
		pet.eat();
		pet.sound();
		
	}
	
	
	// ---------------------------------------------------
	/*
	// 방법 1: 함수의 오버로드 기능 활용
	private static void work(Cat cat1, String name) {
		cat1.name = "name";
		cat1.eat();
		cat1.sound();
		
	}

	private static void work(Dog dog1, String name) {
		dog1.name = "name";
		dog1.eat();
		dog1.sound();
		
	}
	// ---------------------------------------------------
	 */


}
