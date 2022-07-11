package com.gl.lab2;

import java.util.Scanner;

public class TransactionsMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transactions transaction= new Transactions();
		int transactionArr[];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int size = sc.nextInt();
		transactionArr = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter the transaction value "+(i+1));
			transactionArr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the number of targets to be achieved");
		int noOfTargets = sc.nextInt();
		for(int j=0;j<noOfTargets;j++) {
			System.out.println("Enter the target values");
			int target=sc.nextInt();
			int transactionNumber=transaction.istargetAcheived(transactionArr, target);
			if(transactionNumber==-1) {
				System.out.println("Target not achieved");
			}
			else {
				System.out.println("Target acheive at "+transactionNumber+" transaction");
			}
		} 
		sc.close();
	}

}
