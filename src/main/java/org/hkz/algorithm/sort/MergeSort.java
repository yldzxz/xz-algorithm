package org.hkz.algorithm.sort;

public class MergeSort {

	public static void main(String[] args) {
		int a[] = SortUtils.getArrays(10);
		//int a[] = { 9 ,18 ,7, 10, 1 ,10, 8, 9, 7, 18 };
		System.out.print("排序前的数据 : ");
		SortUtils.print(a);
		System.out.print("排序后的数据 : ");
		mergeSort(a);
		SortUtils.print(a);
	}

	private static void mergeSort(int[] a) {
		int len = a.length;
				
	}
	
	
	
	public static int[] merge(int a[], int[] b ){	
		int alen = a.length;
		int blen = b.length;
		int[] c = new int[alen + blen];
		int i = 0, j = 0,k=0;
		for (; i < alen && j < blen; ){
			if (a[i] < a[j]){
				c[k++] = a[i];
				i++;
			}else {
				c[k++] = a[j];
				j++;
			}
		}
		while (i < alen){
			c[k++] = a[i++];
		}
		while (j < blen){
			c[k++] = a[j++];
		}
		return c;
	}

}
