package ex04;


class Pet {
	String name;
	void 	eat() {
		System.out.println(name + "(이)가 먹는다");

	}
}

class Dog extends Pet{ // Dog = Dog + Pet
	void	bark() {
		System.out.println(name + "(이)가 멍멍");
	}

}

class Cat extends Pet{
	void	meow() {
		System.out.println(name + "(이)가 야옹");
	}
}
	
class Tiger extends Pet {
	void	cry() {
		System.out.println(name + "(이)가 어흥");
	}
}

	


public class TestAnimalInherit {

	// 상속 -> inherit -> java 에서는 extends 로 처리
	// 다중 상속 불가능(상속은 한개만 가능) -> java, C#
	public static void main(String[] args) {
			
		Dog dog = new Dog();
		work(dog, "츄");
//		dog.name = "츄";
//		dog.eat();
//		dog.bark();
		System.out.println("==============");
		
		Cat nero = new Cat();
		work(nero, "네로");
//		nero.name = "네로";
//		nero.eat();
//		nero.meow();
		System.out.println("==============");
		
		Tiger  tiger = new Tiger();
		work(tiger, "큰냥이");
		
		/*
		Pet pet  = new Pet();
		pet.name = "뻐금이";
		pet.eat();
		System.out.println("==============");
		*/
		// pet.bark();  // error
		// pet.meow();
	}
	
	//한 개의 work 함수로 업무 처리
	private static void work(Pet pet, String name) {
		pet.name = name;
		System.out.println("work:");
		pet.eat();
		
		if(pet instanceof Dog)
			((Dog) pet).bark();
		if(pet instanceof Cat)
			((Cat) pet).meow();
		if(pet instanceof Tiger)
			((Tiger) pet).cry();
		
	}
	
//	private static void work(Cat nero, String name) {
//		nero.name = name;
//		nero.eat();
//		nero.meow();
//		
//	}
//
//	private static void work(Dog dog, String name) {
//		dog.name = name;
//		dog.eat();
//		dog.bark();	
//	}

}
