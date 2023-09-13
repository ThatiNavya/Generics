package com.typesafty;

public class Test<T> {
	T obj;

	public Test(T obj) {
		this.obj = obj;
	}

	public T getObject() {

		return obj;
	}

	public static void main(String[] args) {
		Test<Integer> t1 = new Test<Integer>(10);
		System.out.println(t1.getObject());
		
		Test<String> t2 = new Test<String>("Navya");
		System.out.println(t2.getObject());

	}

}
