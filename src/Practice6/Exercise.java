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
		
		//C�u 4:
		System.out.println("Nhap so nguyen duong:");
		int numN1 = scanner.nextInt();

		System.out.println("Tich chu so le cua : " + tichCSL(numN1));
		
		System.out.println("Chu so dau cua so N: " + chuSD(numN1));
		
		System.out.println("So dao nguoc cua so N:");
		soDN(numN1);
		
		System.out.println("Chu so lon nhat trong so N:" + chuSLN(numN1));
		
		//C�u 8:
		System.out.println("Input A:");
		int numA = scanner.nextInt();
		System.out.println("Input B:");
		int numB = scanner.nextInt();

		System.out.println("Uoc so chung lon nhat cua 2 A va B:" + uocSCLN(numA,numB));
		
		boiCNN(numA,numB);
		
	}

	// C�u 1:
	public static float tinhSSoN(int a) {
		float total = 0;
		for (int i = 1; i <= a; i++) {
			total += ((float) i / (i + 1));
		}
		return total;
	}

	// C�u 2:
	public static int tichUSL(int a) {
		int tichUS = 0;
		
		for(int i = 1; i <= a; i++) {
			if(a % i == 0 && i%2 != 0) {
				tichUS = tichUS*i;
			}
		}
		return tichUS;
		}
	
	//C�u 3:
	public static int tongUSN(int a) {
		int total = 0;
		for (int i = 1; i < a; i++) {
			if (a % i == 0) {
				total += i;
			}
		}
		return total;
	}
	
	//C�u 4:
	public static int tichCSL(int a) {
		int tichSL = 1, digit;
		int soLe = 0, soChan = 0;
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
	
	//C�u 5:
	public static int chuSD(int a) {
		int digit = 0;
		while (a > 0) {
			digit = a % 10;
			a = a / 10;
		}
		return digit;		
	}
	
	//C�u 6:
	public static void soDN(int a) {
		int digit = 0;
		while (a > 0) {
			digit = a % 10;
			System.out.print(digit);
			a = a / 10;
		}		
	}
	
	//C�u 7:
	public static int chuSLN(int a) {
		int digit = 0;
		int max = 0;
		while (a > 0) {
			digit = a % 10;
			if(max<digit)
			{
				max=digit;
			}
			a = a / 10;
		}		
		return max;
	}
	
	//C�u 8:
	public static int uocSCLN(int a, int b) {
		int uocSLN = 0;
		int max = 0;
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		for(int i=1;i<max;i++) {
			if(a%i==0&&b%i==0)
			{
				if(i>uocSLN) {
					uocSLN =i ;
				}
			}
		}
		return uocSLN;
	}
	
	//C�u 9:
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
