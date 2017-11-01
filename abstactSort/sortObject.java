package abstactSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class sortObject {

	public static void main(String[] argvs) {
		
		List<arraySort> list = new ArrayList<>();
		list.add(new bubbleSort());
//		list.add(new selectionSort());
		
		for (arraySort sortable :list) {
			System.out.println("-------------------------------");
			int[] array = randomArray();
			sortable.sort(array);
			sortable.test();
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
