package com.syntax.class22;

public class Parent {
	
	Parent(){
		System.out.println("Parent class constructor");
	}
	
	private void hello() {
		System.out.println("Hello from parent class");
	}
	
	static void bye() {
		System.out.println("Bye from parent class");
	}

}

class Child extends Parent {
	//we are not overriding , we just declaring private method inside the child class
	//@Override
	
	Child(){
		System.out.println("Child class constructor");
	}
	
	private void hello() {
		System.out.println("Hello from child class");
	}
	
//	
//	private void bye() {
//		System.out.println("Bye from a child");
//	}
}
