package com.lombok.demo.builer_with_lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Demo {
	
	public static void main(String[] args) {
			Employee employee = Employee.builder().name("Sam").age(33).build();
	}
}


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
class Employee{
	private String name;
	private int age;
}