package ua.yunyk;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Scanner s = new Scanner(System.in);
		boolean flag = true;
		
		while(flag) {
			menu();
			VerhovnaRada vr = VerhovnaRada.VerhovnaRada();
			String key = s.next();
			
			switch (key) {
			case "1":
				vr.addFraction();
				break;
			case "2":
				vr.removeFraction();
				break;
			case "3":
				vr.printAllFractions();
				break;
			case "4":
				System.out.println("������ ����� �������");
				String name = s.next();
				Iterator<Fraction> iterator = vr.fractions.iterator();
				while(iterator.hasNext()) {
					Fraction next = iterator.next();
					if(next.getName().equalsIgnoreCase(name)) {
					next.removeAllDeputies();
					}
				}
				break;
			case "5":
				vr.printAllDeputies();
				break;
			case "6":
				vr.addDeputyToFraction();
				break;
			case "7":
				vr.removeDeputyFromFraction();
				break;
			case "8":
				vr.printAllBribeTakers();
				break;
			case "9": 
				vr.printTheLargestBribeTaker();
				break;
			case "10":
				flag = false;
				break;
			default:
				System.out.println("����������� ������� ����� ����");
				break;
			}
		}
		
	}
	
	public static void menu() {
		System.out.println("\n--------------------*------------------");
		System.out.println("������ 1 ��� ������ ������� ");
		System.out.println("������ 2 ��� �������� ��������� �������");
		System.out.println("������ 3 ��� ������� ��  �������");
		System.out.println("������ 4 ��� �������� ��������� �������");
		System.out.println("������ 5 ��� ������� ��������� �������");
		System.out.println("������ 6 ��� ������ �������� � �������");
		System.out.println("������ 7 ��� �������� �������� � �������");
		System.out.println("������ 8 ��� ������� ������ ���������");
		System.out.println("������ 9 ��� ������� ���������� ���������");
		System.out.println("������ 10 ��� �����");
		System.out.println("--------------------*------------------\n");

	}
	
}
