package Calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 값을 입력하세요 : ");
		int first = sc.nextInt();
		
		int result = 0;
		int chkVal = 0;
		String strResult = "";
		
		while(true) {
			
			System.out.println("연산 기호를 입력하세요. : ");
			String symbol = sc.next();
			
			if (symbol.equals("quit")) {
				break;
			}
			
			System.out.println("두번째 값을 입력하세요 : ");
			int second = sc.nextInt();
			
//			sc.close();
			
			if (symbol.equals("+")) {
//				System.out.println(first + " + " + second + " = " + (first + second));	
				if (chkVal == 0) {
					result = (first + second);
					strResult = first + " + " + second;
				} else {
					result = (result + second);
					strResult = strResult + " + " + second;
				}
			} else if (symbol.equals("-")) {
//				System.out.println(first + " - " + second + " = " + (first - second));
				if (chkVal == 0) {
					result = (first - second);
					strResult = first + " - " + second;
				} else {
					result = (result - second);
					strResult = strResult + " - " + second;
				}
			} else if (symbol.equals("*")) {
//				System.out.println(first + " * " + second + " = " + (first * second));
				if (chkVal == 0) {
					result = (first * second);
					strResult = first + " * " + second;
				} else {
					result = (result * second);
					strResult = strResult + " * " + second;
				}
			} else if (symbol.equals("/")) {
//				System.out.println(first + " / " + second + " = " + (first / second));
				if (chkVal == 0) {
					result = (first / second);
					strResult = first + " / " + second;
				} else {
					result = (result / second);
					strResult = strResult + " / " + second;
				}
			} else {
				System.out.println("사칙연산 기호가 아닙니다.");
			}
			
			System.out.println(strResult + " = " + result);
			System.out.println("------------------");
			chkVal++;
		}
		
		System.out.println(strResult + " = " + result);
		
	}
}
