package com.csc111.finalLab;

import java.util.Scanner;

public class ArrayOps {
	public static void main(String[] args) {
		// creates two arrays of int A & B of size 10
		int[] A = new int[10];
		int[] B = new int[10];
		// prompts the user to fill A & B (-1 to stop filling for each)
		Scanner input = new Scanner(System.in);
		int countA = 0;
		int countB = 0;
		int num = 0;
		
		for(int i=0; i < A.length; i++) {
			System.out.print("Enter A's integer #" + (i+1) + " (-1 to stop): ");
			num = input.nextInt();
			if(num != -1) {
				A[i] = num;
				countA++;
			} else
				i = A.length;
		}
		for(int i=0; i < B.length; i++) {
			System.out.print("Enter B's integer #" + (i+1) + " (-1 to stop): ");
			num = input.nextInt();
			if(num != -1) {
				B[i] = num;
				countB++;
			} else
				i = B.length;
			}
						
		
		// prints the actual size(int) in Arrays (A & B)
		System.out.println("Number of Integers in Array A is " + countA);
		System.out.println("Number of Integers in Array B is " + countB);
		// Creates a third array called C with a suitable size(no extra space) containing both A & B elements
		int ArrayCsize = countA + countB;
		int[] C = new int[ArrayCsize];
		int countC = 0;
		
		// getting all Array A elements
		for(int i = 0; i < countA; i++) {
			C[i] = A[i];
			countC++;
		}
		for(int i = 0; i < countB; i++) {
			C[countC] = B[i];
			countC++;
		}
		System.out.println("Number of Integers in Array C is " + countC);
		// Prints Arrays (A & B & C)
		
		// A
		System.out.print("A = [ ");
		for(int i = 0; i < countA; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println("]");
		//B
		System.out.print("B = [ ");
		for(int i = 0; i < countB; i++) {
			System.out.print(B[i] + " ");
		}
		System.out.println("]");
		
		//C
		System.out.print("C = [ ");
		for(int i = 0; i < countC; i++) {
			System.out.print(C[i] + " ");
		}
		System.out.println("]");
		
		// Prints the sum of the (odd) numbers in array C
		int sum = 0;
		for(int i=0; i < countC; i++) {
			if(C[i] % 2 != 0) {
				sum += C[i];
			}
		}
		System.out.println(sum);
	}
}
