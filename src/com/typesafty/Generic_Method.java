package com.typesafty;

public class Generic_Method {

	public static<T>void genericDisplay(T element) {
		System.out.println(element.getClass().getName()+"="+element);
	}

	public static void main(String[] args) {
		genericDisplay(101);
		
		genericDisplay("navya");
		
		genericDisplay(25000.0);

	}

	
}
