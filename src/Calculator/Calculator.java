package Calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��° ���� �Է��ϼ��� : ");
		int first = sc.nextInt();
		
		int result = 0;
		int chkVal = 0;
		String strResult = "";
		
		while(true) {
			
			System.out.println("���� ��ȣ�� �Է��ϼ���. : ");
			String symbol = sc.next();
			
			if (symbol.equals("quit")) {
				break;
			}
			
			System.out.println("�ι�° ���� �Է��ϼ��� : ");
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
			}  else if (symbol.equals("%")) {
			    if (chkVal == 0) {
			        result = (first % second);
			        strResult = first + " % " + second;
			    } else {
			        result = (result % second);
			        strResult = strResult + " % " + second;
			    }
			else {
				System.out.println("��Ģ���� ��ȣ�� �ƴմϴ�.");
			}
			
			System.out.println(strResult + " = " + result);
			System.out.println("------------------");
			chkVal++;
		}
		
		System.out.println(strResult + " = " + result);
		
	}
}
