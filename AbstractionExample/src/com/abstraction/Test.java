package com.abstraction;

public class Test extends Demo{
	
	Test(){
		super();
	}
	
	@Override
	public void m2() {
		System.out.println("overrided m2 method of demo class");
		
	}
	@Override
	public String m3() {
		
		return "Devyani";
	}
	public static void main(String[] args) {
		Test t = new Test(); //here we create object of child class and call constructor which initialize global var
		t.i = 34;
		System.out.println(t.i);  
		
		
		 // Demo d = new Demo();
		   Demo e = new Test(); //mix object parent and child 
		   e.m1();
		   e.m2();
		   System.out.println(e.m3());
		   
	       
	}
}