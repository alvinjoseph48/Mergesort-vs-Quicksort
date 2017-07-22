
package sorting;

import java.util.Random;

public class Demo {

	public static void main(String[] args) {
		long startTime;
		long endTime;
		String line= "---------------------------------------------------------------------------------------------------------"
				+ "----------------------------------------------------------------------------------------------------------";
		
		String[] arr1 = generateSessionKey(10);
		MergeSort mergeSort1 = new MergeSort(arr1.length);
		mergeSort1.setnElems(10);
		mergeSort1.setArray(arr1);
		startTime = System.nanoTime();
		mergeSort1.mergeSort();
		endTime = System.nanoTime();
		System.nanoTime();
		System.out.println();
		System.out.println("MERGESORTED ARRAY 1 TOOK:  " + (endTime - startTime) + " NANO SECONDS");
		mergeSort1.display();
		
		QuickSort quickSort1 = new QuickSort(arr1.length);
		quickSort1.setArray(arr1);
		quickSort1.setNelems(10);
		startTime = System.nanoTime();
		quickSort1.quickSort();
		endTime = System.nanoTime();
		System.out.println();
		System.out.println("QUICKSORTED ARRAY 1:  " + (endTime - startTime) + " NANO SECONDS " );
		quickSort1.display();
		System.out.println(line);
		
		String[] arr2 = generateSessionKey(100);
		MergeSort mergeSort2 = new MergeSort(arr2.length);
		mergeSort2.setnElems(100);
		mergeSort2.setArray(arr2);
		startTime = System.nanoTime();
		mergeSort2.mergeSort();
		endTime = System.nanoTime();
		System.out.println();
		System.out.println("MERGESORTED ARRAY 2 TOOK:	" + (endTime - startTime) + " NANO SECONDS");
		mergeSort2.display();
		
		QuickSort quickSort2 = new QuickSort(arr2.length);
		quickSort2.setArray(arr2);
		quickSort2.setNelems(100);
		startTime = System.nanoTime();
		quickSort2.quickSort();
		endTime = System.nanoTime();
		System.out.println();
		System.out.println("QUICKSORTED ARRAY 2:	" + (endTime - startTime) + " NANO SECONDS");
		quickSort2.display();
		System.out.println(line);
		System.out.println();
		
		String[] arr3 = generateSessionKey(1000);
		MergeSort mergeSort3 = new MergeSort(arr3.length);
		mergeSort3.setnElems(1000);
		mergeSort3.setArray(arr3);
		startTime = System.nanoTime();
		mergeSort3.mergeSort();
		endTime = System.nanoTime();
		System.out.println("MERGESORTED ARRAY 3 TOOK: " + (endTime - startTime) + " NANO SECONDS");
		mergeSort3.display2();
		System.out.println();

		QuickSort quickSort3 = new QuickSort(arr3.length);
		quickSort3.setArray(arr3);
		quickSort3.setNelems(1000);
		startTime = System.nanoTime();
		quickSort3.quickSort();
		endTime = System.nanoTime();
		System.out.println("QUICKSORTED ARRAY 3:  " + (endTime - startTime) + " NANO SECONDS");
		quickSort3.display2();
		System.out.println(line);
		System.out.println();
	
		String[] arr4 = generateSessionKey(10000);
		MergeSort mergeSort4 = new MergeSort(arr4.length);
		mergeSort4.setnElems(10000);
		mergeSort4.setArray(arr4);
		startTime = System.nanoTime();
		mergeSort4.mergeSort();
		endTime = System.nanoTime();
		System.out.println("MERGESORTED ARRAY 4 TOOK:  " + (endTime - startTime) + " NANO SECONDS");
		mergeSort4.display2();
		System.out.println();
		System.out.println();
		QuickSort quickSort4 =  new QuickSort(arr4.length);
		quickSort4.setArray(arr4);
		quickSort4.setNelems(10000);
		startTime = System.nanoTime();
		quickSort4.quickSort();
		endTime = System.nanoTime();
		System.out.println("QUICKSORTED ARRAY 4:  " + (endTime - startTime) + " NANO SECONDS");
		quickSort4.display2();

		

	}

	public static String[] generateSessionKey(int numbers) {
		String characters = new String("abcdefghijklmnopqrstuvwxyz");
		int n = characters.length();
		int length;
		String result;
		Random r = new Random();
		String[] arr = new String[numbers];
		for (int j = 0; j < numbers; j++) {
			result = new String();
			length = r.nextInt(5) + 1;
			for (int i = 0; i < length; i++) {
				result = result + characters.charAt(r.nextInt(n));
			}
			arr[j] = result;
		}
		return arr;
	}

}
