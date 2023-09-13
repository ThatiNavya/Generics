// Java Program with Generic Parameters for Constructor
package com.typesafty;

public class Generic_Constructor<T1, T2> {

	T1 obj1;
	T2 obj2;

	Generic_Constructor(T1 obj1, T2 obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	void print() {
		System.out.println(obj1 + ", " + obj2);
	}

	public static void main(String[] args) throws Exception {
		Generic_Constructor<Integer, String> gc1 = new Generic_Constructor<>(101, "Navya");
		gc1.print();

		Generic_Constructor<String, Long> gc2 = new Generic_Constructor<>("Srilatha", 9678452614l);
		gc2.print();

		Generic_Constructor<String, Boolean> gc3 = new Generic_Constructor<>("Shiva", true);
		gc3.print();
	}
}