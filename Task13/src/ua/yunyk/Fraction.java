package ua.yunyk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Fraction implements AddDeputy{
	
	private String name;
	
	public Fraction(String name) {
		super();
		this.name = name;
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return "Fraction [name=" + name + "]";
	}



	List<Deputy> deputies = new ArrayList<>();
	
	public void addDeputy() throws Exception {
		deputies.add(AddDeputy.addDeputy());
	}
	
	public void removeDeputy() {
		deputies.remove(DeputyIndex.deputyIndex(deputies));
	}
	
	public void printAllBribeTakers() {
		Iterator<Deputy> iterator = deputies.iterator();
		int n = 0;
		while(iterator.hasNext()) {
			Deputy next = iterator.next();
			if(next.isBribeTaker()) {
				System.out.println(next);
				n = 1;
			}
		}
		if(n == 0) {
			System.out.println("У фракції немає хабарників");
		}
	}
	
	public void printTheLargestBribeTaker() {
		Iterator<Deputy> iterator = deputies.iterator();
		int max = 0;
		Deputy bribeTaker = null;
		while(iterator.hasNext()) {
			Deputy next = iterator.next();
			if(next.getBribeSize() > max) {
				bribeTaker = next;
			}
		}
		if(max > 0) {
			System.out.println("Найбільший хабарник " + bribeTaker);
		} else {
			System.out.println("У фракції немає хабарників");
		}
	}
	
	public void printAllDeputies() {
		Iterator<Deputy> iterator = deputies.iterator();
		if(deputies.isEmpty()) {
			System.out.println("У фракції немає депутатів");
		} else {
			while(iterator.hasNext()) {
				Deputy next = iterator.next();
				System.out.println(next);
			}
		}
	}
	
	public void removeAllDeputies() {
		Iterator<Deputy> iterator = deputies.iterator();
		if(deputies.isEmpty()) {
			System.out.println("У фракції немає депутатів");
		} else {
			while(iterator.hasNext()) {
				iterator.remove();
			}
		}
	}
}
