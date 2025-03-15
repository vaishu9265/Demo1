package com.ciq.prgms;
import java.util.Scanner;
public class prgm2 {



	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String str=sc.nextLine();
		String rev="";
		System.out.println("Enter String");
		int len=str.length()
	;
		for(int i=len-1;i>=0;i--) {
			rev= rev+str.charAt(i);
		}

	if(str.equalsIgnoreCase(rev)) {
	System.out.println(str+"Is palindrome");
	}else {
		System.out.println(str+"Is  noy palindrome");	
	}
	}
	}

