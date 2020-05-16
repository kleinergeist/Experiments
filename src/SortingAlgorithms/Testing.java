package SortingAlgorithms;

import java.util.Arrays;

public class Testing {
	private static int[] unsorted = {1,4,7,1,35,6,2,3,7,1,3,46,8};
	
	public static void main(String[] args) {
		
		System.out.println("Unsorted array "+Arrays.toString(unsorted));
		System.out.println();
		
		//==============SELECTIONSORT================================================
		long time = System.currentTimeMillis();
		SelectionSort ss = new SelectionSort(unsorted);
		int[] ssSorted = ss.sort();
		long runningTime = System.currentTimeMillis()-time;
		
		System.out.println("Array sorted with SelectionSort " + Arrays.toString(ssSorted));
		System.out.println("It took "+runningTime+ " ms to run it");
		System.out.println();
		
		//==============BUBBLESORT===================================================
		time = System.currentTimeMillis();
		BubbleSort bs = new BubbleSort(unsorted);
		int[] bsSorted = bs.sort();
		runningTime = System.currentTimeMillis()-time;
		
		System.out.println("Array sorted with BubbleSort " + Arrays.toString(bsSorted));
		System.out.println("It took "+runningTime+ " ms to run it");
		System.out.println();
		
		//==============INSERTIONSORT=================================================
		time = System.currentTimeMillis();
		InsertionSort is = new InsertionSort(unsorted);
		int[] isSorted = is.sort();
		runningTime = System.currentTimeMillis()-time;
		
		System.out.println("Array sorted with InsertionSort " + Arrays.toString(isSorted));
		System.out.println("It took "+runningTime+ " ms to run it");
		System.out.println();
		
		//==============QUICKSORT=====================================================
		time = System.currentTimeMillis();
		QuickSort qs = new QuickSort(unsorted);
		int[] qsSorted = qs.sort(unsorted,0,unsorted.length-1);
		runningTime = System.currentTimeMillis()-time;
		
		System.out.println("Array sorted with QuickSort " + Arrays.toString(qsSorted));
		System.out.println("It took "+runningTime+ " ms to run it");
		System.out.println();
		
		//==============MERGESORT===================================================
		time = System.currentTimeMillis();
		MergeSort ms = new MergeSort(unsorted);
		int[] msSorted = ms.sort(unsorted,0,unsorted.length-1);
		runningTime = System.currentTimeMillis()-time;
		
		System.out.println("Array sorted with MergeSort " + Arrays.toString(msSorted));
		System.out.println("It took "+runningTime+ " ms to run it");
		System.out.println();
	}
}
