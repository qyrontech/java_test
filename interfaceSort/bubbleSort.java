package interfaceSort;

public class bubbleSort implements Sortable{
	
	public void sort(int[] array) {
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
