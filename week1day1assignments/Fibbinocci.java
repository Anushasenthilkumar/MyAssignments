package week1.week1day1assignments;
//
//Home Assignment 1: Print Fibbinocci series for first 11 numbers
//
//0  1  1  2  3  5  8  13  21  34  55  89  144
//
//Goal: To understand the arthimetic operation and loop
//
//a) Create a class by name: Fibbinocci
//b) Create a main method using shortcut
//c) Write a logic to print fibbinocci from 0 to 56

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=-1, num2=1, sum=0;
		for(int i=1;i<=11;i++) {
			sum=num1+num2;
			num1=num2;
			num2=sum;
			System.out.print(sum+" ");
		}
	}

}
