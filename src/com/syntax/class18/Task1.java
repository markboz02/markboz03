package com.syntax.class18;
//1.write a program that will have a constructor:
//one with parameters and second without any parameters.
//create a seperate Test class where you will execute both of the constructors.

//2.Write a java program of class students that takes students name and 3 subject grades.
//inside your class also have a method to calculate avarage grade.
//test student class 5 different students with different marks.
//your program should print an average mark of each students name.
public class Task1 {
	String name;
	int grade1, grade2, grade3;
	
	Task1(String studentName, int studentGrade1, int studentGrade2, int studentGrade3){
		name = studentName;
		grade1 = studentGrade1;
		grade2 = studentGrade2;
		grade3 = studentGrade3;
	}
	
	public int gradeAverage() {
		int total = grade1 + grade2 + grade3;
		int average = total / 3;
		return average;
	}
	
	public static void main(String[] args) {
		Task1 obj1 = new Task1("Ali", 80, 88, 90);
		System.out.println("Student " + obj1.name + " avarage grade is " + obj1.gradeAverage());
		
		Task1 obj2 = new Task1("Ahmet", 85, 78, 90);
		System.out.println("Student " + obj2.name + " avarage grade is " + obj2.gradeAverage());
		
		Task1 obj3 = new Task1("Abdullah", 90, 82, 95);
		System.out.println("Student " + obj3.name + " avarage grade is " + obj3.gradeAverage());
	}

}
