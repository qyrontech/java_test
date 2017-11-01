package sort;

import java.util.Random;

public class test {
	public static void main(String[] args) {
//		int[] array = randomArray();
		int[] array  = 
//			{1,2,3,4,5,7,6};
			{10,9,7,2,1,6,5};
//		System.out.print("冒泡排序法：" + "\n");
//		System.out.print(System.currentTimeMillis() + "\n");		
//		arraySort.bubbleSort(array);
//		System.out.print(System.currentTimeMillis() + "\n");
//		System.out.print("选择排序法：" + "\n");
//		System.out.print(System.currentTimeMillis() + "\n");
//		selectionSort.sort(array);
		System.out.print(System.currentTimeMillis() + "\n");
		System.out.print("快速排序法：" + "\n");
		arraySort.sort(0, array.length - 1, array);
		System.out.print(System.currentTimeMillis() + "\n");
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
