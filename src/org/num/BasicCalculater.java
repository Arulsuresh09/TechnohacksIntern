package org.num;

import java.util.Scanner;

public class BasicCalculater {

	public static void main(String[] args) {
		
		int operator,n1,n2;
		
		//choose operator
		System.out.println("Choose Operation");
		System.out.println("1-Addition(+)");
		System.out.println("2-Subration(-)");
		System.out.println("3-Multiplication(*)");
		System.out.println("4-Division(/)");
		Scanner s=new Scanner(System.in);
		operator=s.nextInt();
		
		//Enter 2 number
		System.out.print("Enter number 1: ");
		n1=s.nextInt();
		System.out.print("Enter Number 2: ");
		n2=s.nextInt();
		
		//result
		int result=0;
		
		//enter operation
		switch(operator) {
			
		case 1:
			result=n1+n2;
			break;
			
		case 2:
			result=n1-n2;
			break;
			
		case 3:
			result=n1*n2;
			break;
			
		case 4:
			result=n1/n2;
			break;
			
		default:
			System.out.println("Entered operator is Not Valid please Enter valid operator");
		}
		
		//print result
		System.out.println("your operation result is "+result);
	}
}
