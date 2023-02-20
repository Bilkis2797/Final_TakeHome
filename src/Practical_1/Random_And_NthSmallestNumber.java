package Practical_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Random_And_NthSmallestNumber {

	public static void main(String[] args) {

		Random rnd = new Random();
		int[] num = new int[500];
		for(int i=0; i<500; i++) {
			num[i] = rnd.nextInt(1000);
		}
		
		Arrays.sort(num);
		
		System.out.println("Enter the value of N to find the Nth smallest number: ");

		Scanner ui = new Scanner(System.in);
		int n = ui.nextInt();
		
		int NthSmallestNum = num[n-1];
		
		System.out.println("The "+n+"th smallest number is: "+NthSmallestNum);
		
	}

}
