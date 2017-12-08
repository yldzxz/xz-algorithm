package org.hkz.algorithm.sort;


public class BubbleSort {

	public static void main(String[] args) {
		int [] a = {2,3,3,4,23,22,1};
		a = bubbleSort1(a);
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

	private static void swap(int[] a, int i, int j) {
		int temp = 0;
		temp = a[j];
		a[j]  = a[i];
		a[i] = temp;
	}

}
