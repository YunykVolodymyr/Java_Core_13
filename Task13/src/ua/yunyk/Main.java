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
				System.out.println("Введіть назву фракції");
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
				System.out.println("Неправильно введено пункт меню");
				break;
			}
		}
		
	}
	
	public static void menu() {
		System.out.println("\n--------------------*------------------");
		System.out.println("Введіть 1 щоб додати фракцію ");
		System.out.println("Введіть 2 щоб видалити конкретну фракцію");
		System.out.println("Введіть 3 щоб вивести усі  фракції");
		System.out.println("Введіть 4 щоб очистити конкретну фракцію");
		System.out.println("Введіть 5 щоб вивести конкретну фракцію");
		System.out.println("Введіть 6 щоб додати депутата в фракцію");
		System.out.println("Введіть 7 щоб видалити депутата з фракції");
		System.out.println("Введіть 8 щоб вивести список хабарників");
		System.out.println("Введіть 9 щоб вивести найбільшого хабарника");
		System.out.println("Введіть 10 щоб вийти");
		System.out.println("--------------------*------------------\n");

	}
	
}
