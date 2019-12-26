package ua.yunyk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class VerhovnaRada {
	
	private static VerhovnaRada verhovnaRada = null;
	List<Fraction> fractions = new ArrayList<>();
	Scanner s = new Scanner(System.in);
	
	private VerhovnaRada(){
		
	}
	
	public static VerhovnaRada VerhovnaRada() {
		
		if(verhovnaRada == null) {
			verhovnaRada = new VerhovnaRada();
		}
		
		return verhovnaRada;
	}
	
	public void addFraction() {
		System.out.println("Введіть назву фракції");
		String name = s.next();
		fractions.add(new Fraction(name));
	}
	
	public void removeFraction() {
		System.out.println("Введіть назву фракції");
		String name = s.next();
		Iterator<Fraction> iterator = fractions.iterator();
		while(iterator.hasNext()) {
			Fraction next = iterator.next();
			if(next.getName().equalsIgnoreCase(name)) {
				iterator.remove();
			}
		}
	}
	
	public void printAllFractions() {
		Iterator<Fraction> iterator = fractions.iterator();
		if(fractions.isEmpty()) {
			System.out.println("У Верховній раді немає фракцій");
		} else {
			while(iterator.hasNext()) {
				Fraction next = iterator.next();
				System.out.println(next);
			}	
		}
	}
	
	public void printFractions() {
		Iterator<Fraction> iterator = fractions.iterator();
		System.out.println("Введіть назву фракції");
		String name = s.next();
		while(iterator.hasNext()) {
			Fraction next = iterator.next();
			if(next.getName().equalsIgnoreCase(name)) {
				System.out.println(next.deputies);
			}
		}	
	}
	
	public void addDeputyToFraction() throws Exception {
		Iterator<Fraction> iterator = fractions.iterator();
		System.out.println("Введіть назву фракції");
		String name = s.next();
			while(iterator.hasNext()) {
				Fraction next = iterator.next();
				if(next.getName().equalsIgnoreCase(name)) {
					next.addDeputy();
				}
			}
	}
	
	public void removeDeputyFromFraction()  {
		System.out.print("Введіть ім'я ");
		String firstName = s.next();
		System.out.print("Введіть прізвище ");
		String lastName = s.next();
		Iterator<Fraction> fractionsIterator = fractions.iterator();
		while(fractionsIterator.hasNext()) {
			Fraction nextFraction = fractionsIterator.next();
			Iterator<Deputy> deputyIterator =  nextFraction.deputies.iterator();
			while(deputyIterator.hasNext()) {
				Deputy nextDeputy = deputyIterator.next();
				if(nextDeputy.getFirsName().equalsIgnoreCase(firstName)
					|| nextDeputy.getLastName().equalsIgnoreCase(lastName)) {
					deputyIterator.remove();
				}
			}
			
		}
	}
	
	public void printAllBribeTakers() {
		System.out.println("Введіть назву фракції");
		String name = s.next();
		Iterator<Fraction> iterator = fractions.iterator();
		while(iterator.hasNext()) {
			Fraction next = iterator.next();
			if(next.getName().equalsIgnoreCase(name)) {
			next.printAllBribeTakers();}
		}
	}
	
	public void printTheLargestBribeTaker() {
		System.out.println("Введіть назву фракції");
		String name = s.next();
		Iterator<Fraction> iterator = fractions.iterator();
		while(iterator.hasNext()) {
			Fraction next = iterator.next();
			if(next.getName().equalsIgnoreCase(name)) {
			next.printTheLargestBribeTaker();
			}
		}
	}
	
	public void printAllDeputies() {
		System.out.println("Введіть назву фракції");
		String name = s.next();
		Iterator<Fraction> iterator = fractions.iterator();
		while(iterator.hasNext()) {
			Fraction next = iterator.next();
			if(next.getName().equalsIgnoreCase(name)) {
			next.printAllDeputies();
			}
		}
	}
	
}
