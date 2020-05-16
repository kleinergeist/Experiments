package SortingAlgorithms;

public class MergeSort {
	int[]vals;
	
	MergeSort(int[] vals){
		this.vals = vals;
	}
	
	 public int[] sort(int arr[], int l, int r) 
	    { 
	        if (l < r) 
	        { 
	            // Find the middle point 
	            int m = (l+r)/2; 
	  
	            // Sort first and second halves 
	            sort(arr, l, m); 
	            sort(arr , m+1, r); 
	  
	            // Merge the sorted halves 
	            merge(arr, l, m, r); 
	        } 
	        return vals;
	    }
	
	public void merge(int[] vals, int l, int m, int r) {
		int n1 = m - l + 1; //size of the left array
		int n2 = r - m; //size of the right array
		
		int L[] = new int [n1]; 
		int R[] = new int [n2];
		
		// copy data to temp arrays
		for (int i = 0;i<n1;i++) { 
			L[i] = vals[l+i];
		}
		for (int j=0;j<n2;j++) {
			R[j] = vals[m+1+j];
		}
		
		int i = 0, j = 0;
		
		int k = l;
		
		while(i<n1&&j<n2) {
			 if (L[i] <= R[j]) 
	            { 
	                vals[k] = L[i]; 
	                i++; 
	            } 
	            else
	            { 
	                vals[k] = R[j]; 
	                j++; 
	            } 
	            k++; 
		}
		
		/* Copy remaining elements of L[] if any */
        while (i < n1) 
        { 
            vals[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
            vals[k] = R[j]; 
            j++; 
            k++; 
        } 
		
	}
	
	
	
}
