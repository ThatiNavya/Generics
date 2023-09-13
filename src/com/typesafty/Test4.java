/* Java program to demonstrate that NOT using
 generics can cause run time exceptions*/
package com.typesafty;
import java.util.*;
public class Test4 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add("Navya");
		al.add("Nanditha");
		al.add(10);//we are not specifying any type safety
        
		 String s1=(String) al.get(0);
		 System.out.println(s1);
		 
		 String s2=(String) al.get(1);
		 System.out.println(s2);
		 
		 String s3 =(String)al.get(2);
		 System.out.println(s3);//RE-classCastException
	}

}
