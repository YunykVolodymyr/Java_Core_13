package ua.yunyk;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public interface DeputyIndex {
		
	public static int deputyIndex(List<Deputy> deputies) {
		
		Scanner s = new Scanner(System.in);
		Iterator<Deputy> iterator = deputies.iterator();
		
		System.out.print("¬вед≥ть ≥м'€ ");
		String firstName = s.next();
		System.out.print("¬вед≥ть пр≥звище ");
		String lastName = s.next();
		
		while(iterator.hasNext()) {
			Deputy next = iterator.next();
			if((next.getFirsName().equalsIgnoreCase(firstName)) 
				&& (next.getLastName().equalsIgnoreCase(lastName))) 
			{
				return deputies.indexOf(next);
			}
		}
		
		return 0;
	}
	
}
