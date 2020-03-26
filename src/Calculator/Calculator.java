package Calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 값을 입력하세요 : ");
		int first = sc.nextInt();
		
		System.out.println("두번째 값을 입력하세요 : ");
		int second = sc.nextInt();
		
		sc.close();
		
		System.out.println(first + " + " + second + " = " + (first + second));
		System.out.println(first + " - " + second + " = " + (first - second));
		System.out.println(first + " * " + second + " = " + (first * second));
		System.out.println(first + " / " + second + " = " + (first / second));
		
	}
}
