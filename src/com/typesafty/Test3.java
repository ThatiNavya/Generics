package com.typesafty;

public class Test3<T> {
     T obj;
     public Test3(T obj) {
    	 this.obj=obj;
     }
   public T getObject() {
 		
 		return this.obj;
 	}
	public static void main(String[] args) {
		Test3<Integer> t1 = new Test3<Integer>(101);
		System.out.println(t1.getObject());
		
		Test3<String> t2 = new Test3<String>("Jyothsna");
		System.out.println(t2.getObject());

	}
	

}
