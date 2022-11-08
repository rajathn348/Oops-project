package com;

public class Stu {
	private int age;
	public void setAge(int age) {
	 if (age>0) {
		 this.age=age;
		 System.out.println("age initialized");
	 }
	 else {
		 System.out.println("invalid age");
	 }
	}
	public int getAge() {
		return age;
	}

}
