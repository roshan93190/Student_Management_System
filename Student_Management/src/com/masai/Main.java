package com.masai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws  IOException {
		System.out.println("Welcome to the app");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		while(true) {
			System.out.println("Press 1 to add Student");
			System.out.println("Press 2 to Update Student");
			System.out.println("Press 3 to Delete Student");
			System.out.println("Press 4 to Get Student");
			System.out.println("Press 5 to Exit");
			
			int c = Integer.parseInt(br.readLine());
			
			if(c==1) {
				
			}
			else if(c==2) {
				
			}
			else if(c==3) {
				
			}
			else if(c==4) {
				
			}
			else if(c==5) {
				break;
			}
			else {
				
			}
		}
		System.out.println("!!! Thank you for using application !!!");
	}

}
