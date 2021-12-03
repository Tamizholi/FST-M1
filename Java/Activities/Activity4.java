package activities;

import java.util.Arrays;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] sort= {45,120,56,98,47};
System.out.println("Before Sorting" + Arrays.toString(sort));

for (int i = 1; i < sort.length; i++) {
	
	int key = sort[i];
	int j = i - 1;

	while (j >= 0 && key < sort[j]) {
	    sort[j + 1] = sort[j];
	    --j;
	}
	sort[j + 1] = key;
	}
System.out.println("After Sorting" + Arrays.toString(sort));
}
	}


