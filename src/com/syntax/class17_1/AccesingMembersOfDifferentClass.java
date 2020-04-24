package com.syntax.class17_1;

import com.syntax.class17.Employee;

public class AccesingMembersOfDifferentClass {

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.name="Ahmet";
		//below variables not available due to restrictions
		//emp.lastName -->protected
		//emp.salary ---->default
        //emp.ssn   ----->private
		
		emp.method1();
		//below methods not available due to restrichtions
//		emp.method2();-->protected
//		emp.method3();-->default
//		emp.method4();-->private
	}

}
