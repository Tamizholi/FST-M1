package activities;

import java.util.ArrayList;

public class Activity9 {
	public static void main(String[] args)
	{
	ArrayList<String> al=new ArrayList<String>();
	al.add("Tamizholi");
	al.add("CT");
	al.add("CTB");
	al.add("AJV");
	al.add("Arin");
	System.out.println("Names in the ArrayList:");
	for (String string : al) {
		System.out.println(al);
	}
	System.out.println("3rd name in ArrayList "+al.get(2));
	System.out.println("ArrayList contains name Arun : "+al.contains("Arun"));
	System.out.println("Array Size "+al.size());
	al.remove("CT");
	System.out.println("Array Size after removing a name "+al.size());
	}
}
