package activities;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args)
	{
		HashSet<String> hs=new HashSet<String>();
		hs.add("Apple");
		hs.add("Orange");
		hs.add("Banana");
		hs.add("Guava");
		hs.add("Papaya");
		hs.add("Pineapple");
		
		System.out.println("Size of Hashset is "+ hs.size());
		System.out.println("Remove Pineapple "+hs.remove("Pineapple"));
		if(hs.remove("Chikku"))
		{
		System.out.println("Chikku present in the Set ");	
		}
		else
		{
			System.out.println("Chikku Not present in the Set ");	
		}
		System.out.println("Check if Pineapple present in set "+hs.contains("Pineapple"));
		System.out.println("Size of the Updated HashSet "+ hs.size());
	}
}
