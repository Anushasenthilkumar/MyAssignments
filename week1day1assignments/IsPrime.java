package week1.week1day1assignments;

import java.io.*;

public class IsPrime {
//	Home Assignment 2: Print if the given number is prime
//
//	Goal: To understand the problem solving, looping and conditional statement
//
//	a) Create a class by name: IsPrime
//	b) Create a main method using shortcut
//	c) Write a logic to find if the given number is prime or not
//	d) Print if it is prime or not

	public static void main (String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.out.println("Enter the number to be verified ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number=Integer.parseInt(br.readLine());
		int flag=0;
		for(int i=2;i<=number/2;i++) {
			if(number%i==0) {
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println(number+" is a Prime number");
		}else {
			System.out.println(number+" is not a Prime number");
		}
		
	}

}
