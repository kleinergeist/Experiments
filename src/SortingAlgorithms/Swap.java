package SortingAlgorithms;

public class Swap {

	public static void swap(int[]vals,int indexMin, int i) {
		int temp = vals[i];
		vals[i]=vals[indexMin];
		vals[indexMin]=temp;
	}
	
}
