package activities;

public class Activity5 {

	public static void main(String[] args)
	{
		MyBook newNovel=new MyBook();
		String title="Chetan Bhagat";
		//Set title
		newNovel.setTitle(title);

		//Print result
		System.out.println("The title is: " + newNovel.getTitle());
	}
}
