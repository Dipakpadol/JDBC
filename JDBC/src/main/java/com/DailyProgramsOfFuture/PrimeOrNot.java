package com.DailyProgramsOfFuture;
import java.util.Scanner;
// A Number is divisible by 1 and itself is called Prime number.
// 0 and 1 is not prime number.

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num=sc.nextInt();
		int count=0;
		
		if(num>1) {
			for(int i=1; i<=num; i++) {
				if(num%i==0) 
					count++;
				
			}
					if(count==2) {
						System.out.println(num+" Is Prime Number");
					}
					else {
						System.out.println(num+" Is Not Prime Number");
					}
			}
		else {
			System.out.println(num+" IS Not Prime");
		}

	}

}
