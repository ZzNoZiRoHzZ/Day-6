package Lession6;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input A:");
		int numA = scanner.nextInt();
		System.out.println("Input B:");
		int numB = scanner.nextInt();

		
	}

	public static void boiCNN(int a, int b) {
		int max = 0;
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		if(max%a==0&&max%b==0)
		{
			System.out.println("BCNN[A,B]: "+ max);
		}
		else {
			max=a*b;
			System.out.println("BCNN[A,B]: " + max);
		}
	
	}

}
