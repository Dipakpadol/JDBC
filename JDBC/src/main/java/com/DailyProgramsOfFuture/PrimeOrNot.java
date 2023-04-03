package com.DailyProgramsOfFuture;
// A Number is divisible by Itself and one , This number is called as Prime Number.
// Prime Number--> 2,3,5,7....
// Not-prime Number-->4,6,8,9,10....

import java.util.Scanner;
public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int number=sc.nextInt();
		int count=0;
		
		if(number>1) {
			for(int i=1; i<=number; i++) {
				if(number%i==0) 
					count++;
				
			}
					if(count==2) {
						System.out.println("The Number is Prime : "+number);
					}
					else {
						System.out.println("The Number is Not prime : "+number);
					}
				
		}else {
			System.out.println("Number is Not Prime : "+number);
		}

	}

}
