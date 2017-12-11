package org.hkz.algorithm.sort;

public class SelectSort {

	public static void main(String[] args) {
		int a[] = SortUtils.getArrays(10);
		System.out.print("排序前的数据 : ");
		SortUtils.print(a);
		System.out.print("排序后的数据 : ");
		a = selectSort2(a);
		SortUtils.print(a);
	}
	/*
	直接选择排序
	*/
	public static int[] selectSort1(int a[]){
		
		for (int i = 0; i < a.length; i ++){
			for (int j = i + 1; j < a.length;j++){
				if (a[j] < a[i]){
					
					SortUtils.swap(a, i, j);
				}
			}
		}
		return a;
	}
	
	/*
	 * 
	 * */
	public static int[] selectSort2(int a[]){
		int index = 0;
		for (int i = 0; i < a.length; i ++){
			index = i;
			for (int j = i + 1; j < a.length;j++){
				if (a[j] < a[index]){
					index = j;					
				}
			}
			if (i != index){
				SortUtils.swap(a, i, index);
			}
		}
		return a;
	}
}
