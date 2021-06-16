package com.test04;

public class MTest {
	
	public static void main(String[] args) {
		Animal cat = new Cat();
		cat.bark();
		cat.eat("참치");
		
		Animal dog = new Dog();
		dog.bark();
		dog.eat("육포");
		
		Animal eagle = new Eagle();
		eagle.bark();
		eagle.eat("새");
		((Eagle)eagle).fly();
	}
}
