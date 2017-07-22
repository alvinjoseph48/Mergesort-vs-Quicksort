package sorting;

public class MergeSort {
	private String[] theArray;
	private int nElems;

	public MergeSort(int max) {
		theArray = new String[max];
		this.nElems = max;
		nElems = 0;
	}

	public void insert(String value) {
		theArray[nElems++] = value;
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
			}if (i == 1300) {
				System.out.println();
			}
			if (i == 1500) {
				System.out.println();
			}
			if (i == 2000) {
				System.out.println();
			}if (i == 2300) {
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

	public void mergeSort() {
		String[] workspace = new String[nElems];
		recMergeSort(workspace, 0, nElems - 1);
	}

	private void recMergeSort(String[] workspace, int lowerBound, int upperBound) {
		if (lowerBound == upperBound) { 
			return; 
		} else {
			int mid = (lowerBound + upperBound) / 2; 
			recMergeSort(workspace, lowerBound, mid); 
			recMergeSort(workspace, mid + 1, upperBound); 
			merge(workspace, lowerBound, mid + 1, upperBound); 
		}
	}

	public void setArray(String[] arr) {
		this.theArray = arr;
	}

	public void setnElems(int nElems) {
		this.nElems = nElems;
	}
	public void merge(String[] workspace, int lowPtr, int highPtr, int upperBound) {
		int j = 0;
		int lowerBound = lowPtr;
		int mid = highPtr - 1;
		int n = upperBound - lowerBound + 1;

		while (lowPtr <= mid && highPtr <= upperBound) {
			if (theArray[lowPtr].compareTo(theArray[highPtr]) < 0) {
				workspace[j++] = theArray[lowPtr++];
			} else {
				workspace[j++] = theArray[highPtr++];
			}
		}

		while (lowPtr <= mid) {
			workspace[j++] = theArray[lowPtr++];
		}
		while (highPtr <= upperBound) { 
			workspace[j++] = theArray[highPtr++];
		}
		for (j = 0; j < n; j++) {
			theArray[lowerBound + j] = workspace[j];
		}
	}


}
