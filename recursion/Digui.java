package recursion;

import abstactSort.arraySort;

public class Digui {
	public static void main (String[] args) {
		long arrayBegin = System.currentTimeMillis();
//		System.out.println("arrayBegin:" + arrayBegin);
		array();
		long end = System.currentTimeMillis() - arrayBegin;
		System.out.println("arrayRunTinm:" + end);
		
		long recurBegin = System.currentTimeMillis();
//		System.out.println("recurBegin:" + recurBegin);
		recursion();
		long recurEnd = System.currentTimeMillis() - recurBegin;
		System.out.println("recurRunTinm:" + recurEnd);
		
		long iterBegin = System.currentTimeMillis();
		iteration();
		long iterEnd = System.currentTimeMillis() - iterBegin;
		System.out.print("iterRunTinm:" + iterEnd);
	}

	protected static void iteration() {
		int sum = 0;
		int i;
		int a = 1;
		int b = 1;
		for (i = 0; i < 50; i++) {
			if (i < 2) {
				sum = 1;
			} else {				
				sum = a + b;
				a = b;
				b = sum;
			}
		}
		System.out.println("循坏：" + sum);
	}

	protected static void recursion() {
		int sum = 0;
		int i;
		for(i = 0;i < 50; i++) {	
			sum = rabbit(i);
		}
		System.out.println("递归：" + sum);
	}

	protected static int rabbit(int n) {
		if (n < 2) {
			return 1;
		} else {
			return rabbit(n - 2) + rabbit(n - 1);
		}
	}

	/**
	 * 数组
	 */
	protected static void array() {
		int[] arr = new int[50];
		int i;
		for (i = 0; i < 50; i++) {
			if (i < 2) {
				arr[i] = 1;
			}
			else {
				arr[i] = arr[i-1] + arr[i-2];
			}		
		}
		System.out.println("数组：" + arr[49] + " ");
	}
}
