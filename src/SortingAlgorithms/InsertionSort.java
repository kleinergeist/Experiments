package SortingAlgorithms;

public class InsertionSort {

	int[] vals;
	InsertionSort(int[] vals){
		this.vals = vals;
	}
	
	public int[] sort() {
		int n = vals.length;
		for (int i=1;i<n-1;i++) {
			int key = vals[i];
			int j = i-1;
			while(j>=0&&vals[j]>key) {
				vals[j+1]=vals[j];
				j=j-1;
			}
			vals[j+1]=key;
		}
		return vals;
	}
}
