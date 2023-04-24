package com.test;

import java.util.HashMap;

public class Test {
	
	
	public static void main(String[] args) {
		
		
		String str = "ABC";
	
		
		Test.print(str);
		
	}
	
	
	
	
	public static void print(String input) {
		
		
		HashMap<String, Integer> hm = new HashMap<>();
		
	     	
		for(int i =0;i<input.length();i++) {
	
			for(int j=1;j<input.length()-1;j++) {
				
				
				for(int k=1;k<input.length()-1;k++) {
					
					System.out.print(input.charAt(i));
					System.out.print(input.charAt(j));
					System.out.println(input.charAt(k));
					
					
				}
				
				
				
				
			}
			
			
		}
		
		
		
		
	}
	

}
