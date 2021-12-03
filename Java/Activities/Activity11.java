package activities;

import java.util.HashMap;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer, String> colours=new HashMap<Integer, String>();
colours.put(1, "Blue");
colours.put(2, "Orange");
colours.put(3, "Red");
colours.put(5, "Yellow");
colours.put(4, "White");

System.out.println("Colours "+colours);
System.out.println("Remove Yellow "+ colours.remove("Yellow"));
if (colours.containsValue("Green")) {
	System.out.println("Map contains Green Colour value");
} else {
	System.out.println("Map doesnt contains Green Colour value");
}
System.out.println("Size of Map is "+ colours.size());
	}

}
