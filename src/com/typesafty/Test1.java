package com.typesafty;

public class Test1<T, U> {
	T obj1;
	U obj2;

	public Test1(T obj1, U obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	public void print() {
		System.out.println(obj1);
		System.out.println(obj2);

	}

	public static void main(String[] args) {
		Test1<String, Integer> obj = new Test1<String, Integer>("Navya", 15);
		obj.print();
	}

}
