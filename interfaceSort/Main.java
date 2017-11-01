package interfaceSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] argvs) {
		
		List<Sortable> arrayList = new ArrayList<>();
		arrayList.add(new bubbleSort());
		arrayList.add(new selectionSort());
		
		TestSort test = new TestSort();
	
		for (Sortable sortable :arrayList) {
			System.out.println("-------------------------------");
			int[] array = randomArray();
//			sortable.sort(array);
			test.setSortable(sortable);
			test.doSort(array);
		}
	}
	
	/**
	 * 生成随机数组
	 * @return
	 */
	protected static int[] randomArray() {
		int[] arr = new int[10];
		Random r = new Random();
		int j;
		  for(int i = 0; i < 10; i++){
		   j = r.nextInt(100);
		   arr[i] = j;
		  }
		return arr;
	}
}
