package com.typesafty;

public class Demo<T> {
	public void m1(T arg) {
		System.out.println("parameter Recieved:" + arg);

	}

	public static void main(String[] args) {
		Demo t = new Demo();
		t.m1(10);
		t.m1("Hi");
		t.m1("100.1");
		t.m1(true);

	}

}
