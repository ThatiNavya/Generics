
// Java program with Generic Type to achieve Type Safety
package com.typesafty;

public class TypeSafty<T> {
	T obj;

	public void add(T obj) {
		this.obj = obj;

	}

	T get() {

		return obj;
	}

	public static void main(String[] args) {
		TypeSafty<Integer> t1 = new TypeSafty<>();
		t1.add(10);
		System.out.println(t1.get());

		TypeSafty<String> t2 = new TypeSafty<>();
		t2.add("hi");
		System.out.println(t2.get());

	}

}
