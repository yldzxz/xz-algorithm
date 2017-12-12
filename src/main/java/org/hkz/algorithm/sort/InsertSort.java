package org.hkz.algorithm.sort;

public class InsertSort {
	public static void main(String[] args) {
		int a[] = SortUtils.getArrays(10);
		//int a[] = { 9 ,18 ,7, 10, 1 ,10, 8, 9, 7, 18 };
		System.out.print("排序前的数据 : ");
		SortUtils.print(a);
		System.out.print("排序后的数据 : ");
		a = insertSort1(a);
		SortUtils.print(a);
	}

	public static int[] insertSort1(int[] a) {
		int sentry = a[0] ,j=0, k=0;

		for (int i = 1; i < a.length; i++) {
			k =i; j = i;
			sentry = a[j];
			while ( j - 1 >= 0 && a[j - 1] > sentry ) {
				j--;
				a[j+1] = a[j];
			}
			if ( i != j)
				a[j] = sentry;
			
		}
		return a;
	}

}
