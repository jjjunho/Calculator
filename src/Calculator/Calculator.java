package Calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 값을 입력하세요 : ");
		int first = sc.nextInt();
		
		System.out.println("연산 기호를 입력하세요. : ");
		String symbol = sc.next();
		
		System.out.println("두번째 값을 입력하세요 : ");
		int second = sc.nextInt();
		
		sc.close();
		
		if (symbol.equals("+")) {
			System.out.println(first + " + " + second + " = " + (first + second));	
		} else if (symbol.equals("-")) {
			System.out.println(first + " - " + second + " = " + (first - second));	
		} else if (symbol.equals("*")) {
			System.out.println(first + " * " + second + " = " + (first * second));	
		} else if (symbol.equals("/")) {
			System.out.println(first + " / " + second + " = " + (first / second));	
		} else {
			System.out.println("사칙연산 기호가 아닙니다.");
		}
		
		
	}
}
