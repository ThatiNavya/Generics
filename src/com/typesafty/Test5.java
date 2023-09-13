/* Using Java Generics converts run time exceptions into
 compile time exception.*/

package com.typesafty;
import java.util.*;
public class Test5 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
        al.add("Navya");
        al.add("Srilatha");
         //al.add(10);
        
        String s1=al.get(0);
        System.out.println(s1);
        String s2=al.get(1);
        System.out.println(s2);
        
      /*  If we do not use generics, then, 
        in the above example, every time we retrieve data from ArrayList, 
        we have to typecast it. Typecasting at every retrieval operation is a big headache. 
        If we already know that our list only holds string data, 
        we need not typecast it every time.*/
        
       // String s3 =(String)al.get(2);
    }
}
