package sorting;

public class QuickSort {
	private String[] theArray;
	private int nElems;

	public QuickSort(int maxSize) {
		theArray = new String[maxSize];
		nElems = 0;
	}

	public void insert(String value) {
		theArray[nElems++] = value;
	}

	public void setArray(String[] arr) {
		this.theArray = arr;
	}

	public void setNelems(int value) {
		this.nElems = value;
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.print(theArray[i] + " ");
		}
		System.out.println();
	}

	public void display2() {
		for (int i = 0; i < nElems; i++) {
			System.out.print(theArray[i] + " ");
			if (i == 300) {
				System.out.print("");
			}
			if (i == 700) {
				System.out.println();
			}
			if (i == 1000) {
				System.out.println();
			}
			if (i == 1300) {
				System.out.println();
			}
			if (i == 1500) {
				System.out.println();
			}
			if (i == 2000) {
				System.out.println();
			}
			if (i == 2300) {
				System.out.println();
			}
			if (i == 2500) {
				System.out.println();
			}
			if (i == 3000) {
				System.out.print("");
			}
			if (i == 3500) {
				System.out.println();
			}
			if (i == 4000) {
				System.out.println();
			}
			if (i == 4500) {
				System.out.println();
			}
			if (i == 5000) {
				System.out.println();
			}
			if (i == 5500) {
				System.out.println();
			}
			if (i == 6000) {
				System.out.println();
			}
			if (i == 6500) {
				System.out.println();
			}
			if (i == 7000) {
				System.out.println();
			}
			if (i == 7500) {
				System.out.println();
			}
			if (i == 8000) {
				System.out.println();
			}
			if (i == 8500) {
				System.out.println();
			}
			if (i == 8700) {
				System.out.println();
			}
			if (i == 9500) {
				System.out.println();
			}
			if (i == 9600) {
				System.out.println();
			}
			if (i == 10000) {
				System.out.println();
			}
		}
		System.out.println();
	}

	public void quickSort() {
		recQuickSort(0, nElems - 1);
	}

	public void recQuickSort(int left, int right) {
		if (right - left <= 0) {
			return;
		} else {
			String pivot = theArray[right];
			int partion = paritionIt(left, right, pivot);
			recQuickSort(left, partion - 1);
			recQuickSort(partion + 1, right);
		}
	}

	public int paritionIt(int left, int right, String pivot) {
		int leftPtr = -1; // starting point on the left
		int rightPtr = right + 1; // starting points on the right

		while (true) {
			while (leftPtr < right && theArray[++leftPtr].compareTo(pivot) < 0) {
				;// nop no operation
			}
			while (rightPtr > left && theArray[--rightPtr].compareTo(pivot) >= 0) {
				; // nop no operation
			}
			if (leftPtr >= rightPtr) {
				break;
			} else {
				swap(leftPtr, rightPtr);
			}
		}
		swap(leftPtr, right);
		return leftPtr;
	}

	public void swap(int dex1, int dex2) {
		String temp = theArray[dex1];
		theArray[dex1] = theArray[dex2];
		theArray[dex2] = temp;
	}
}
