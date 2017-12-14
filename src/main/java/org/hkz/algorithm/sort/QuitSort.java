package org.hkz.algorithm.sort;

public class QuitSort {
	public static void main(String[] args) {
		int a[] = SortUtils.getArrays(10);
		//int a[] = { 16, 5, 3, 4, 2, 1 ,1, 2, 15, 1 };
		System.out.print("排序前的数据 : ");
		SortUtils.print(a);
		System.out.print("排序后的数据 : ");
		quitSort1(a);
		SortUtils.print(a);
	}

	public static void  quitSort1(int[] a) {
		quicksort(a , 0 ,a.length - 1);
		
	}

	public static int sort(int[] a, int start, int end) {
		int index = a[start];
		while (start < end){
			while(start < end && a[end] >= index ){
				end--;
			}
			a[start] = a[end];
			while (start < end && a[start] <= index){
				start++;
			}
			a[end] = a[start];
		}
		a[start] = index; 

		return start;
	}
	
	public static  void quicksort(int[] a, int i, int j){
		
		
		int p;
		if (i < j){
			p = sort(a,i,j);
			
			quicksort(a , i , p-1);
			
			quicksort(a , p+1 , j);
		}
	}
	
	
	
	
}
