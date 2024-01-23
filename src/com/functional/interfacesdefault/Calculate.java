package com.functional.interfacesdefault;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;



public class Calculate {
	
	

	public static void main(String[] args) {
		Adder addi;
		Addition add1;
		
		add1=(int a , int b)->{return a+b;};
		
		addi=()->3.145;
		
		System.out.println("Result value is: "+ addi.getValue());

		System.out.println(add1.add(5, 3));
		
		
		System.out.println("______________For Stream Apis_______");
		
		List<Integer> numList=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		Iterator<Integer> iterator=numList.iterator();
		int sum=0;
		while(iterator.hasNext()) {
			int number=iterator.next();
			
			if(number<10) {
				sum+=number;
			}
		}
		System.out.println("Without Stream Api calling: "+sum);
		
		System.out.println("With ____ Stream Api calling___");
		
		int sumstreamcalling=numList.stream().filter(num->num<10).mapToInt(num->num).sum();
		
		System.out.println("With Stream Api Calling: "+sumstreamcalling);
		
		
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		Iterator<Integer> iterator1=list.iterator();
		
		int sum1=0;
		
		while(iterator1.hasNext()) {
			int number=iterator1.next();
			if(number<10) {
			    sum1+=number;
			}
		}
		System.out.println(sum1);
		
		int sumlist1=list.stream().filter(num->num<10).mapToInt(num->num).sum();
		System.out.println(sumlist1);
		
		
		String str="7435";
		 int answer = 0, factor = 1;
		    for (int i = str.length()-1; i >= 0; i--) {
		        answer += (str.charAt(i) - '0') * factor;
		        factor *= 10;
		    }
		    System.out.println(answer);
		    
		    System.out.println("  : " +getPermutation("abc"));
		    
	}
	
	public static Set<String> getPermutation(String str) {

	    // create a set to avoid duplicate permutation
	    Set<String> permutations = new HashSet<String>();

	    // check if string is null
	    if (str == null) {
	      return null;
	    } else if (str.length() == 0) {
	      // terminating condition for recursion
	      permutations.add("");
	      return permutations;
	    }

	    // get the first character
	    char first = str.charAt(0);

	    // get the remaining substring
	    String sub = str.substring(1);

	    // make recursive call to getPermutation()
	    Set<String> words = getPermutation(sub);

	    // access each element from words
	    for (String strNew : words) {
	      for (int i = 0;i<=strNew.length();i++){

	        // insert the permutation to the set
	        permutations.add(strNew.substring(0, i) + first + strNew.substring(i));
	      }
	    }
	    return permutations;
	  }

}
