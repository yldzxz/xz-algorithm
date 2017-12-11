package org.hkz.algorithm.sort;


public class BubbleSort {

	public static void main(String[] args) {
		int [] a = {2,3,3,4,23,22,1};
		a = bubbleSort3(a);
		for (int i = 0; i < a.length; i++){
			System.out.print(a[i]+ " ");
		}
	}
	
	public static int[]  bubbleSort1(int a[]){
		for (int i = 0; i < a.length; i++){		
			for (int j = 1; j < a.length - i ; j++){
				if (a[j] < a[j-1]){
					swap(a,j-1,j);
				}
			}
		}
		return a;
	}
	
	
	/**
	 * 改进的冒泡排序，增加一个flag，如果一趟排序没有发生交换，说明排序已经完成
	 * 
	 * */
	public static int[]  bubbleSort2(int a[]){
		boolean flag = false;
		for (int i = 0; i < a.length; i++){
			flag = false;
			for (int j = 1; j < a.length - i ; j++){
				if (a[j] < a[j-1]){
					flag = true;
					swap(a,j-1,j);
				}
			}
			if (!flag){
				break;
			}
		}
		return a;
	}
	
	/**
	 * 冒泡排序优化，增加一个标志位，确定每次排序的位置
	 * */
	public static int[]  bubbleSort3(int a[]){
		int len= a.length,lenj = a.length;
		boolean flag = false;
		for (int i = 0; i < a.length; i++){
			flag = false;
			for (int j = 1; j < len ; j++){
				if (a[j] < a[j-1]){
					flag = true;
					swap(a,j-1,j);		
				}
			}
			len = lenj;
			if (!flag){
				break;
			}
		}
		return a;
	}
	
	private static void swap(int[] a, int i, int j) {
		int temp = 0;
		temp = a[j];
		a[j]  = a[i];
		a[i] = temp;
	}

}
