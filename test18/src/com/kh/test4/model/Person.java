package com.kh.test4.model;

public class Person {
	private  String naem;
	private int age;
	public Person() {}
	public Person(String naem, int age) {
		super();
		this.naem = naem;
		this.age = age;
	}
	public String getNaem() {
		return naem;
	}
	public void setNaem(String naem) {
		this.naem = naem;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [naem=" + naem + ", age=" + age + "]";
	}
	

}
