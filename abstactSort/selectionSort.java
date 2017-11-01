package abstactSort;

public class selectionSort extends arraySort {
	
	public void sort(int[] array) {
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
}
