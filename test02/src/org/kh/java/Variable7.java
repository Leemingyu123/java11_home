package org.kh.java;

public class Variable7 {

	public static void main(String[] args) {
			String name = "이민규";
			Integer age = 31;
			String age2 = "31";
			int age3 = Integer.parseInt(age2)+ 8;
			Float height = 177.1f;
			String height2 = "177.1";
			float height3 = Float.parseFloat(height2);
//			boolean pass = true;
			Double weight = 74.5;
			
			System.out.println("age : "+age3);
			System.out.println("name : "+name.getClass().getName());
			System.out.println("age : "+age.getClass().getName());
			System.out.println("height : "+height.getClass().getName());
			System.out.println("weight : "+weight.getClass().getName());
			//primitive type => Wrapper type = boxing
			//Wrapper type => primitive type = unboxing
	}

}
