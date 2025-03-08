package com.abstraction;

public abstract class Demo { //it is not compulsory to give abstract method in abstract class bcoz it contain non abstract and abstract method
	
	int i; //global var
	
	Demo(){
		 //constructor
	}
	
	public void m1() { //non abstract method
		System.out.println("m1 complete method of demo--normal method mns abstract method");
	}

	public abstract void m2();  //abstract method which is incomplete method.
	
	public abstract String m3();
}
