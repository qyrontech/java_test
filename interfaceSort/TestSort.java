package interfaceSort;

import java.security.Timestamp;

import javax.swing.SortingFocusTraversalPolicy;

public class TestSort {
		private Sortable sorter;

		public Sortable getSortable() {
			return sorter;
		}

		public void setSortable(Sortable sortable) {
			this.sorter = sortable;
		}
		
		public void doSort(int[] array) {
			preAction();
			sorter.sort(array);
			postAction();
		}

		protected void preAction() {
			System.out.println(sorter.getClass());
			System.out.println("begin: " + System.currentTimeMillis());
		}
		
		protected void postAction() {
			System.out.println(sorter.getClass());
			System.out.println("end: " + System.currentTimeMillis());
		}
		
}

