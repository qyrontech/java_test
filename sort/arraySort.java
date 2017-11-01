package sort;

public class arraySort {

	/**
	 * bubbleSort
	 * @param array
	 */
	protected static void bubbleSort(int[] array) {
		Boolean flg;
		for (int i = 0; i < array.length; i++) {
			flg = true;
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					swap(array, j + 1, j);
					flg = false;
				}	
			}
			if (flg) {
				break;
			}
			printArray.print(array);
		}
	}
	
	/**
	 * selection sort
	 * @param array
	 */
	protected static void selectionSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++ ) {
			int min = i;
			
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[min]) {
					min = j;
				}
			}

			if (i != min) {
				swap(array, i, min);
			}
			printArray.print(array);
		}	
	}

	/**
	 * swap number
	 * @param array
	 * @param i
	 * @param j
	 */
	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	protected static void sort(int start, int end, int[] array) {
		if (start < end) {
        	int point = quickSort(start, end, array);
        	sort(start, point - 1, array);
        	sort(point + 1, end, array);
        }
	}

	protected static int quickSort(int start, int end, int[] array) {
		int tmp;
		int k = start - 1;
		int i;
		for (i = start; i < end; i++) {
			if (array[i] < array[end]) {
				k = k + 1;
				swap(array, k, i);
			}
		}
		
		k = k + 1;
		swap(array, k, end);

		printArray.print(array);
		return k;
	}
}
