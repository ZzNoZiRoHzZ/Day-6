package Practice6;

import java.util.Scanner;

public class Exercise {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Vui long nhap so N:");
		int numN = scanner.nextInt();

		System.out.println("S(n)= " + tinhSSoN(numN));

		System.out.println("Tich uoc so le cua N: " + tichUSL(numN));

		System.out.println("Tong uoc so chung nho hon N: " + tongUSN(numN));

		// Câu 4:
		System.out.println("Nhap so nguyen duong:");
		int numN1 = scanner.nextInt();

		System.out.println("Tich chu so le cua : " + tichCSL(numN1));

		System.out.println("Chu so dau cua so N: " + chuSD(numN1));

		System.out.println("So dao nguoc cua so N:");
		soDN(numN1);
		System.out.println();

		System.out.println("Chu so lon nhat trong so N:" + chuSLN(numN1));

		// Câu 8:
		System.out.println("Input A:");
		int numA = scanner.nextInt();
		System.out.println("Input B:");
		int numB = scanner.nextInt();

		System.out.println("Uoc so chung lon nhat cua 2 A va B: " + uocSCLN(numA, numB));

		System.out.println("BCNN[A,B]: " + boiCNN(numA, numB));

	}

	// Câu 1:
	public static float tinhSSoN(int a) {
		float total = 0;
		for (int i = 1; i <= a; i++) {
			total += ((float) i / (i + 1));
		}
		return total;
	}

	// Câu 2:
	public static int tichUSL(int a) {
		int tichUS = 1;

		for (int i = 1; i <= a; i++) {
			if (a % i == 0 && i % 2 != 0) {
				tichUS = tichUS * i;
			}
		}
		return tichUS;
	}

	// Câu 3:
	public static int tongUSN(int a) {
		int total = 0;
		for (int i = 1; i < a; i++) {
			if (a % i == 0) {
				total += i;
			}
		}
		return total;
	}

	// Câu 4:
	public static int tichCSL(int a) {
		int tichSL = 1, digit;
		int soLe = 0;
		while (a > 0) {
			digit = a % 10;
			if (digit % 2 != 0) {
				tichSL = tichSL * digit;
				soLe += 1;
			}
			a = a / 10;
		}
		if (soLe == 0) {
			tichSL = tichSL * 0;
		}
		return tichSL;
	}

	// Câu 5:
	public static int chuSD(int a) {
		int digit = 0;
		while (a > 0) {
			digit = a % 10;
			a = a / 10;
		}
		return digit;
	}

	// Câu 6:
	public static void soDN(int a) {
		int digit = 0;
		while (a > 0) {
			digit = a % 10;
			System.out.print(digit);
			a = a / 10;
		}
	}

	// Câu 7:
	public static int chuSLN(int a) {
		int digit = 0;
		int max = 0;
		while (a > 0) {
			digit = a % 10;
			if (max < digit) {
				max = digit;
			}
			a = a / 10;
		}
		return max;
	}

	// Câu 8:
	public static int uocSCLN(int a, int b) {
	while(a%b>0) {
		int temp = a%b;
		a=b;
		b=temp;
	}
	return b;
	
	}

	// Câu 9:
	public static int boiCNN(int a, int b) {

		int bCNN = a * b / uocSCLN(a, b);

		return bCNN;
	}
}
