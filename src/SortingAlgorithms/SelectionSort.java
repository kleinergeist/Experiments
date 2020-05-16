package SortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {
int []vals;
	
	SelectionSort(int[] vals){
		this.vals = vals;
	}
	
	public int[] sort() {
	int indexMin;
	
		for(int i=0;i<vals.length-1;i++) {
			indexMin=i;
			for (int j=i+1;j<vals.length;j++) {
				if (vals[j]<vals[indexMin]) {
					indexMin = j;
				}
			}
			Swap.swap(vals,indexMin,i);
		}
		//System.out.println(Arrays.toString(vals));
		return vals;
	}
	
//	public static void main(String[] args) {
//		int[] unsorted = {1,4,7,1,35,6,2,3,7,1,3,46,8};
//		SelectionSort ss = new SelectionSort(unsorted);
//		ss.sort();
//	}
	
}
