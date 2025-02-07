import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();		
	}

	public static void q1() {
		//Write question 1 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String num1;
		num1 = in.nextLine();
		num1 = (5 + num1);
		System.out.print(Integer.parseInt(num1) + 5);
		System.out.println();

		
	}

	public static void q2() {
		//Write question 2 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		String num2;
		num2 = in.nextLine();
		num2 = (4 + num2 +3);
		System.out.print(Double.parseDouble(num2) + 3.4);
		System.out.println();
	}

	public static void q3() {
		//Write question 3 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a boolean: ");
		String trueFalse;
		trueFalse = in.nextLine();
		System.out.print(!Boolean.parseBoolean(trueFalse));
		System.out.println();

		
	}

	public static void q4() {
		//Write question 4 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String num3;
		num3 = in.nextLine();
		num3 =(num3 + 3);
		int result1 = Integer.parseInt(num3) + 2;
		System.out.print((char)result1);
		System.out.println();
	}

	public static void q5() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String num4;
		num4 = in.nextLine();
		num4 = (num4 + 1);
		int result2 = Integer.parseInt(num4)/2;
		System.out.print((double)result2);
		System.out.println();
		
	}

	public static void q6() {
		//Write question 6 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		String num5;
		num5 = in.nextLine();
		num5 = (1+ num5);
		double result3 = Double.parseDouble(num5);
		System.out.print((int)result3);
		System.out.println();
		
	}

}
