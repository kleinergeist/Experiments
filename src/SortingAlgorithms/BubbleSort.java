package SortingAlgorithms;

public class BubbleSort {
	int[] vals;
	
	BubbleSort(int[] vals){
		this.vals = vals;
	}

	public int[] sort() {
		for(int i=0;i<vals.length-1;i++) {
			for(int j=0;j<i;j++) {
				if (vals[j]>vals[j+1]) {
					Swap.swap(vals,j,j+1);
				}
			}
		}
		
		return vals;
	}
}
