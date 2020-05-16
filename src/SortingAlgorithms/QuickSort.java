package SortingAlgorithms;

public class QuickSort {
	int[] vals;
	int low;
	int high;

	QuickSort(int[] vals){
		this.vals = vals;
		low = 0;
		high = vals.length;
	}
	
	public int partition(int[] vals, int low, int high){
		int pivot = vals[high];
		int i = low - 1;
		
		for(int j=low;j<high;j++) {
			if (vals[j]<pivot) {
				i++;
				
				Swap.swap(vals, j, i);
			}
		}
		Swap.swap(vals, i+1, high);
		
		return i+1;
	}
	
	public int[]sort(int[] vals, int low, int high){
		if (low<high) {
			int pi = partition(vals,low,high);
			sort(vals,low,pi-1);
			sort(vals,pi+1,high);
		}
		return vals;
	}
}
